package com.qa.principles;


public class Driver {
    private int mileage;
    
    
    public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
    // functionality
    public void drive(int milesDriven){
        this.setMileage(this.getMileage() + milesDriven);
    }
}
