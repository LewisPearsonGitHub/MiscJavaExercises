package com.qa.principles;

public class Mechanic {
	private int timeSinceMOT;
	
	
	public void motNeeded(int timeSinceMOT) {
		if (timeSinceMOT > 20) {
			System.out.println("MOT Needed");
		} else {
			System.out.println("MOT Not Needed");
		}
	}
}
