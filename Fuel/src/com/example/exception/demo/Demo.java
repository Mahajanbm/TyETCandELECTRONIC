package com.example.exception.demo;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) throws SQLException  {
		String driver="com.mysql.jdbc.Driver";
		String user="root";
		String pass="4321";
		String url="jdbc:mysql://127.0.0.1:3306/tydemo";
		String str="insert into tblemployee values(102,'nani','CSE',154515)";
		Connection con=null;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pass);
			Statement statement=con.createStatement();
			statement.execute(str);

			System.out.println("record inserted sucess fully");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Class Not found Exception");
		}
		catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Database problem");
		}
		finally {
			con.close();
			System.out.println("Connection close");
		}

	}

}
