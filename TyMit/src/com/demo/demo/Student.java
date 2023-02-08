package com.demo.demo;

import java.util.Scanner;

public class Student {
	int rollno;
	String name;
	String city;
	String dept;
	float percentage;
	void getData()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Student roll no");
		rollno=s1.nextInt();
		System.out.println("Enter Student name");
		name=s1.next();
		System.out.println("Enter Student city");
		city=s1.next();
		System.out.println("Enter Student dept");
		dept=s1.next();
		System.out.println("Enter Student percentage");
		percentage=s1.nextFloat();



	}


	void display()
	{
		System.out.println(" Student roll no is "+rollno);
		System.out.println(" Student name is "+name);
		System.out.println(" Student city is "+city);
		System.out.println(" Student dept  is "+dept);	
		System.out.println(" Student Percentage is "+percentage);	
	}



}
