package learn.java.part3.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetStudentEx {
	public static void main(String[] args) {
		Set<Student> set = new LinkedHashSet<Student>();
		
		Student s1 = new Student(1, "Naresh");
		Student s2 = new Student(2, "Suresh");
		Student s3 = new Student(1, "Naresh");
		Student s4 = new Student(3, "Puneeth");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		System.out.println(set.size());
		
		System.out.println(set);
	}
}
