package com.example.exception.demo;

public class TestDemo {

	public static void main(String[] args) {
		//UserDefine u1=new UserDefine();
		try { 
			System.out.println("Hello");
			 throw new UserDefine();
			
		} catch (UserDefine e) {
			// TODO: handle exception
			System.out.println("hello mahajan");
		}
	}

}
