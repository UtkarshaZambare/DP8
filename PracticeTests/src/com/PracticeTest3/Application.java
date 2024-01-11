package com.PracticeTest3;

public class Application {

	
	private String version;
    private String technologyUsed;

    public Application(String version, String technologyUsed) {
        this.version = version;
        this.technologyUsed = technologyUsed;
    }

    public void createSetup() {
        System.out.println("Setting up common features for application...");
        System.out.println("Version: " + version);
        System.out.println("Technology Used: " + technologyUsed);
    }


	public static void main(String[] args) {
		Application obj = new Application ("", "");
		obj.createSetup();

	}

}
