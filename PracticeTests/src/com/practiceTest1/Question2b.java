//b.Display message “you entered 1” on pressing key 1, “you entered
//2” on pressing key 2 etc from keyboard on entering digits 0-9. 
//Otherwise, program should display “Invalid Input!” .


package com.practiceTest1;

import java.util.Scanner;

public class Question2b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a digit (0-9):");
       int num = sc.nextInt();
        switch (num) {
        case 0:
            System.out.println("You entered 0");
            break;
        case 1:
            System.out.println("You entered 1");
            break;
        case 2:
            System.out.println("You entered 2");
            break;
        case 3:
            System.out.println("You entered 3");
            break;
        case 4:
            System.out.println("You entered 4");
            break;
        case 5:
            System.out.println("You entered 5");
            break;
        case 6:
            System.out.println("You entered 6");
            break;
        case 7:
            System.out.println("You entered 7");
            break;
        case 8:
            System.out.println("You entered 8");
            break;
        case 9:
            System.out.println("You entered 9");
            break;
        default:
            System.out.println("Invalid Input!");
    }

    sc.close();
}


}
