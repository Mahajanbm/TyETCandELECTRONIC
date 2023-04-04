package com.curd.service;

import javax.persistence.EntityManager;

import com.curd.dbconnection.DbConnection;
import com.curd.entity.User;
import com.curd.repository.Fetch;

public class UserDetails  implements  Fetch{
	DbConnection connection=new DbConnection();
	User u1=new User();
	public void display() {
		EntityManager eManager=connection.crEntityManagerFactory().createEntityManager();
		int acc=67767;
		 u1=eManager.find(User.class, acc);
		 System.out.println(u1.getAccno());
		 System.out.println(u1.getUserName());

		 System.out.println(u1.getAccType());
		 System.out.println(u1.getBranch());
	}

}
