package learn.java.basic;

public class ConditionalStatements {
	public static void main(String[] args) {
		System.out.println("Main started");
		int i = 20;
		if (i == 20) {
			System.out.println("if condition is executed");
		}
		
		System.out.println("------------------------------");
		
		if (i == 15) {
			System.out.println("if condition is executed");
		} else {
			System.out.println("else condition is executed");
		}
		
		System.out.println("------------------------------");
		
		if (i > 20) {
			System.out.println("i value is 20+");
		} else if (i < 20) {
			System.out.println("i value is 20-");
		} else {
			System.out.println("i value is 20");
		}
		System.out.println("Main ended");
	}
}
