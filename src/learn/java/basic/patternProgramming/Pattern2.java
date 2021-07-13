package learn.java.basic.patternProgramming;

//54321
//54321
//54321
//54321
//54321
public class Pattern2 {
	public static void main(String[] args) {
		//rows
		for (int i = 1; i <= 5; i++) {
			//cols
			for (int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			//end of the row
			System.out.println();
		}
	}
}
