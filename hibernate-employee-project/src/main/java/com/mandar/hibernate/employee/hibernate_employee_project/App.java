package com.mandar.hibernate.employee.hibernate_employee_project;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String dob = "1998-03-25";
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Employee.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Employee firstEmployee = new Employee();
		firstEmployee.setEmployeeId(1);
		firstEmployee.setEmployeeName("Mandar");
		firstEmployee.setEmployeeAge(26);
		firstEmployee.setEmployeeSalary(17500);
		firstEmployee.setDob(Date.valueOf(dob));
		
		session.beginTransaction();
		session.save(firstEmployee);
		session.getTransaction().commit();
		
		System.out.println("Employee saved....Check DB");
	}
}
