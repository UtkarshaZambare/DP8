package com.weeklytest2;

public class VolumeCalculator {

	
		 // Function to calculate the volume of a sphere
	    public double volume(double r) {
	        return (4.0 / 3.0) * (22.0 / 7.0) * Math.pow(r, 3);
	    }

	    // Function to calculate the volume of a cylinder
	    public double volume(double h, double r) {
	        return (22.0 / 7.0) * Math.pow(r, 2) * h;
	    }

	    // Function to calculate the volume of a cuboid
	    public double volume(double l, double b, double h) {
	        return l * b * h;
	    }

	    public static void main(String[] args) {
	        VolumeCalculator calculator = new VolumeCalculator();

	        double sphereVolume = calculator.volume(5.0);  // Example for a sphere with radius 5.0
	        double cylinderVolume = calculator.volume(3.0, 4.0);  // Example for a cylinder with height 3.0 and radius 4.0
	        double cuboidVolume = calculator.volume(6.0, 8.0, 10.0);  // Example for a cuboid with dimensions 6.0 x 8.0 x 10.0

	        System.out.println("Volume of Sphere: " + sphereVolume);
	        System.out.println("Volume of Cylinder: " + cylinderVolume);
	        System.out.println("Volume of Cuboid: " + cuboidVolume);
	    }
	}
	








	


