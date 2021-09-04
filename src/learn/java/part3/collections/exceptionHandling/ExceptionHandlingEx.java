package learn.java.part3.collections.exceptionHandling;

import learn.java.part3.collections.map.Employee;

public class ExceptionHandlingEx {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		if (j != 0) {
			int div = i / j;
			System.out.println(div);
		} else {
			System.out.println("please enter valid digit to divide");
		}
		
		try {
			int div = i / j;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occurred please enter proper digit to divide "+ e.getMessage());
		}
		
		Employee obj = new Employee(1, "xyz");
		int id = obj.getId();
		System.out.println("id - "+id);
		
		Employee obj2 = null;
		if (obj2 != null) {
			int id2 = obj2.getId();
			System.out.println("id - "+ id2);
		}
		
		try {
			int id2 = obj2.getId();
			System.out.println("id - "+ id2);
		} catch (NullPointerException npe) {
			System.out.println("Performing some operations on null");
		}
		
		System.out.println("Main ended");
		
	}
}
