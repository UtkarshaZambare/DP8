package com.inheritance;

public class Laptop {

	private int noOfUSBPort;
	private int processorSpeed;

	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public static void main(String[] args) {
      
		Laptop mylaptop = new Laptop ();
		mylaptop.setNoOfUSBPort(4);
		mylaptop.setProcessorSpeed(2500);
		
		System.out.println(mylaptop.getNoOfUSBPort());
		System.out.println(mylaptop.getProcessorSpeed());
		
		
	}
}
