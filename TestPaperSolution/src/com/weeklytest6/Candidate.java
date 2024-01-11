package com.weeklytest6;

public class Candidate implements Comparable<Candidate> {

	private int cid;
	private String cname;
	private int m1, m2, m3;
	private double percentage;

	public Candidate(int cid, String cname, int m1, int m2, int m3, double percentage) {

		this.cid = cid;
		this.cname = cname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.percentage = calculatePercentage();

	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double calculatePercentage() {
		return (m1 + m2 + m3) / 3.0;
	}

	@Override
	public String toString() {
		return "Candidate [cid=" + cid + ", cname=" + cname + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3
				+ ", percentage=" + percentage + "]";
	}

	@Override
	public int compareTo(Candidate o) {
		
		return o.percentage > this.percentage ? 1 : -1;
	}

}
