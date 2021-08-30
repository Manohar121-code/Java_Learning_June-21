package learn.java.part3.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetStudentEx {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<Student>();
		
		Student s1 = new Student(1, "Naresh");
		Student s2 = new Student(2, "Suresh");
		Student s3 = new Student(1, "Naresh");
		Student s4 = new Student(3, "Puneeth");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		for (Student student : set) {
			System.out.println(student);
		}
	}
}
