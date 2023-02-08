package com.example.demo;

public class Demo {
	int a=10;
	static int b=60;
	void display()
	{
		System.out.println("This is display method");
	}

	static void demo()
	{
		System.out.println("Demo method");
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.display();
		Demo.demo();

	}

}
