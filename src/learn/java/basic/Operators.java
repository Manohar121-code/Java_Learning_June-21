package learn.java.basic;

public class Operators {
	public static void main(String[] args) {
		System.out.println("**********TERNARY OPERATORS*********");
		int i = 11;
		String s = (i == 10) ? "i value is 10" : "i value is not 10";
		System.out.println(s);
		
		System.out.println("**********LOGICAL OPERATORS*********");
		int j = 25;
		if (j >= 10 || j < 20) {
			System.out.println("OR condition is evaluated as true");
		}
		
		if (j != 20 && j > i) {
			System.out.println("AND condition is evaluated as true");
		} else {
			System.out.println("AND condition is evaluated as false");
		}
		
		System.out.println("---------------------");
		
		int n1 = 10;
		int n2 = 20;
		if (n1 >= 40 || (n1 == n2 && n2 != 15)) {
			System.out.println("true");
		}
		
	}
}
