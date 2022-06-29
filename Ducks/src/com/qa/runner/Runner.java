package com.qa.runner;

import com.qa.ducks.Ducks;

public class Runner {

	public static void main(String[] args) {
		Ducks duck1 = new Ducks();
		System.out.println(duck1.getHabitat());
		Ducks duck2 =  new Ducks("pond","10 year","bear","Duck",20);
		
		System.out.println(duck2);
		
	}

}
