package learn.java.oops;

public class StudentMainEx {
	public static void main(String[] args) {
		
//		Student.schoolName = "Kakatiya";
		
		Student s1 = new Student();
		s1.rollNum = 1;
		s1.name = "Naresh";
		s1.schoolName = "Kakatiya";
		
		System.out.println(s1.schoolName);
		System.out.println(Student.schoolName);
		
		Student s2 = new Student();
		s2.rollNum = 2;
		s2.name = "Lavanya";
		s2.schoolName = "Govt high school";
		
		System.out.println(s2.schoolName);
		System.out.println(s1.schoolName);
		System.out.println(Student.schoolName);
	}
}
