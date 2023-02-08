package com.constructor.demo;

public class Child  extends Parent{

	public Child() {
		super(50);
		System.out.println("Child class Constructor");
	}


	public Child(int a)
	{
		this();

		System.out.println("Child Class Parameterized Constructor");
	}
}
