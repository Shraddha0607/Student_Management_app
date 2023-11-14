package com.student.manage;

import java.sql.Connection;           // all jdbc library are present here in this
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;           // to fetch all the Statement methods



public class StudentDao {
		// here write all jdbc code to call data
	public static boolean insertStudentToDB(Student st) {
		boolean f = false;
		
		try {
			
			//jdbc code..
			Connection con = CP.createC();
			String q = "insert into students(sname, sphone, scity) values (?,?,?)";    // query  and ? show to make it dynamic(parameter based)
			
			//PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// set the value of parameter
			pstmt.setString(1,  st.getSname());   
			pstmt.setString(2,  st.getSphone());
			pstmt.setString(3, st.getScity());
			
			//execute   (when our query is only helping to store data not helping in retrieving data
			pstmt.executeUpdate();
			f = true;
			
			
		}
		catch(Exception e){
			// handle exception
			e.printStackTrace();
		}
		return f;
		
		}

	public static boolean deleteStudent(int userId) {
		boolean f = false;
		
		try {
			
			//jdbc code..
			Connection con = CP.createC();
			String q = "delete from students where sid =?";    // query  and ? show to make it dynamic(parameter based)
			
			//PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// set the value of parameter
			pstmt.setInt(1, userId);         // since userId is integer
			
			
			//execute   (when our query is only helping to store data not helping in retrieving data
			pstmt.executeUpdate();
			f = true;
			
			
		}
		catch(Exception e){
			// handle exception
			e.printStackTrace();
		}
		return f;
		
	}

	public static void showAllStudent() {

		boolena
		try {
			
			//jdbc code..
			Connection con = CP.createC();
			String q = "select * from students;";    // query  and ? show to make it dynamic(parameter based)
			

			
			// set the value of parameter  (used statement because no parametrized function call
			Statement stmt = con.createStatement();
			
			
			//execute   
			stmt.executeQuery(q);             // because getting data
			
			ResultSet  set = stmt.executeQuery(q);
			
			while(set.next()) {         // get in this variables
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);    // String city = set.getCity("scity");     also can pass like column name or index whatever we want
				
				System.out.println("ID : " + id);
				System.out.println("Name : " + name);
				System.out.println("Phone : " + phone);
				System.out.println("City : " + city);
				System.out.println("++++++++++++++++++++++++++++" );
				
			}
			
			
		}
		catch(Exception e){
			// handle exception
			e.printStackTrace();
		}
		
		
	}

	
	
	// do chngement in this
	
	public static boolean updateStudent() {
boolean f = false;
		
		try {
			
			//jdbc code..
			Connection con = CP.createC();
			String q = "delete from students where sid =?";    // query  and ? show to make it dynamic(parameter based)
			
			//PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			
			// set the value of parameter
			pstmt.setInt(1, userId);         // since userId is integer
			
			
			//execute   (when our query is only helping to store data not helping in retrieving data
			pstmt.executeUpdate();
			f = true;
			
			
		}
		catch(Exception e){
			// handle exception
			e.printStackTrace();
		}
		return f;
		
	}
}
