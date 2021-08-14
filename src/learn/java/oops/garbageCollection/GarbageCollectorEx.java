package learn.java.oops.garbageCollection;

public class GarbageCollectorEx {
	public static void main(String[] args) {
		Employee obj = new Employee();
		
		obj = new Employee();
		
		Employee temp = obj;
		
		obj = null;
		
		System.gc();
		Runtime.getRuntime().gc();
	}
}
