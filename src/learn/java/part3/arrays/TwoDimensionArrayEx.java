package learn.java.part3.arrays;

import java.util.Scanner;

public class TwoDimensionArrayEx {
	public static void main(String[] args) {
		int[] arrOld = new int[5];//1d array
		arrOld[1] = 20;
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter number of rows");
		int rows = scr.nextInt();
		System.out.println("Please enter number of cols");
		int cols = scr.nextInt();
		int[][] arr = new int[rows][cols];
//		
//		arr[1][1] = 20;
//		System.out.println(arr[1][1]);
//		int val = 10;
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < cols; j++) {
				System.out.println("Please enter the value in "+ i + ", "+ j +" position");
				int p = scr.nextInt();
				arr[i][j] = p;
			}
			
		}
		System.out.println("**************READING VALUES FROM 2D ARRAY*************");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int k = arr[i][j];
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		int[][][] arrT = new int[2][2][2];
	}
}
