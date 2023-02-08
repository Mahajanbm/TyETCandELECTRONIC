package com.javastatement.example;

import java.util.Scanner;

public class DemoNestedIfElse {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1 st Number");
		a=s1.nextInt();
		System.out.println("Enter 2nd Number");
		b=s1.nextInt();
		System.out.println("Enter 3rd Number");
		c=s1.nextInt();
		if(a>b && a>c)
		{
			System.out.println("1St number is greater");
		}
		else if(b>a &&b>c)
		{
			System.out.println("2nd number is greater");
		}
		
		else  if(c>a && c>b){
			System.out.println("3rd number is greater");
			
		}
		else {
			System.out.println("All are equal");
		}
		

	}

}
