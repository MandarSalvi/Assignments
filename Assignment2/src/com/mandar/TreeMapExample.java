package com.mandar;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Map<Integer, String> elements = new TreeMap<>();
		
		elements.put(1, "Mandar");
		elements.put(2, "ganesh");
		elements.put(3, "ram");
		elements.put(4, "sita");
		elements.put(5, "sally");
		
		System.out.println(elements);
		
		System.out.println("Enter Key : ");
		int key = scanner.nextInt();
		
		if(elements.containsKey(key)) {
			System.out.println("The Tree Map Contains Key : " + key);
		}else {
			System.out.println("The Tree Map does not contain Key : " + key);
		}
		
		scanner.close();

	}

}
