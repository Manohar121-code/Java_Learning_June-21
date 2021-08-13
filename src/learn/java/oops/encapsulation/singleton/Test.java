package learn.java.oops.encapsulation.singleton;

public class Test {
	
	private static Test obj;
	
	private Test() {
		
	}
	
	public static Test getObject() {
		if (obj == null) {
			obj = new Test();
		}
		return obj;
	}

}
