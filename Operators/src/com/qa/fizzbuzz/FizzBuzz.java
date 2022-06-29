package com.qa.fizzbuzz;

public class FizzBuzz {
	public int num;
	
	
	public FizzBuzz(){
		
	}
	
	public FizzBuzz(int num) {
		this.num = num;
		}
	
	
	public int fbDivide(int num) {
		if (num % 3 == 0 && num%5==0) {
			System.out.println("FizzBuzz");
			}
		else if (num % 5 == 0) {
			System.out.println("Buzz");
		}
		else if (num % 3 ==0){
			System.out.println("Fizz");
		}
		else {
			System.out.println(num);
		}
		return 0;
}
}