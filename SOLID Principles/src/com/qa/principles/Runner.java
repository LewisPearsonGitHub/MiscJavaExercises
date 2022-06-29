package com.qa.principles;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Driver newObj1 =  new Driver();
		newObj1.drive(5);
		System.out.println(newObj1.getMileage());
		
		Mechanic MOT = new Mechanic();
		MOT.motNeeded(21);
	}

}
