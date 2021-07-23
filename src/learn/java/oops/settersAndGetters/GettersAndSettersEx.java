package learn.java.oops.settersAndGetters;

public class GettersAndSettersEx {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRollNum(1);
		s1.setName("Arjun");
		
//		Student s2 = new Student();
//		s2.setRollNum(2);
//		s2.setName("Gopi");
		
		int rollNum = s1.getRollNum();
		String name = s1.getName();
		System.out.println(rollNum);
		System.out.println(name);
	}
}
