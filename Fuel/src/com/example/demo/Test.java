package com.example.demo;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Test {


	static{
		System.out.println("this is static block");
	}
	static{
		System.out.println("this static block in java 1");
	}

	{
		System.out.println("this non-static block in java");
	}
	{
		System.out.println("this non-static block in java1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		Test t2=new Test();
	}

}
