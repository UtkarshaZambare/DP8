//WAP to create class Bike with fields color ,speed and  method bikeInfo() which is show 
//color and speed of bike .create class Pulsar which extends Bike implement 
//bikeInfo() differently child 

package com.overridemethod;

public class Bike {
	
	@Override
	public String toString() {
		return "Bike [color=" + color + ", speed=" + speed + "]";
	}


	String color;
    int speed;

    public Bike(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void bikeInfo() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }


	public static void main(String[] args) {
		Bike b = new Bike("Red", 120);
		b.bikeInfo();

	}

}
