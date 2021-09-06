package learn.java.part3.collections.exceptionHandling;

import java.util.Scanner;

public class ThrowThrowsEx {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter age - ");
		int age = scr.nextInt();
		try {
			checkEligibilityForVote(age);
		} catch (Exception e) {
			System.out.println("Exception Occurred - "+ e.getMessage());
		}
		
		System.out.println("-------------");
		
		try {
			checkEligibilityForVote2(age);
		} catch (RuntimeException e) {
			System.out.println("RuntimeException Occurred - "+ e.getMessage());
		}
	}

	private static void checkEligibilityForVote(int age) throws Exception {
		if (age >= 18) {
			System.out.println("Person eligible for vote");
		} else {
			throw new Exception("below 18 is not eigible for vote");
		}
	}
	
	private static void checkEligibilityForVote2(int age) throws RuntimeException {
		if (age >= 18) {
			System.out.println("Person eligible for vote");
		} else {
			throw new RuntimeException("below 18 is not eigible for vote");
		}
	}
}
