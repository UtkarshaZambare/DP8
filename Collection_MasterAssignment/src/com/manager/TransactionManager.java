package com.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import com.bean.Academy;
import com.bean.Course;
import com.bean.Student;
import com.bean.Transaction;

public class TransactionManager {
	  
	  public static void dummyTransaction() 
	    {
		  addTransaction(1);
		  addTransaction(2);
		  addTransaction(3);
		  
	    }


	public static void addTransaction(int courseID ) {

		
		Transaction t1 = new Transaction(20000, 101, new Date(3 / 10 / 2017));
		Transaction t2 = new Transaction(10000, 102, new Date(4 / 10 / 2017));
		Transaction t3 = new Transaction(20000, 101, new Date(5 / 10 / 2017));
		Transaction t4 = new Transaction(20000, 103, new Date(21 / 10 / 2017));
		Transaction t5 = new Transaction(40000, 104, new Date(22 / 10 / 2017));
		Transaction t6 = new Transaction(30000, 102, new Date(30 / 10 / 2017));
		
		if (courseID == 1) {
			ArrayList<Transaction> tansList1 = new ArrayList<Transaction>();
			tansList1.add(t2);
			tansList1.add(t6);
			Academy.transactionMap.put(1, tansList1);
		} else if (courseID == 2) {
			ArrayList<Transaction> tansList2 = new ArrayList<Transaction>();
			tansList2.add(t1);
			tansList2.add(t4);
			tansList2.add(t3);
			Academy.transactionMap.put(2, tansList2);

		} else if (courseID == 3) {
			ArrayList<Transaction> tansList3 = new ArrayList<Transaction>();
			tansList3.add(t5);
		    Academy.transactionMap.put(3, tansList3);

		}

	}
	 public static void show() 
	 {
		 Iterator<Entry<Integer, List<Transaction>>> itr = Academy.transactionMap.entrySet().iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
	 }	
	 //2>find our students who paid all fees, use LinkedHashMap in order to find out those 
	 public static void paidAllFees() {
		    
		    Iterator<Course> course = Academy.courseList.iterator();
		    int sum = 0;
		    LinkedList<Student> paidStudents = new LinkedList<Student>();
		    while (course.hasNext()) {
		      Course cs = course.next();
		      double fees = cs.courseFees;
		      int courseID = cs.courseId;
		      Iterator<Entry<Integer, List<Student>>> List = Academy.studentMap.entrySet().iterator();
		      while (List.hasNext()) {
		        Entry<Integer, List<Student>> studentList = List.next();

		        if (courseID == studentList.getKey()) {
		          List<Student> sl = studentList.getValue();
		          Iterator<Student> std = sl.iterator();

		          while (std.hasNext()) {
		            Student sobj = std.next();
		            int stdID = sobj.getStudent_id();
		            sum = 0;

		          Iterator<Entry<Integer, List<Transaction>>> transList = Academy.transactionMap.entrySet().iterator();
		            while (transList.hasNext()) {
		              Entry<Integer, List<Transaction>> trans = transList.next();
		              List<Transaction> tr = trans.getValue();
		              Iterator<Transaction> itr = tr.iterator();

		              while (itr.hasNext()) {
		                Transaction obj = itr.next();
		                if (stdID==obj.studId) {
		                  sum = sum + obj.paidfees;
		                }

		              }

		            }
		            if(sum==fees) {
		              paidStudents.add(sobj);
		            }
		          }
		        }
		      }

		    }
		    System.out.println(paidStudents);

		  }

}


