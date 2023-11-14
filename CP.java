package com.student.manage;

import java.sql.Connection;           // all jdbc library are present here in this
import java.sql.DriverManager;

public class CP {
	static Connection con;       //  variable to store connection of Connection type
	public static Connection createC() {
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");   // Class is a class which has forName() method. and then we pass the driver name(Driver) but it is in package -- com.mysql.jdbc
			
			// create connection
			
			String user = "root";
			String password = "sql@Lipton";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			con = DriverManager.getConnection(url, user, password);
		}
		catch(Exception e){
			e.printStackTrace();        // if exception found, then print stack
		}
		
		return con;
	}
	
}
