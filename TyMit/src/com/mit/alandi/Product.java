package com.mit.alandi;

public class Product {
	int productId;
	String productName;
	float price;
	void getProudctDetails(int a,String b,float c)
	{
		productId =a;
		productName=b;
		price=c;
		
	}
	
	void display()
	{
		System.out.println("Product Id is "+productId);
		System.out.println("Product name is "+productName);
		System.out.println("Product price is "+price);
	}

}
