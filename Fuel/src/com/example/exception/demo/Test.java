package com.example.exception.demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a, b,c;
		Scanner s1=new Scanner(System.in);

			System.out.println("Enter  first number");
			a=s1.nextInt();
			System.out.println("Enter  second number");
			b=s1.nextInt();
			c=a/b;
			System.out.println("Result is :   "+c);

	}

}
