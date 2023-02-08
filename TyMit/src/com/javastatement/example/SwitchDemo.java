package com.javastatement.example;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		int a;
		String str;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter User Input");
		str=s1.next();

		switch(str)
		{

		case "virat":
			System.out.println("This is virat");
			break;
		case "rohit" :
			System.out.println("this is rohit");
			break;

		case "Surya":
			System.out.println("this is surya");
			break;
		default:
			System.out.println("Your input is wrong");

		}

	}

}
