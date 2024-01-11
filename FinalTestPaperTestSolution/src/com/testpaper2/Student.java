package com.testpaper2;

public class Student extends Que15Person {

	private int[] testScores;

	public Student(String firstname, String lastname, int id, int[] testScores) {
		super(firstname, lastname, id);
		this.testScores = testScores;

	}

	public char calculate() {
		int sum = 0;
		for (int score : testScores) {
			sum += score;
		}

		int average = sum / testScores.length;

		if (90 <= average && average <= 100) {
			return 'A';
		} else if (80 <= average && average < 90) {
			return 'B';
		} else if (70 <= average && average < 80) {
			return 'C';
		} else if (55 <= average && average < 70) {
			return 'D';
		} else {
			return 'F';
		}
	}

	

	public static void main(String[] args) {
		int[] scores1 = {95, 92, 98, 95, 88};
		Student std1 = new Student("Snehal", "Patil", 100, scores1 );
		System.out.println("Grade for " + std1.getFirstname() + " " + std1.getLastname() + ": " + std1.calculate());
		
		int[] scores2 = {80, 93, 68, 99, 89};
		Student std2 = new Student("Anika", "Patil", 102, scores2 );
		System.out.println("Grade for " + std2.getFirstname() + " " + std2.getLastname() + ": " + std2.calculate());
		
		

	}

}
