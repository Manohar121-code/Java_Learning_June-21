package learn.java.basic.programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a digit");
		int n = scr.nextInt();
		while (n != -1) {
			int factorial = factorial(n);
			System.out.println(factorial);
			System.out.println("Enter a digit");
			n = scr.nextInt();
		}
	}
	
	public static int factorial(int n) {
		int k = 1;
		for(int i = 1; i <= n; i++) {
			k = k * i;
		}
		return k;
	}
}
