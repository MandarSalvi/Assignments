package com.mandar;

import java.util.ArrayList;
import java.util.List;

public class CopyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> firstArrayList = new ArrayList<>();
		firstArrayList.add("Mandar");
		firstArrayList.add("John");
		firstArrayList.add("Mary");
		firstArrayList.add("sally");
		
		List<String> secondArrayList = firstArrayList;
		
		System.out.println("Elements of secondArrayList copied from firstArrayList are:-");
		
		for(String elements:secondArrayList) {
			System.out.println(elements);
		}

	}

}
