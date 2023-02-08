package com.exmple.demo.example;

import java.util.Scanner;

public class UserInput {
	static int y=90;
		int a,b,Result;
		Scanner s1=new Scanner(System.in);
		void getDemo()
		{
			System.out.println("Enter 1 st number");
			a=s1.nextInt();
			System.out.println("Enter 2nd Number");
			b=s1.nextInt();
	
			Result=a+b;
			System.out.println(Result);
	
		}
}

