package com.testpaper2;

public class FlatMain {

	public static void main(String[] args) {
		Que10Flat originalFlat = new Que10Flat(1, 1000, 4000000, 10.0);
		
		
		Que10Flat copy1 = originalFlat;
		Que10Flat copy2 = originalFlat;
		Que10Flat copy3 = originalFlat;
		
		System.out.println("originalflat:" +originalFlat );
		System.out.println("copy1:" +copy1);
		System.out.println("copy2:" +copy2);
		System.out.println("copy3:" +copy3);
		
		System.out.println();
		
		originalFlat.setPrice(55000.0);
        originalFlat.setHeight(12.0);
        
        System.out.println("originalflat:" +originalFlat );
		System.out.println("copy1:" +copy1);
		System.out.println("copy2:" +copy2);
		System.out.println("copy3:" +copy3);
		
	}

}
