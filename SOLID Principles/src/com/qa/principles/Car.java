package com.qa.principles;

public class Car {
    private String colour;
    private String model;
    
    // constructor
    public Car(String colour, String model, int mileage) {
        this.colour = colour;
        this.model = model;
        
    }

	public Car() {
		// TODO Auto-generated constructor stub
	}

	// getters and setters for colour, model, mileage

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	

    
    
}
