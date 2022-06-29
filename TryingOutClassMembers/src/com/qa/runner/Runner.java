package com.qa.runner;

import com.qa.orders.Orders;

public class Runner {

	public static void main(String[] args) {
		//Creating an order object
		Orders ord= new Orders();
		Orders personOne = new Orders("Car","Ford Focus",1);
		
		//Printing individual values
		System.out.println(personOne.getOrderID());
		System.out.println(personOne.getOrderName());
		System.out.println(personOne.getProductName());
		
		
		//printing out the values for two orders
		
		System.out.println(ord);
		System.out.println(personOne);
		ord.setOrderID(2);
		ord.setOrderName("Car");
		ord.setProductName("Dodge Viper");
		
		
		System.out.println(ord);
		
	
		
		
		
	}

}
