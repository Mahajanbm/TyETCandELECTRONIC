package com.constructor.demo;

public class Parent {
	public Parent() {
		System.out.println("Parent class constructor");
	}
	public Parent(int a) {
		this();
		System.out.println("Parent class  parameterized constructor");
	}
	

}
