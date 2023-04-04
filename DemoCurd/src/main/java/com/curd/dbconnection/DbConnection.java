package com.curd.dbconnection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {

	public EntityManagerFactory crEntityManagerFactory()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("etc");

		return entityManagerFactory;
	}
}
