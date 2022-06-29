package com.qa.main;

public class Animal {
	
	private String colour;
	private String habitat;
	
	public Animal() {
		
	}
	
	public Animal(String colour, String habitat) {
		super();
		this.colour = colour;
		this.habitat = habitat;
	}
	
	
	public void makeNoise() {
		System.out.println("An animal makes a noise");
	}
	public void eat() {
		System.out.println("An animal eats food");
	}

	@Override
	public String toString() {
		return "Animal [colour=" + colour + ", habitat=" + habitat + "]";
	}


}
