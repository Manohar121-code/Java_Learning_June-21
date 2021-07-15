package learn.java.basic.patternProgramming;

//****
//*  *
//*  *
//****

public class Pattern11 {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			inner:
			for (int j = 1; j <= n; j++) {
				if ((i != 1 && i != n) && (j != 1 && j != n)) {
					System.out.print(" ");
					continue inner;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
