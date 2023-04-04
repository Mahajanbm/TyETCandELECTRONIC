package com.curd.service;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.curd.dbconnection.DbConnection;
import com.curd.entity.User;
import com.curd.repository.Delete;

public class DeleteDetails  implements Delete{
	DbConnection connection=new DbConnection();
	Scanner s1=new Scanner(System.in);
	User u1=new User();
	public void delete() {
		EntityManager eManager=connection.crEntityManagerFactory().createEntityManager();
		System.out.println("Enter account Number");
		int accno=s1.nextInt();
		u1=eManager.find(User.class, accno);
		eManager.getTransaction().begin();
		eManager.remove(u1);
		eManager.getTransaction().commit();
		eManager.close();
	}

}
