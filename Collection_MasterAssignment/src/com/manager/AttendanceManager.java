package com.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import com.bean.Academy;
import com.bean.Attendance;



public class AttendanceManager {
	
	public static void addDummyAttendance() {
		AddAttendance(1);
		AddAttendance(2);
		AddAttendance(3);
		
	}

	public static void AddAttendance(int CourseID) {

		Attendance std1 = new Attendance(1, 101, "P", new Date(1 / 12 / 2023));
		Attendance std2 = new Attendance(2, 102, "P", new Date(1 / 12 / 2023));
		Attendance std3 = new Attendance(3, 103, "A", new Date(1 / 12 / 2023));
		Attendance std4 = new Attendance(4, 104, "A", new Date(1 / 12 / 2023));
		Attendance std5 = new Attendance(5, 105, "P", new Date(1 / 12 / 2023));
		Attendance std6 = new Attendance(6, 106, "A", new Date(1 / 12 / 2023));

		if (CourseID == 1) {
			ArrayList<Attendance> attendance1 = new ArrayList<Attendance>();
			attendance1.add(std2);
			attendance1.add(std5);
			Academy.attendanceMap.put(1, attendance1);
		} else if (CourseID == 2) {
			ArrayList<Attendance> attendance2 = new ArrayList<Attendance>();
			attendance2.add(std1);
			attendance2.add(std3);
			attendance2.add(std6);

			Academy.attendanceMap.put(2, attendance2);
		} else if (CourseID == 3) {
			ArrayList<Attendance> attendance3 = new ArrayList<Attendance>();
			attendance3.add(std4);
			Academy.attendanceMap.put(3, attendance3);

		}

	}

	public static void show() {

		Iterator<Entry<Integer, List<Attendance>>> itr = Academy.attendanceMap.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
