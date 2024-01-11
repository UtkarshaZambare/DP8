/*Q4.Write Customer class with read and write properties customerId,
 customerName,customerAddress.Create object of this class by taking values from user.                            
Class should have provision to create backup(copy) of any customer record(object). 
i)   Do it by passing object as parameter to method.	                                                       
ii)  Do it without passing object as parameter to method.  
iii) Customer Object should be readable 
,if it is printed directly like - System.out.println(custobj) ; */

package com.practiceTest2;

import java.util.Scanner;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;

	public Customer(int customerId, String customerName, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void readProperties() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Customer ID: ");
		this.customerId = scanner.nextInt();
		scanner.nextLine(); // consume the newline character
		System.out.print("Enter Customer Name: ");
		this.customerName = scanner.nextLine();
		System.out.print("Enter Customer Address: ");
		this.customerAddress = scanner.nextLine();
		scanner.close();
	}
	
	// Method to write properties to the console
	public void writeProperties() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer Address: " + customerAddress);
	}

	// Method to create a backup by passing the object as a parameter
	public Customer createBackup(Customer original) {
		return new Customer(original.customerId, original.customerName, original.customerAddress);
	}

	// Method to create a backup without passing the object as a parameter
	public Customer createBackup() {
		return new Customer(this.customerId, this.customerName, this.customerAddress);
	}

	// Readable representation of the Customer object
	@Override
	public String toString() {
		return "Customer [ID=" + customerId + ", Name=" + customerName + ", Address=" + customerAddress + "]";
	}
	

	public static void main(String[] args) {
		// Create a Customer object by taking values from the user
		Customer customer = new Customer(0, "", "");
		customer.readProperties();

		// Print the original Customer object
		System.out.println("Original Customer Object:");
		System.out.println(customer);

		// Create a backup by passing the object as a parameter
		Customer backup1 = customer.createBackup(customer);

		// Create a backup without passing the object as a parameter
		Customer backup2 = customer.createBackup();

		// Print the backups
		System.out.println("\nBackup 1 (using method with parameter):");
		backup1.writeProperties();

		System.out.println("\nBackup 2 (using method without parameter):");
		backup2.writeProperties();
	}

}
