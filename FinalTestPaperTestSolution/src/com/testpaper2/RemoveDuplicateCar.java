package com.testpaper2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateCar {

	public static void main(String[] args) {
		 Set <Que14Car> cars = new HashSet<>();
		 
		 cars.add(new Que14Car(1, "Red"));
		 cars.add(new Que14Car(2, "White"));
		 cars.add(new Que14Car(3, "Blue"));
		 cars.add(new Que14Car(1, "Red"));
		 cars.add(new Que14Car(2, "White"));
		 
		 Set <Que14Car> uniquecars = new HashSet<>();
		 Iterator<Que14Car> itr = cars.iterator();
		 while(itr.hasNext()) {
			 Que14Car car = itr.next();
			 if(uniquecars.contains(car)) {
				 itr.remove();
			 }
			 else {
				 uniquecars.add(car);
			 }
			 
		 
		 }
		 System.out.println("Unique Cars:");
		 for(Que14Car car: cars) {
			 System.out.println(car);
			 
		 }
	}

}
