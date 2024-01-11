package com.jdbcPrograms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectDemo {

	public static void main(String[] args) {
		Connection con;
		try {
			con = MyConnection.getMySQLConnection();
			System.out.println(con);
			String sql = "Select * from departments ";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println("Department id :" +rs.getInt(1));
				System.out.println("Department Name :" +rs.getString(2));
				System.out.println("Manager id :" +rs.getInt(3));
				System.out.println("Location id :" +rs.getInt(4));
				System.out.println("_____________________________________________________");
			}
			
			//insert record
			sql = "Insert into departments values(290,'HR',206,1800)";
			int cnt = st.executeUpdate(sql);
			System.out.println(cnt+ "inserted...");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
