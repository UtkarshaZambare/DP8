/*An map contains student object as a key and list of courses he has enrolled in. [1M]
e.g. map<student , list(course)>
Create another map in which course id is a key and list of student objects of that 
*/

package com.testpaper2;

public class Que12Student {

	private int sid;
	private String sname;

	public Que12Student(int sid, String sname) {

		this.sid = sid;
		this.sname = sname;

	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Que12Student [sid=" + sid + ", " + (sname != null ? "sname=" + sname : "") + "]";
	}


}
