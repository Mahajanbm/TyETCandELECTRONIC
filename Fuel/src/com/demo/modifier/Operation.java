package com.demo.modifier;

import java.util.Scanner;



public class Operation {

	void getData()
	{
		try {
			int a, b, c;
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter first number");
			a=s1.nextInt();	
			System.out.println("Enter second number");
			b=s1.nextInt();	
			c=a/b;




		} 
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}




	}
	void demo() throws ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");

	}
}
