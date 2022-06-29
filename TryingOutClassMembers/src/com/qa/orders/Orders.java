package com.qa.orders;

public class Orders {
	// Set Attributes
	private String orderName;
	private String productName;
	private int orderID;
	
	//Constructors
	public Orders() {
		
	}
	
	public Orders( String orderName, String productName, int orderID) {
		this.orderName = orderName;
		this.productName = productName;
		this.orderID = orderID;		
	}

	//Getters and Setters
	public String getOrderName() {
		return orderName;
	}
	
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	
	//toString 
	@Override
	public String toString() {
		return "Orders [orderName=" + orderName + ", productName=" + productName + ", orderID=" + orderID + "]";
	}
	
	// Method 1 
	
	public void message() {
		System.out.println("First message to display");
	}
	// Method 2 
	
	public void message1() {
		System.out.println("This is the second message to display");
	}
		
}