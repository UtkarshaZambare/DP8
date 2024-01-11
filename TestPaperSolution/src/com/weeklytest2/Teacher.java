package com.weeklytest2;

public abstract class Teacher {
	int Tid;
    String Tname;
    String MobileNo;

    public Teacher(int Tid, String Tname, String MobileNo) {
        this.Tid = Tid;
        this.Tname = Tname;
        this.MobileNo = MobileNo;
    }
    
    abstract void salary();

	public static void main(String[] args) {
//		Teacher hourlyTeacher = (Teacher) new HourlyBased(101, "John Doe", "1234567890", 20.0, 40);
//        Teacher salaryTeacher = (Teacher) new SalaryBased(102, "Jane Smith", "9876543210", 50000);

        
//        hourlyTeacher.salary();
//        salaryTeacher.salary();

	}

	@Override
	public String toString() {
		return "Teacher [Tid=" + Tid + ", Tname=" + Tname + ", MobileNo=" + MobileNo + "]";
	}

}
