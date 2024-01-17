package com.mandar.hibernate.hibernate_Assignment;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Department department = new Department();
		department.setDepartmentName("Clover");
		
		Employee emp1 = new Employee("Mandar", "MCA" , department);
		Employee emp2 = new Employee("Sally", "BCA" , department);
		Employee emp3 = new Employee("John", "BE" , department);
		
		List<Employee> emp = new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		
		department.setEmployee(emp);
		
		session.beginTransaction();
		session.save(department);
		session.getTransaction().commit();
	}
}
