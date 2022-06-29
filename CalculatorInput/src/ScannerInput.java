import java.util.Scanner;

public class ScannerInput {
	Scanner scan = new Scanner(System.in);
	
	public void askForInput() {
	
	System.out.println("Which calculator method do you wish to use? (+,-,*,/)");
	String operator = scan.nextLine();
	
	System.out.println("Input number 1");
	int num1 = scan.nextInt();
	
	System.out.println("Input number 2");
	int num2 = scan.nextInt();
	
	
	System.out.println("The answer is\n========");
	if (operator.equals("+")) {
		System.out.println(num1 + num2);
	} else if (operator.equals("-")) {
		System.out.println(num1 - num2);
	} else if (operator.equals("*")) {
		System.out.println(num1 * num2);
	} else if (operator.equals("/")) {
		System.out.println(num1 / num2);
	}
	
	
	switch(operator) {
	case "+": 
	}
}
}