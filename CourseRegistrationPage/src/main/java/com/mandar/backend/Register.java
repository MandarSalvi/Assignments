package com.mandar.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		int courseId = Integer.parseInt(req.getParameter("course_id"));
		String courseName = req.getParameter("course_name");
		String courseDetails = req.getParameter("course_details");
		String joiningDate = req.getParameter("joining_date");
		Date date = Date.valueOf(joiningDate);
		String budget = req.getParameter("budget");
		String courses = req.getParameter("courses");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","admin");
			
			PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?,?)");
			ps.setInt(1, courseId);
			ps.setString(2, courseName);
			ps.setString(3, courseDetails);
			ps.setDate(4, date);
			ps.setString(5, budget);
			ps.setString(6, courses);
			
			int count = ps.executeUpdate();
			if(count>0) {
				resp.setContentType("text/html");
				out.println("<h3 style='color:green'> User Registered Successfully </h3>");
				out.println("<p> <strong> Course Id : </strong>" + courseId + "</p>");
				out.println("<p> <strong> Course Name : </strong>" + courseName + "</p>");
				out.println("<p> <strong> Course Details : </strong>" + courseDetails + "</p>");
				out.println("<p> <strong> Joining Date : </strong>" + date + "</p>");
				out.println("<p> <strong> Budget : </strong>" + budget + "</p>");
				out.println("<p> <strong> Courses : </strong>" + courses + "</p>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/success.jsp");
				rd.include(req, resp);
			}else {
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'> User not Registered due to some error </h3>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			}
		}catch(Exception e) {
			e.printStackTrace();
			
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'> Exception Occured : " +e.getMessage()+ "</h3>");
			
			RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
			rd.include(req, resp);
		}
	}

}
