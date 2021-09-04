package learn.java.part3.collections.exceptionHandling;

import learn.java.part3.collections.map.Employee;

public class MultiCatchEx {
	public static void main(String[] args) {
		try {
			Employee obj = new Employee(1, "uygiui");
			int id = obj.getId();
			System.out.println("ID - "+ id);
			int div = 10/0;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Performing on null");
		} catch (Exception e) {
			System.out.println("Some exception occurred "+ e.getMessage());
		}
		
		System.out.println("Main Ended");
	}
}
