package com.qa.enhanced;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> cities = new ArrayList<>();
//		cities.add("Edinburgh");
//		cities.add("Aberdeen");
//		cities.add("Stirling");
//		cities.add("Inverness");
//	
//		for (String i : cities) {
//		System.out.println("Printing iteratively:   " + i);
//			
//		}
//		
		List<Integer> nums = new ArrayList<>();
			
		for (int j=0; j<20;j++) {
			nums.add(j+1);
		}
		
		System.out.println("Nums ArrayList " + nums);
	
		for (Integer i : nums) {
			System.out.println(i*i);
			
			
		}
		for (Integer i : nums) {
			ex3(i);
			
		}
		
	}
		public static void ex3(int input) {
			if (input%2==0 || input==0) {
				System.out.println(input + " the input is even -> " + input*input*input);
			} else if (input%2!=0){
				System.out.println(input + " the input is odd -> " + input*input);
			}
		}
	}


