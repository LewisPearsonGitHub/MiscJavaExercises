package com.qa.abstraction;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pasta newObj = new Pasta();
		newObj.getString();
		FruitVeg newObj2 = new FruitVeg();
		newObj2.getString();
		Object newObj3 = new Pasta();
		((Pasta) newObj3).getString();
	}

}
