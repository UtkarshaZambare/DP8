package com.jdbcPrograms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultetScrollingDemo {

	Connection con;
	Statement st;
	ResultSet rs;
	String sql;

	public ResultetScrollingDemo() throws ClassNotFoundException, SQLException {
		con = MyConnection.getMySQLConnection();
		st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		sql = "select employee_id,first_name,salary,department_id from employees limit 10";
		rs = st.executeQuery(sql);

	}

	public void showScrollingDataInForward() throws SQLException {
		System.out.println("---------------------------------------------------");
		System.out.println("Emp ID" + "\t" + "Name" + "\t\t" + "Salary" + "\t\tDept No");
		System.out.println("---------------------------------------------------");

		while (rs.next()) {
			System.out
					.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t" + rs.getDouble(3) + "\t\t" + rs.getInt(4));
		}

	}
	
	public void showScrollinginReverse() throws SQLException {
		System.out.println("---------------------------------------------------");
		System.out.println("Emp ID" + "\t" + "Name" + "\t\t" + "Salary" + "\t\tDept No");
		System.out.println("---------------------------------------------------");
		while (rs.previous()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t" + rs.getDouble(3) + "\t\t" + rs.getInt(4));
		}
		
	}
	
	public void showAbsolutepos(int i) throws SQLException {
		rs.absolute(i);
		System.out.println("Record in "+i+ "Position ");
		System.out.println("_________________________________________________________");
	    System.out.println("Emp ID" +"\t"+"Name"+"\t\t"+"Salary"+"\t\tDept No");
	    System.out.println("_________________________________________________________");
	    
	    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getDouble(3)+"\t\t"+rs.getInt(4));
	    
	    rs.absolute(-5);
		System.out.println("Record in -5 Position ");

	
	}
	
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ResultetScrollingDemo obj = new ResultetScrollingDemo();
		obj.showScrollingDataInForward();
		obj.showScrollinginReverse();
		obj.showAbsolutepos(5);
	
	
	
	}

}
