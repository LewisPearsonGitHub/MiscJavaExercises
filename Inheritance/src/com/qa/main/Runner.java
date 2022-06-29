package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal someAnimal = new Animal("Colour","Habitat");
		System.out.println(someAnimal);
		someAnimal.makeNoise();
		someAnimal.eat();
		
		Cat cat = new Cat("Black","House", 4);
		System.out.println(cat);
		cat.makeNoise();
		cat.eat();
		
		Lion lion = new Lion("Yellow-Gold","Savannah", true);
		System.out.println(lion);
		lion.makeNoise();
		lion.eat();
	}

}
