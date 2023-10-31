package com.containment;

public class BankArrayDemo {
	private String Address,Bank_Name,Ifsc_Code ;
	 Account account[];
	 
	 BankArrayDemo()
		{
			
		}
	 BankArrayDemo(String Address,String Bank_Name, String Ifsc_Code,Account  account[])
		{
			this.Address= Address;
			this.Bank_Name=Bank_Name;
			this.Ifsc_Code=Ifsc_Code;
			this.account= account;
			
		}
		
		public void setAddress(String Address) {
			this.Address= Address;
		}

		public void setBank_name(String Bank_Name) {
			this.Bank_Name = Bank_Name;
		}

		public void setIfsc_Code(String Ifsc_Code) {
			this.Ifsc_Code =Ifsc_Code;
		}

		public String getBank_Name() {
			return Bank_Name;

		}

		public String getIfsc_Code() {
			return Ifsc_Code;

		}

		public String getAddress() {
			return Address;

		}
		public String toString() 
		{
			return"Bank_Name" +Bank_Name+  "Ifsc code" +Ifsc_Code+ "Address" +Address+ "account" +account;
			
		}
	    public void printAccount()
	    {
	    	for(Account a:account)
	    		System.out.println(a);
	    }



	public static void main(String[] args) {
		Account accArr[] = new Account[3];
		 accArr[0]= new Account(101, "Niya", 500000);
		 accArr[1]= new Account(102,"Piya", 550000);
		 accArr[2]= new Account(103,"Siya", 900000);
		 BankArrayDemo s  = new BankArrayDemo("Sbi","sbi1002","Pimpri", accArr);
		 System.out.println(s);
			s.printAccount();


	}

}
