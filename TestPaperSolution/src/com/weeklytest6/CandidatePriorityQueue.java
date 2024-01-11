package com.weeklytest6;

import java.util.PriorityQueue;

public class CandidatePriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<Candidate> admissionQueue = new PriorityQueue<Candidate>();

		admissionQueue.add(new Candidate(1, "John", 80, 85, 75, 0));
		admissionQueue.add(new Candidate(2, "Sonam", 90, 92, 88, 0));
		admissionQueue.add(new Candidate(3, "Anu", 85, 78, 92, 0));
		admissionQueue.add(new Candidate(4, "Radha", 56, 90, 75, 0));
		admissionQueue.add(new Candidate(5, "Pooja", 90, 89, 95, 0));
		admissionQueue.add(new Candidate(6, "Sneha", 70, 76,79, 0));
		

		System.out.println("Admission Order:");
		while (!admissionQueue.isEmpty()) {
			System.out.println(admissionQueue.poll());
		}

	}

}
