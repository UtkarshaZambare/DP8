package com.containment;

public class Bank {
	
	private String Address,Bank_Name,Ifsc_Code ;
	 Account account;
	
	Bank()
	{
		account = new Account();
	}
	Bank(String Address,String Bank_Name, String Ifsc_Code,Account account)
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

	public static void main(String[] args) {
		Bank s = new Bank();
		System.out.println(s);
		Bank s1 = new Bank("Sbi","sbi1002","Pimpri",new Account(102,"Tina",89000));
		System.out.println("------------------");
		System.out.println(s1);
		
	}

}
