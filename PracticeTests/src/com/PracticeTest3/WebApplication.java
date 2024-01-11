package com.PracticeTest3;

public class WebApplication extends Application {

	private String webSpecificFeature;

	public WebApplication(String version, String technologyUsed, String webSpecificFeature) {
		super(version, technologyUsed);
		this.webSpecificFeature = webSpecificFeature;
	}

	public void createWebSetup() {
		super.createSetup();
		System.out.println("Setting up web-specific features...");
		System.out.println("Web Specific Feature: " + webSpecificFeature);
	}

	public static void main(String[] args) {

	}

}
