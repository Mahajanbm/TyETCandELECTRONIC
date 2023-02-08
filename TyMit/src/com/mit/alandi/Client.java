package com.mit.alandi;

public class Client {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.getProudctDetails(101,"mobile",15242.25f);
		p1.display();
		p1.getProudctDetails(222, "laptop", 54542.54f);
		p1.display();
	} 

}
