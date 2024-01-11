package com.weeklytest2;

public class Refill {
	
	private String inkColor;
    private double length;
    private Nib nib;
    
    public Refill() {
		
	}
    public Refill(String inkColor,  double length, Nib nib) 
    {
    	this.inkColor = inkColor;
    	this.length = length;
    	this.nib = nib;
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Nib getNib() {
		return nib;
	}

	@Override
	public String toString() {
		return "Refill [inkColor=" + inkColor + ", length=" + length + ", nib=" + nib + "]";
	}
	public void setNib(Nib nib) {
		this.nib = nib;
	}

	

	public static void main(String[] args) {
		

	}

}
