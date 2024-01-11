package com.jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement_Demo {
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testcoursedb?autoReconnet=true&useSSL=false","root","root");
		
		return con;
	}
		public static void checkSalary() {
			try {
				Connection con = MyConnection.getMySQLConnection();
				String sql = "Select employee_id,salary from employees where salary > ?";
				
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setDouble(1, 30000);
				ResultSet rs = psmt.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getDouble(2));
				}
				psmt.clearParameters();
				psmt.setDouble(1, 50000);
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
		}
		
		public static void checkSalByInput() throws ClassNotFoundException, SQLException {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a salary");
			Double sal = sc.nextDouble();
			Connection con = getMySQLConnection();
			String sql = "Select employee_id,salary from employees where salary > ?";
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setDouble(1, sal);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getDouble(2));
				System.out.println("________________________________________________________");
			}
			sc.close();
					
		}
		public static void main(String[] args) {
			//PreparedStatement_Demo.checkSalary();
			try {
				PreparedStatement_Demo.checkSalByInput();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}


