package com.jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalDB {
	
	public static Connection getMYSQLConnection() throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientdb?autoReconnect=true&useSSL=false","root","root");
		
		return con;
		
	}
	
	public static void findAge() {
		try {
			Connection con = getMYSQLConnection();
			String sql = "Select * from patient where age>50";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println("Patientid:" + rs.getInt(1));
				System.out.println("PatientName:" + rs.getString(2));
				System.out.println("Patientage:" + rs.getInt(3));
				System.out.println("Patienweight:" + rs.getFloat(4));
				System.out.println("Patientemail:" + rs.getString(5));
				System.out.println("Admitiondate:" + rs.getString(6));
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static void insertRecord() {
			try {
				Connection con = getMYSQLConnection();
				String sql = "Insert into patient(pid, pName, age, weight, email, admissiondate) values(?,?,?,?,?,?)";
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setInt(1, 8);
				psmt.setString(2, "Dipa");
				psmt.setInt(3, 20);
				psmt.setInt(4, 68);
				psmt.setString(5, "dp@gmail.com");
				psmt.setDate(6, java.sql.Date.valueOf("2023-01-12"));
				
				 int rs = psmt.executeUpdate();
				 if(rs>0) {
					 System.out.println("New record is added successfully!");
					 }
				 else {
					 System.out.println("Failed to insert new record.");
				 }
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	//Update email address of patient whose name is ‘K.V.Naik’. Use Statement object to do the same.
	
	public static void updateEmail() throws ClassNotFoundException, SQLException {
		Connection con = getMYSQLConnection();
		String sql = "Update patient set email = ? where pname =?";
		PreparedStatement psmt = con.prepareStatement(sql);
		psmt.setString(1, "rohit@gmail");
		psmt.setString(2, "Rohit");
		int rs = psmt.executeUpdate();
		System.out.println(rs +" rows affetcted");
		if(rs>0) {
			System.out.println("Email address updated successfully!");
		}
		else {
			System.out.println("No matching record found for");
		}
		
	}
	/*Delete all records from patient table for giben patient id. Use PreparedStatement for the same.*/
	
	public static void delectRecord() throws ClassNotFoundException, SQLException 
	{
		Connection con = getMYSQLConnection();
		String sql = "Delete from patient where pid = ? ";
		PreparedStatement psmt =con.prepareStatement(sql);
		psmt.setInt(1, 8);
		int rs = psmt.executeUpdate();
		System.out.println(rs+ "rows affected");
		
	}
	
	/*Retrive all records from Patient table in Result 
	Set and display them in reverse and forward order.*/
	
	public static void retriveAllRecordsInReverseAndForward() throws ClassNotFoundException, SQLException 
	{
		Connection con = getMYSQLConnection();
	    String sql = "Select * from patient";
	    PreparedStatement psmt = con.prepareStatement(sql);
	    ResultSet rs = psmt.executeQuery();
	    rs.afterLast();// to move cursor at last point 
	    while(rs.previous()) {
	    	System.out.println("Patientid:" + rs.getInt(1));
			System.out.println("PatientName:" + rs.getString(2));
			System.out.println("Patientage:" + rs.getInt(3));
			System.out.println("Patienweight:" + rs.getFloat(4));
			System.out.println("Patientemail:" + rs.getString(5));
			System.out.println("Admitiondate:" + rs.getString(6));
			System.out.println("__________________________________________");
	    }
	}
	
	//Delete record no 5 from resultset.
	
	public static void deleteRecordFromREsultSet() throws ClassNotFoundException, SQLException {
		Connection con = getMYSQLConnection();
		String sql = "Select * from patient";
		PreparedStatement psmt= con.prepareStatement(sql);
		ResultSet rs = psmt.executeQuery();
		
	}
	
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//HospitalDB.findAge();
		//HospitalDB.insertRecord();
		//HospitalDB.updateEmail();
		//HospitalDB.delectRecord();
		HospitalDB.retriveAllRecordsInReverseAndForward();
	}

}
