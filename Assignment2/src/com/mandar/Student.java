package com.mandar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	
	int id;
	String name;
	int age;
	String doj;
	

	public Student(int id, String name, int age, String doj) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.doj = doj;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getDoj() {
		return doj;
	}



	public void setDoj(String doj) {
		this.doj = doj;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", doj=" + doj + "]";
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Mandar",25, "17/8/22");
		Student s2 = new Student(2,"John",20, "17/10/23");
		Student s3 = new Student(3,"Sally",24, "20/6/22");
		
		List<Student> studentArrayList = new ArrayList<>();
		
		studentArrayList.add(s1);
		studentArrayList.add(s2);
		studentArrayList.add(s3);
		
		Collections.sort(studentArrayList, new NameComparator());
		
		Iterator<Student> studentIterator = studentArrayList.iterator();
		
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}
	}	

}

class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
