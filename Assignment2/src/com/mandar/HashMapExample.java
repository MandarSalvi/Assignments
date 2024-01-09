package com.mandar;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> students = new HashMap<>();
		
		students.put("1", "Mandar");
		students.put("2", "John");
		students.put("3", "Hulk");
		students.put("4", "Ram");
		students.put("5", "sita");
		
//		System.out.println(students);
		
		for (Map.Entry<String,String> entry : students.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
    } 

}
