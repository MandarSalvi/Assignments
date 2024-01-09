package com.mandar;

import java.util.ArrayList;
import java.util.List;

public class EmptyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> elements = new ArrayList<>();
		
		elements.add(1);
		elements.add(2);
		elements.add(3);
		elements.add(4);
		elements.add(5);
		
		if(elements.isEmpty()) {
			System.out.println("ArrayList is empty!!");
		}else {
			System.out.println("ArrayList is not empty");
		}

	}

}
