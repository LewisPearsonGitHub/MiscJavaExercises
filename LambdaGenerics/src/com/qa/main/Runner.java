package com.qa.main;

public class Runner {

	public static <T> void printArray(T[] elements) {
		for (T element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		Character[] charArray = { 'J', 'A', 'V', 'A', 'T', 'P', 'O', 'I', 'N', 'T' };

		System.out.println("print integer array");
		printArray(intArray);

		System.out.println("Print character array");
		printArray(charArray);

	}
}
