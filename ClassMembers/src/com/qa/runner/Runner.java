package com.qa.runner;
import com.qa.spfl.Spfl;

public class Runner {

	public static void main(String[] args) {
		
	Spfl aberdeen = new Spfl("Pittodrie", 1903);
	Spfl hibernian = new Spfl("Lee Johnson", "Easter Road", 6, 1888);
	System.out.println(aberdeen.toString());
	System.out.println(hibernian.toString());
	

	}

}
