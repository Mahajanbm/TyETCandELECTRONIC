package com.example.exception.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		int a, b,c;
		Scanner s1=new Scanner(System.in);
		try {
			System.out.println("Enter  first number");
			a=s1.nextInt();
			System.out.println("Enter  second number");
			b=s1.nextInt();
			c=a/b;
			System.out.println("Result is :   "+c);

		} 

		catch(InputMismatchException e)
		{
			System.out.println("please enter Only int Data");
		}

		catch (ArithmeticException e) {
			System.out.println("Plese provide  number greater than zero");
		}
		
		catch (Exception e) {
			System.out.println("Error");
		}
		System.out.println("End of Program");

	}

}
