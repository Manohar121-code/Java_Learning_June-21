package learn.java.basic.patternProgramming;

//n = 5;
//    *			i = 1  spaces = 4  stars = 1
//   ***		i = 2  spaces = 3  stars = 3
//  *****		i = 3  spaces = 2  stars = 5
// *******		i = 4  spaces = 1  stars = 7
//*********		i = 5  spaces = 0  stars = 9
// *******		i = 4  spaces = 1  stars = 7
//  *****		i = 3  spaces = 2  stars = 5
//   ***		i = 2  spaces = 3  stars = 3
//    *			i = 1  spaces = 4  stars = 1
public class Pattern10 {
	public static void main(String[] args) {
		int n = 5;
		// first part
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}

			// stars
			for (int k = 1; k <= ((2 * i) - 1); k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		//second part
		for (int i = n-1; i >= 1; i--) {
			
			//spaces
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			
			//stars
			for (int k = 1; k <= (i * 2)-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
