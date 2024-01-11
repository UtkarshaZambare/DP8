package com.weeklytest3;

public class Vehicale {
	private int vid;
	private String vname;
	
public Vehicale() {
		
	}
    public Vehicale(int vid,String vname) {
		this.vid=vid;
		this.vname=vname;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	

	public static void main(String[] args) {
		

	}
	@Override
	public String toString() {
		return "Vehicale [vid=" + vid + ", vname=" + vname + "]";
	}

}
