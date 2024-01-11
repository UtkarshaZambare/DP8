/*) There is a Bakery (factory)making different kinds of  
 * confectionary(cake, cream roll , pastry ,bread). WAP which 
 * implements the Bakery to produce the above confectionary.Show main invoking this factory. 
 * */



package com.testpaper2;

public interface Confectionery {
	
	void produce();
	
}

class Cake implements Confectionery {
    @Override
    public void produce() {
        System.out.println("Producing Cake");
    }
}

class CreamRoll implements Confectionery {
    @Override
    public void produce() {
        System.out.println("Producing Cream Roll");
    }
}

class Pastry implements Confectionery {
    @Override
    public void produce() {
        System.out.println("Producing Pastry");
    }
}

class Bread implements Confectionery {
    @Override
    public void produce() {
        System.out.println("Producing Bread");
    }
}



