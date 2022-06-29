package com.qa.iteration;

public class Iteration {

	public static void main(String[] args) {
	//	 Flowchart 1
		for (int A = 100; A < 200; A++) {
			System.out.println(" A ");
		}

	//	 Flowchart 2
		for (int A = 100; A<=200; A++) {
			if (A%2==0) {
				System.out.println(A + " - ");
			} else {
				System.out.println(A + " * ");
			}
		}

		// 3.
		for (int i = 1; i<=10;i++) {
			for (int j=1;j<=10;j++) {
				System.out.println(j);
				
			}
		}

		// 4.

		int A=100;
		boolean enoughAs = true;
		
		while(enoughAs) {
			System.out.println(A + " A ");
			A++;
			
			if (A>200) {
				enoughAs = false;
			}
		}
		
		int A1=100;
		boolean enoughAs1= true;
		
		while(enoughAs1) {
			if (A1%2==0) {
				System.out.println(A1+ " -");
			}
				else {
					System.out.println(A1+ " * ");
				}
			A1++;
			if (A1 >200){
				enoughAs1 =false;
			}
		}
		
		int i = 1;
		boolean enoughIs = true;
		
		while(enoughIs) {
			int j =1;
			boolean enoughJs=true;
			
			while (enoughJs) {
				System.out.println(j);
				j++;
				if (j>10) {
					enoughJs = false;
				}
			}
			i++;
			if (i>10) {
				enoughIs = false;
			}
		}

		// 5.
		for (int i2=1; i2<=10;i2++) {
			for (int j=1;j<=i2;j++) {
				System.out.println(i2);
				
			}
		}
		

	}
}
