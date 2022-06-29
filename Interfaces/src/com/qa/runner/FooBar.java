package com.qa.runner;

public class FooBar implements InterfaceOne, InterfaceTwo, InterfaceThree {
	public void foo() {
		System.out.println("Some text....");
	}

	public void bar() {
		System.out.println("Some other text....");
	}
	public void three() {
		System.out.println("using a method from a third interface");
	}
}
