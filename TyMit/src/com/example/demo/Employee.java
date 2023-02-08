package com.example.demo;

import java.util.Scanner;

public class Employee {

	int a,b,Result;
	Scanner s1=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter 1 st number");
		a=s1.nextInt();
		System.out.println("Enter 2nd Number");
		b=s1.nextInt();
		
		Result=a+b;
		System.out.println(Result);
		
	}
	
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.getData();

	}

}
