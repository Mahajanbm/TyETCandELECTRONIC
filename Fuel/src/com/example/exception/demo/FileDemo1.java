package com.example.exception.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileDemo1 {
	void demo()throws  IOException
	{
		File f1=new File("mahi.txt");
		FileWriter f=new FileWriter(f1);
		f.write("hello mahi how are you");
		//FileOutputStream  f=new FileOutputStream(f1);
		//FileInputStream fileInputStream=new FileInputStream(f1);
		// byte[] i= fileInputStream.readAllBytes();
		//for( int j=0;j<=i.length;j++)
		//{
		//System.out.println(i[j]);
		//}
		//f.write(10);
		//f.write('M');
		f.close();
		System.out.println("file found");


	}

	public static void main(String[] args) throws IOException {


		FileDemo1 f1=new FileDemo1();
		f1.demo();
	}

}
