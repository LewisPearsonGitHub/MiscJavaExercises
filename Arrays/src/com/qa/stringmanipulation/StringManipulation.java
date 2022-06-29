package com.qa.stringmanipulation;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "today it is sunny";
		String second = "yesterday it was raining";
		String firstUp = first.toUpperCase();
		String secondUp = second.toUpperCase();
		System.out.println(firstUp + ", " + secondUp);

		System.out.println(first.substring(0, 6).toUpperCase() + second.substring(10).toUpperCase());

//		System.out.println(first.substring(6,12));
//		countWord(first+second);
//		vertical(first + " " + second);
		vertical2(first + " " + second);
	}

	public static void countWord(String input) {
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i + 1).equals(" ")) {
				count = count + 1;
			}
		}
		System.out.println("There are " + (count + 1) + " words");

	}

	public static void vertical(String input) {
		int k = 0;
		for (int i=0;i<input.length();i++) {
			if (input.substring(i,i+1).equals(" ")) {
				System.out.println(input.substring(k,i));
				k = i+1;
			}  else if (i==input.length()-1){
				System.out.println(input.substring(k,i+1));
			}
		}
	}
	public static void vertical2(String input) {
		int k = 0;
		for (int i=input.length();i>0;i--) {
			System.out.println(i + " "+k+" ");
			if (input.substring(i-1,i).equals(" ")) {
				System.out.println(input.substring((input.length()-k),input.length()-i));
				k = input.length()-i;
			}  
		}
	}
}
