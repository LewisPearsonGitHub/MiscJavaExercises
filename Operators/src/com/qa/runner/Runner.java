package com.qa.runner;

import com.qa.operators.Operators;
import com.qa.blackjack.BlackJack;
import com.qa.fizzbuzz.*;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Operators operators = new Operators();
//		System.out.println(operators.multi(1, 1));
//		Operators operators2 = new Operators();
//		System.out.println(operators2.sub(1, 1));
//		Operators operators3 = new Operators();
//		System.out.println(operators3.division(1, 1));
//		System.out.println(Operators.division1(1, 1));

		Operators operators = new Operators();
		Operators.division1(0, 0);

		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.fbDivide(5);

		BlackJack blackJack = new BlackJack();
		blackJack.blackJack(21, 12);
	}

}
