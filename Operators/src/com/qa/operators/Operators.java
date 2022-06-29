package com.qa.operators;
public class Operators {
	
	public 	int int1;
	public int int2;
	
	public double dub1;
	public double dub2;
	
	public static String answer;
	
	public Operators() {
		
	}
	
	public Operators(int int1, int int2, double dub1, double dub2) {
		this.int1 = int1;
		this.int2 = int2;
		this.dub1= dub1;
		this.dub2 = dub2;
		}
	
	
	
	public int multi(int int1, int int2) {
		return int1 * int2;
	}
	
	public int sub(int int1, int int2) {
		return int1 - int2;
	}
	public int division(int int1, int int2) {
		return int1 / int2;
	}
	public static Double division1(double dub1, double dub2) {
	if (dub1 < dub2) {
	double answer = (dub1 / dub2);
	return answer;
	} else {
		System.out.println("This division cannot be performed.");
	}
	return 0.0;
	}
	
	
	
	
	
	
	
}
