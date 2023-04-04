package com.curd.test;
import com.curd.service.*;
import com.curd.repository.Add;
import com.curd.repository.Delete;
import com.curd.repository.Fetch;

public class Test {

	public static void main(String[] args) {
		Fetch a1=new UserDetails();
		a1.display();
		System.out.println("user Details");


	}


}
