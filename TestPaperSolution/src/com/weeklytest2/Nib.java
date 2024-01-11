package com.weeklytest2;

import java.util.Objects;

public class Nib {
	
	private String materialType;
    private double width;
    
    public Nib() {
		// TODO Auto-generated constructor stub
	}
    
    public Nib(String materialType,double width) {
    	this.materialType = materialType;
    	this.width = width;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	

	
	@Override
	public String toString() {
		return "Nib [materialType=" + materialType + ", width=" + width + "]";
	}

	public static void main(String[] args) {
		

	}

}
