package com.testpaper2;

public class Bakery {
	
	    public static Confectionery produceConfectionery(String type) {
	        switch (type.toLowerCase()) {
	            case "cake":
	                return new Cake();
	            case "cream roll":
	                return new CreamRoll();
	            case "pastry":
	                return new Pastry();
	            case "bread":
	                return new Bread();
	            default:
	                throw new IllegalArgumentException("Invalid confectionery type: " + type);
	        }
	    }

	     public static void main(String[] args) {
	       
	        Confectionery cake = Bakery.produceConfectionery("cake");
	        Confectionery creamRoll = Bakery.produceConfectionery("cream roll");
	        Confectionery pastry = Bakery.produceConfectionery("pastry");
	        Confectionery bread = Bakery.produceConfectionery("bread");

	        
	        cake.produce();
	        creamRoll.produce();
	        pastry.produce();
	        bread.produce();
	    }
	}


