package learn.java.basic.array;

import java.util.Scanner;

public class ArrayWithScanner {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = scr.nextInt();
		int[] arr = new int[n];
		
		System.out.println("************ Initializing the values in array **************");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter a value at "+ i +" index");
			int val = scr.nextInt();
			arr[i] = val;
		}
		
		System.out.println("************* Retrieving the values from array ***********");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
	}
}
