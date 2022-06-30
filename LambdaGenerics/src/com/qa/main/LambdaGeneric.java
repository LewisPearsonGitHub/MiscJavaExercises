package com.qa.main;

import java.util.ArrayList;

public class LambdaGeneric {

	
	public static <T> void printArrayList(ArrayList<T> elements) {
//		for (T element: elements) {
//			System.out.println(element);
//		}
		
		elements.forEach(n -> System.out.println(n));
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("A");
		stringList.add("B");
		stringList.add("C");
		
		System.out.println("print integer array");
		printArrayList(intList);
		
		System.out.println("Print string array");
		printArrayList(stringList);
		
		
	}

}
