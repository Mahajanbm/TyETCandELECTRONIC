package com.demo.abstractdemo;

public interface I1 {
	public    void demo();
	static void demo1()
	{
		System.out.println("Static method");

	}
	default void demo2()
	{

	}


}
