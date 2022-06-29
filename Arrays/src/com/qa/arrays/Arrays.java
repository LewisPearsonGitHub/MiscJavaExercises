package com.qa.arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Arrays {

	public static void main(String[] args) {
//		int[] testArray = {1,2,3,4,5,6,7,8,9,10};
//		for (int i=0;i<testArray.length;i++) {
//		System.out.println(testArray[i]);
//		}
//		int[] testArray2= new int[25];
//		
//		for (int i=0;i<25;i++) {
//			testArray2[i] = i+1;
//			System.out.println(testArray2[i]);
//		}
//		for (int i=0;i<25;i++) {
//			testArray2[i] = testArray2[i]*10;
//			System.out.println(testArray2[i]);
//		}
//	}
//
//		for (int i=0;i<25;i++) {
//			System.out.println(testArray2[i]);
//		}
//		
//		numbers(11);

	
	List<String> cities = new ArrayList<>();
	cities.add("Edinburgh");
	cities.add("Aberdeen");
	cities.add("Stirling");
	cities.add("Inverness");
	System.out.println("Initial list   " + cities);
	int j=0;
	for (String i : cities) {
		j++;
		System.out.println("Printing iteratively:   " + "("+j+")" + i);
		
	}
	cities.set(2, "Perth");
	System.out.println("Stirling swapped with Perth    " + cities);
	cities.add("Glasgow");
	System.out.println("Glasgow added    " + cities);
	cities.remove(4);
	System.out.println("Glasgow removed    " + cities);
	Collections.sort(cities);
	System.out.println("Sorting the list    " + cities);
	Collections.swap(cities, 3, 0);
	System.out.println("Swapping index 3 with index 0    " + cities);
	Collections.reverse(cities);
	System.out.println(cities);
	cities.remove(0);
	System.out.println(cities);
	
	cities.clear();
	System.out.println(cities);
	
	
	
		
	
	}
//		
//		
//	
//	public static void numbers(int num) {
//		String number = String.valueOf(num);
//		char[] digits1 = number.toCharArray();
//		int[] digits2 = new int [2];
//		
//		for (int i=0; i< digits1.length;i++) {
//			System.out.println(digits1[i]);
//			digits2[i] = Character.getNumericValue(digits1[i]); 
//		}
//		
//		System.out.println(digits2[0]+digits2[1]);

	
	
	
	
	
	//}
	
}
