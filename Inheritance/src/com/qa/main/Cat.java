package com.qa.main;

public class Cat extends Animal{
	
	private int legs;
	
	public Cat() {
		super();
	}
	
	public Cat(String colour, String habitat, int legs) {
		super(colour, habitat);
		this.legs = legs;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("meow");
	}
	@Override
	public void eat() {
		System.out.println("I eat cat food");
		}

	@Override
	public String toString() {
		return "Cat [legs=" + legs + super.toString() + "]";
	}
	
	
	
	
}
