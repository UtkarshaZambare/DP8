package com.jdbcPrograms;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HospitalDbUsingCollection {

	public static Connection getMYSQLConnection() throws ClassNotFoundException, SQLException {

		Connection con = null;

		Class.forName("com.mysql.cj.jdbc.Driver");

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patientdb?autoReconnect=true&useSSL=false",
				"root", "root");

		return con;

	}

	public static void fetchRecord() throws ClassNotFoundException, SQLException {

		ArrayList<String> patientnames = new ArrayList<>();
		Connection con = getMYSQLConnection();
		String sql = "select * from patient where age> 50 and admissiondate > '2020-05-05' ";
		PreparedStatement psmt = con.prepareStatement(sql);
		ResultSet rs = psmt.executeQuery();

		while (rs.next()) {
			String record="Id : "+rs.getInt(1)+", Name : "+rs.getString(2)+", Age : "+rs.getInt(3)+
		            ", Weight : "+rs.getFloat(4)+", Mail : "+rs.getString(5)+", Admit Date : "+rs.getDate(6);
			patientnames.add(record);
		}

		// Display the patient names
		System.out.println("Patient Names Admitted After May 5, 2020, and Age Above 50:");
		for (String patient : patientnames) {
			System.out.println(patient);
		}
	}

	/*
	 * Create HashMap with patient id as key and patient Name as value and display
	 * it.
	 */

	public static void createHashmap() throws ClassNotFoundException, SQLException {

		System.out.println("-------------------------------------------------------");
		
		HashMap<Integer, String> patientMap = new HashMap<>()     ;
		Connection con = getMYSQLConnection();
		String sql = "select pid,pname from patient ";
		PreparedStatement psmt = con.prepareStatement(sql);
		ResultSet rs = psmt.executeQuery();

		while (rs.next()) {
			int patient_id = rs.getInt(1);
			String patient_name = rs.getString(2);
			patientMap.put(patient_id, patient_name);
		}

		for (Map.Entry<Integer, String> entry : patientMap.entrySet()) {
			System.out.println("Patient ID: " + entry.getKey() + ", Patient Name: " + entry.getValue());
		}

	}
	
	/*Create a HashMap with docid as key and list of patients treated by that doctor as
	 *  value. Show all entries in HashMap.*/
	
	  public static void createHashMapandList() throws ClassNotFoundException, SQLException {
		
		  System.out.println("-------------------------------------------------------");
		  
		 HashMap<Integer, List<String>> doctorpatientMap = new  HashMap<Integer, List<String>>();
		Connection con =  getMYSQLConnection();
		String sql = "Select d.docid ,p.pname from doctor d inner join patient p on(d.docid=p.docid)";
		PreparedStatement psmt = con.prepareStatement(sql);
		ResultSet rs = psmt.executeQuery();
		
		while(rs.next()) {
			int doctor_id = rs.getInt(1);
			String patient_name = rs.getString(2);
			doctorpatientMap.put(doctor_id, new ArrayList<>());
			doctorpatientMap.get(doctor_id).add(patient_name);
		}
		for (Map.Entry<Integer, List<String>> entry : doctorpatientMap.entrySet()) {
            System.out.println("Doctor ID: " + entry.getKey() + ", Patients: " + entry.getValue());
        }
		
	}
	  
	 /*Create a Set of patient ids and sort it in descending order of patient ids.*/ 
	  
	  
	  public static void creatSetOfPatientInDesc() throws ClassNotFoundException, SQLException 
	  {
		  Set<Integer>patientId = new HashSet<>();
		  Connection con = getMYSQLConnection();
		  String sql= "select * from patient ";
		  PreparedStatement psmt = con.prepareStatement(sql);
		  ResultSet rs = psmt.executeQuery();
		  
		  while(rs.next()) {
			 
			  patientId.add(rs.getInt(1));
			  
		  }
		  System.out.println("Sorted Set (Descending Order): " + patientId); 
	  }
	
     /*Create Stored Procedure in database which takes pid as input parameter and returns patient age and name as 
      * output parameters. Call this procedure through java application.*/
	
	
	public static void createStoreProcedure() throws ClassNotFoundException, SQLException {
		Connection con = getMYSQLConnection();
		CallableStatement cs =  con.prepareCall("{Call getPatientDetails(?,?,?)}");
		cs.setInt(1, 3);
		cs.registerOutParameter(2, Types.INTEGER);
		cs.registerOutParameter(3,Types.VARCHAR );
		cs.execute();
		System.out.println("Patient_Age: "  + cs.getInt(2) + " Patient_Name: " + cs.getString(3));
		
	}
	
	/*Create a Stored Procedure which takes Doctor’s name as input parameter and returns 
	 * his speciality as output parameter.Call this stored procedure in java Application.*/
	
	
   public static void createStoreProcedureAndReturnSpeciality() throws ClassNotFoundException, SQLException {
	   Connection con = getMYSQLConnection();
	   CallableStatement cs = con.prepareCall("{Call getDoctorSpeciality(?,?)}");
	   cs.setString(1, "Dr. Miller");
	   cs.registerOutParameter(2, Types.VARCHAR);
	   cs.execute();
	   System.out.println( " Speciality " + cs.getString(2));
   }	
	
/*Create Stored Procedure which takes doctor id as input parameter and returns patient name,
patient id and his age as result Set. Call This Stored Procedure in Java Application*/
	
	
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		HospitalDbUsingCollection.fetchRecord();
//		HospitalDbUsingCollection.createHashmap();
		//HospitalDbUsingCollection.createHashMapandList();
		//HospitalDbUsingCollection.creatSetOfPatientInDesc();
		//HospitalDbUsingCollection.createStoreProcedure();
		HospitalDbUsingCollection.createStoreProcedureAndReturnSpeciality();

	}

}
