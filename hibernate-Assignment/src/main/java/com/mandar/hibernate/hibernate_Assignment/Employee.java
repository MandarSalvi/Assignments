package com.mandar.hibernate.hibernate_Assignment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String employeeName;
	private String employeeQualification;
	@ManyToOne
	@JoinColumn(name = "departmentId")
	private Department department;
	
	public Employee() {
		super();
	}

	public Employee(String employeeName, String employeeQualification, Department department) {
		super();
		this.employeeName = employeeName;
		this.employeeQualification = employeeQualification;
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeQualification() {
		return employeeQualification;
	}

	public void setEmployeeQualification(String employeeQualification) {
		this.employeeQualification = employeeQualification;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	

}
