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
		
		System.out.println("-------------");
		
		SortByName sbn = new SortByName();
		Set<Student> set2 = new TreeSet<Student>(sbn);
		
		Student s5 = new Student(1, "Naresh");
		Student s6 = new Student(2, "Suresh");
		Student s7 = new Student(1, "Naresh");
		Student s8 = new Student(3, "Puneeth");
		Student s9 = new Student(4, "Arun");
		Student s10 = new Student(5, "Yogesh");
		
		set2.add(s5);
		set2.add(s6);
		set2.add(s7);
		set2.add(s8);
		set2.add(s9);
		set2.add(s10);
		
		for (Student student : set2) {
			System.out.println(student);
		}
	}
}
