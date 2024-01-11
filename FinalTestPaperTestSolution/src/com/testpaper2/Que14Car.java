/*Class Car is as follows , { int carno  , String color } . By mistake multiple car 
 * objects are added in a collection. 
 *  Find out duplicate objects in that collection and remove them. Car is same only if (carno  and  color both are same)*/

package com.testpaper2;

import java.util.Comparator;
import java.util.Objects;

public class Que14Car  {

	private int carno;
	private String color;

	public Que14Car(int carno, String color) {

		this.carno = carno;
		this.color = color;

	}

	public int getCarno() {
		return carno;
	}

	public void setCarno(int carno) {
		this.carno = carno;
	}

	public String getCarcolor() {
		return color;
	}

	public void setCarColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Que14Car [carno=" + carno + ", " + (color != null ? "color=" + color : "") + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(carno, color);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Que14Car other = (Que14Car) obj;
		return carno == other.carno && Objects.equals(color, other.color);
	}

	}

	


