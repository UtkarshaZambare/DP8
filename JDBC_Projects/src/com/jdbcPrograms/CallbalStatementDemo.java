package com.jdbcPrograms;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallbalStatementDemo {

	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException {

		// load
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");

		// connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?autoReconnet=true&useSSL=false",
				"root", "root");

		return con;

	}

	public static void callableStatement() throws ClassNotFoundException, SQLException {
		Connection con = getMySQLConnection();
		CallableStatement cs = con.prepareCall("{Call GetCustomerLevel(?,?)}");
		cs.setInt(1, 201);
		cs.registerOutParameter(2, Types.VARCHAR);
		System.out.println(cs.execute());
		System.out.println("Customer level is " + cs.getString(2));

	}

	public static void callingFunctionStatement() throws ClassNotFoundException, SQLException {

		Connection con = getMySQLConnection();
		CallableStatement cs = con.prepareCall("{?=call get_OfficeCode(?)}");
		cs.registerOutParameter(1, Types.INTEGER);

		cs.setInt(2, 1076);
		cs.execute();
		System.out.println(cs.getInt(1));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//CallbalStatementDemo.callableStatement();
		CallbalStatementDemo.callingFunctionStatement();

	}

}
