package learn.java.basic;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("please enter a digit");
		int i = scr.nextInt();
		System.out.println("Entered value - "+i);
		
		String s = scr.next();
		System.out.println("Entered string - "+ s);
		
	}
}
