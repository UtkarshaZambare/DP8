package com.practiceTest2;

import com.PracticeTest3.Application;

public class MobileApplication extends Application{

	 private String mobileSpecificFeature;

	    public MobileApplication(String version, String technologyUsed, String mobileSpecificFeature) {
	        super(version, technologyUsed);
	        this.mobileSpecificFeature = mobileSpecificFeature;
	    }

	    public void createMobileSetup() {
	        super.createSetup();
	        System.out.println("Setting up mobile-specific features...");
	        System.out.println("Mobile Specific Feature: " + mobileSpecificFeature);
	    }
	
	public static void main(String[] args) {
		
	}

}
