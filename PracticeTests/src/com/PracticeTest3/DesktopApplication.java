package com.PracticeTest3;

public class DesktopApplication extends Application {
	private String desktopSpecificFeature;

	public DesktopApplication(String version, String technologyUsed, String desktopSpecificFeature) {
		super(version, technologyUsed);
		this.setDesktopSpecificFeature(desktopSpecificFeature);

	}

	public String getDesktopSpecificFeature() {
		return desktopSpecificFeature;
	}

	public void setDesktopSpecificFeature(String desktopSpecificFeature) {
		this.desktopSpecificFeature = desktopSpecificFeature;

	}
	 public void createDesktopSetup() {
	        super.createSetup();
	        System.out.println("Setting up desktop-specific features...");
	        System.out.println("Desktop Specific Feature: " + desktopSpecificFeature);
	    }

	public static void main(String[] args) {
		

	}

}
