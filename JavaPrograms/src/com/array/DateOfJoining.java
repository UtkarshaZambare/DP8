package com.array;

public class DateOfJoining {
	
	int day;
	int month;
	int year;
	
	public DateOfJoining(int day,int month,int year) 
	{
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
    public boolean compareDate(DateOfJoining d)
    {
    	if(this.day==d.day&&this.month==d.month&& this.year==d.year)
    		return true;
    	else
    		return false;
    }
	
	public String toString() {
		return "day=" + day + ", month=" + month + ", year=" + year ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
