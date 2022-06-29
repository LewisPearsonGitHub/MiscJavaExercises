package com.qa.main;

public class Lion extends Animal {
	
	private boolean hasMane;
	
	public Lion() {
		
	}
	
	public Lion(String colour, String habitat, boolean hasMane) {
		super(colour,habitat);
		this.hasMane = hasMane;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("roar");
	}
	@Override
	public void eat() {
		System.out.println("I eat gazelle");
	}

	@Override
	public String toString() {
		return "Lion [hasMane=" + hasMane + super.toString() + "]";
	}
	
}
