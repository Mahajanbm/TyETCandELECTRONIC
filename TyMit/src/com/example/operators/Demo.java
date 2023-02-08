package com.example.operators;

public class Demo {
	int x, y,Result;
	void add(int x,int y)
	{
		x=x;
		y=y;
		Result=x+y;
		System.out.println("Addition is "+Result);
	}

	void sub(int x,int y)
	{
		x=x;
		y=y;
		Result=x-y;
		System.out.println("Substraction is "+Result);
	}
	void mul(int x,int y)
	{
		x=x;
		y=y;
		Result=x*y;
		System.out.println("Multiplication is "+Result);
	}
	void div(int x,int y)
	{
		x=x;
		y=y;
		Result=x/y;
		System.out.println("Division is "+Result);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d1=new Demo();
		d1.add(10, 50);
		d1.sub(50, 10);
		d1.mul(10, 10);
		d1.div(55, 5);
	}

}
