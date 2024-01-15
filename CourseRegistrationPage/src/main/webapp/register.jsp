<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Registration Form</title>
</head>
<body>
	<form action="regForm" method="post">
		<h1>Course Registration Page</h1>
		<table>
			<tr>
				<td><label>Course Id :</label></td>
				<td><input type="number" name="course_id" required="required"/></td>
			</tr>
			
			<tr>
				<td><label>Course Name :</label></td>
				<td><input type="text" name="course_name" required="required"/></td>
			</tr>
			
			<tr>
				<td><label>Course Details :</label></td>
				<td><textarea rows="5" cols="40" name="course_details" required="required"></textarea></td>
			</tr>
			
			<tr>
				<td><label>Joining Date :</label></td>
				<td><input type="date" name="joining_date" required="required"/></td>
			</tr>
			
			<tr>
				<td><label>Budget :</label></td>
				<td>
					<select name="budget">
						<option>Select</option>
						<option>1000-2000</option>
						<option>2000-3000</option>
						<option>3000-4000</option>
						<option>4000-5000</option>
					</select> 
				</td>
			</tr>
			
			<tr>
				<td><label>Courses :</label></td>
				<td>
					<input type="checkbox" name="courses" value="Java"/> Java
					<input type="checkbox" name="courses" value="Python"/> Python
					<input type="checkbox" name="courses" value="C#"/> C#
					<input type="checkbox" name="courses" value="AWS"/> AWS
				</td>
			</tr>
			
			<tr>
				<td></td>
				
				<td>
					<input type="submit" value="Register"/>
					<input type="reset" value="Reset"/>
				</td>
			</tr>
			
		</table>
		
	</form>
	 
</body>
</html>