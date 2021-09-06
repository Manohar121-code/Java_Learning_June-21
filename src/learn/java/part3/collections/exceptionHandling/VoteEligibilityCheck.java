package learn.java.part3.collections.exceptionHandling;

import java.util.Scanner;

public class VoteEligibilityCheck {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter age - ");
		int age = scr.nextInt();
		try {
			checkEligibilityForVote(age);
		} catch (NotEligibleForVoteException e) {
			System.out.println("NotEligibleForVoteException Occurred - "+ e.getMessage());
		}
	}

	private static void checkEligibilityForVote(int age) throws NotEligibleForVoteException {
		if (age >= 18) {
			System.out.println("Person is eligible for vote");
		} else {
			throw new NotEligibleForVoteException("Person is not eligible for vote");
		}
	}
}
