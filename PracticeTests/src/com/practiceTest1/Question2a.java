//Display multiplication of first 5 digits between 300 to 600  (including both) 
//,which are multiples of 3 and 5.	


package com.practiceTest1;

public class Question2a {

	public static void main(String[] args) {
		int count = 0;
        long product = 1;
        int num = 300;

        while (count < 5) {
            if (num % 3 == 0 && num % 5 == 0) {
                product = product * num;
                count++;
            }
            num++;
        }

        System.out.println(  product);
    }
}
