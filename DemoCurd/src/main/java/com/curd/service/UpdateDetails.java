package com.curd.service;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.curd.dbconnection.DbConnection;
import com.curd.entity.User;
import com.curd.repository.Update;

public class UpdateDetails implements Update {
	Scanner s1=new Scanner(System.in);
	public void update() {
		DbConnection connection=new DbConnection();
		EntityManager er=connection.crEntityManagerFactory().createEntityManager();
		System.out.println("Enter Account Number ");
		int accno=s1.nextInt();	
		System.out.println("Enter User Name  ");
		String uname=s1.next();	
		System.out.println("Enter address  ");
		String address=s1.next();	
		System.out.println("Enter mailid ");
		String mailid=s1.next();
		System.out.println("Enter Mobile number  ");
		String mobile=s1.next();	
		System.out.println("Enter branch  ");
		String branch=s1.next();	
		System.out.println("Enter IFSC ");
		String ifsc=s1.next();
		System.out.println("Enter Account Type   ");
		String type=s1.next();	
		System.out.println("Enter Amount  ");
		float balance=s1.nextFloat();	
		System.out.println("Enter Bank Name ");
		String bankname=s1.next();
		User u1=new User();
		u1.setAccno(accno);
		u1.setUserName(uname);
		u1.setAddress(address);
		u1.setMailId(mailid);
		u1.setMobile(mobile);
		u1.setBranch(branch);
		u1.setIFSC(ifsc);
		u1.setAccType(type);
		u1.setBalance(balance);
		u1.setBankName(bankname);
		
		
		er.getTransaction().begin();
		er.merge(u1);
		er.getTransaction().commit();
		er.close();

		
	}

}
