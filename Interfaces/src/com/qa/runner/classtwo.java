package com.qa.runner;

public class classtwo implements InterfaceOne, InterfaceTwo, InterfaceThree{

	@Override
	public void three() {
		// TODO Auto-generated method stub
	System.out.println("class two output three");
	}

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		System.out.println("foo from class two");
	}

	@Override
	public void bar() {
		// TODO Auto-generated method stub
	System.out.println("bar class two");	
	}
	

}
