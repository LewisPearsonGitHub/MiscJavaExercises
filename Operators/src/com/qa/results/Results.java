package com.qa.results;

public class Results {
	public int physics;
	public int chemistry;
	public int biology;
	public int total;
	public float percentage;

	public static void main(String[] args) {
		int physics = 80;
		int chemistry = 80;
		int biology = 150;
		int total = physics + chemistry + biology;
		float percentage = 0;
		int classesfailed = 0;
		method1(physics, chemistry, biology, total);
		method2(percentage, total, physics, biology, chemistry, classesfailed);
	}

	public static void method1(int physics, int chemistry, int biology, int total) {
		System.out.println("EXAM RESULTS \n============\nPhysics result = " + physics + "/150.");
		System.out.println("Chemistry result = " + chemistry + "/150.\nBiology result = " + biology + "/150.");
		System.out.println("\nTotal result is " + total + "/450.");
	}

	public static void method2(float percentage, int total, int physics, int chemistry, int biology,
			int classesfailed) {
		percentage = (total * 100) / 450;
		if (biology < 90) {
			classesfailed++;
		}
		if (physics < 90) {
			classesfailed++;
		}
		if (chemistry < 90) {
			classesfailed++;
		}

		if (percentage >= 60 && physics >= 90 && chemistry >= 90 && biology >= 90) {
			System.out.println(
					"This gives an overall percentage of " + percentage + "%. Congratulations, you've passed!");
		} else {
			System.out.println("You failed. You only got an overall percentage of " + percentage + "%");
			System.out.println("\nAdditonally. you failed " + classesfailed + " classes.");
		}

	}
}
