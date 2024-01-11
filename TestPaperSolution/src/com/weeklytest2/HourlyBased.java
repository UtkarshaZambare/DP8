package com.weeklytest2;

public class HourlyBased extends Teacher{

	double rate_per_hr;
    int hrs;

    public HourlyBased(int Tid, String Tname, String MobileNo, double rate_per_hr, int hrs) {
        super(Tid, Tname, MobileNo);
        this.rate_per_hr = rate_per_hr;
        this.hrs = hrs;
    }

	public static void main(String[] args) {
		

	}

	@Override
	public String toString() {
		return  super.toString()+"HourlyBased [rate_per_hr=" + rate_per_hr + ", hrs=" + hrs + "]";
	}

	@Override
	void salary() {
		
		
	}

}
