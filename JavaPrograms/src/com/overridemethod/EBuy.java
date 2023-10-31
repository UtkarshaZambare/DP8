package com.overridemethod;

 class EBuy extends Company {

	public EBuy() {
		
	}
	
	public void setAddress(String address) 
	{
		super.setAddress("Pune, Maharashtra");
	}

	@Override
	public String toString() {
		return super.toString()+"EBuy []";
	}

	public static void main(String[] args) {
		Company obj = new EBuy();
		obj.setAddress("mumbai,Maharashtra");
		System.out.println(obj);

	}

}
