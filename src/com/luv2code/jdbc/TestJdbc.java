package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "testuser";
		String pass ="1111";
		
		
		try {
			
			
			System.out.println("connection to database:" + jdbcUrl);
			
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection Sucessful!!!");
		} catch (Exception exc) {
		
			
			exc.printStackTrace();
			
		}
		
		
		
	}

}
