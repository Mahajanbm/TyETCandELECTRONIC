package com.example.exception.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Mahi\\Desktop\\TYetcand Electronics\\Demo1.java");
		FileInputStream f1=null;

		try {
			f1=new FileInputStream(f);
			System.out.println("File found");
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter number");
			int a=s1.nextInt();

		}
		finally {
			f1.close();
			System.out.println("File close");
		}

	}

}
