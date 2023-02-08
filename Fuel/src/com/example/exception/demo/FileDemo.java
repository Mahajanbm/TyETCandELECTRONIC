package com.example.exception.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File f=new File("C:\\Users\\Mahi\\Desktop\\TYetcand Electronics\\Demo1.java");
		FileInputStream f1=null;

		try {
			f1=new FileInputStream(f);

			Scanner s1=new Scanner(System.in);
			//throw new FileNotFoundException();
			
			
		} catch (InputMismatchException e) {
			System.out.println("Please enter Integer Data");
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		finally {
			f1.close();
			System.out.println("File close");

		}

	}

}
