package com.jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException 
	{
		
		// load
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb?autoReconnet=true&useSSL=false","root","root");
		
		return con;
		
	}
	
	
}
