package com.javastatement.example;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int a,b;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st number");
		a=s1.nextInt();
		System.out.println("Enter 2nd number");
		b=s1.nextInt();

		if(a>b)
		{
			System.out.println("A is greater");
		}
		else {
			System.out.println("B is greater");
		}

		/*	if(a%2==0)
		{
			System.out.println("Enterd number is even number");
		}
		else {
			System.out.println("Enterd Number is odd number");
		}*/
	}

}
