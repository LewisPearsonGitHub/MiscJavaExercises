package com.qa.blackjack;

public class BlackJack {
	public int int1;
	public int int2;

	public static int blackJack(int int1, int int2) {

		if (int1 > 0 || int2 > 0) {
			if (int1 > int2 && int1 <= 21) {
				System.out.println(int1);
			} else if (int2 > int1 && int2 <= 21) {
				System.out.println(int2);
			} else if (int1 > 21 && int2 > 21) {
				System.out.println(0);
			} else if (int1 > 21) {
				System.out.println(int2);
			} else {
				System.out.println(int2);
			}
		} else {
			System.out.println("Neither value greater than 0.");
		}
		return 0;
	}
}
