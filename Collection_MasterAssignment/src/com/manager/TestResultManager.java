package com.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import com.bean.Academy;
import com.bean.TestResult;

public class TestResultManager {

	public static void addDummyTestResult() {

		addTestResult(1);
		addTestResult(2);
		addTestResult(3);
	}

	public static void addTestResult(int courseID) {

		TestResult student1 = new TestResult(new Date(2 / 12 / 2023), 1001, 101, 79, 100);
		TestResult student2 = new TestResult(new Date(2 / 12 / 2023), 1001, 102, 35, 100);
		TestResult student3 = new TestResult(new Date(2 / 12 / 2023), 1002, 103, 85, 100);
		TestResult student4 = new TestResult(new Date(2 / 12 / 2023), 1002, 104, 39, 100);
		TestResult student5 = new TestResult(new Date(2 / 12 / 2023), 1003, 105, 70, 100);

		if (courseID == 1) {
			ArrayList<TestResult> resList1 = new ArrayList<TestResult>();
			resList1.add(student1);
			resList1.add(student5);
			Academy.test_map.put(1, resList1);
		} else if (courseID == 2) {
			ArrayList<TestResult> resList2 = new ArrayList<TestResult>();
			resList2.add(student2);
			resList2.add(student3);
			Academy.test_map.put(2, resList2);

		} else if (courseID == 3) {
			ArrayList<TestResult> resList3 = new ArrayList<TestResult>();
			resList3.add(student4);

			Academy.test_map.put(3, resList3);

		}

	}

	public static void show() {

		Iterator<Entry<Integer, List<TestResult>>> itr = Academy.test_map.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void countPercentageForPoorPerformance() {

		double percentage = 0;
		Iterator<Entry<Integer, List<TestResult>>> mapOfResult = Academy.test_map.entrySet().iterator();
		ArrayList<TestResult>poorStudents = new ArrayList<TestResult>();
		while (mapOfResult.hasNext()) {
			Entry<Integer, List<TestResult>>ResultEntry= mapOfResult.next();

			List<TestResult> list = ResultEntry.getValue();
			Iterator<TestResult> itr = list.iterator();
			while (itr.hasNext()) {
				TestResult obj = itr.next();
				int marks = obj.marks;

				int outOf = obj.out_of_marks;

				percentage = (marks * 100) / outOf;

				if (percentage < 40) {
					poorStudents.add(obj);
				}
			}
		}
		System.out.println(poorStudents);

	}

}
