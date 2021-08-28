package learn.java.part3.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfStudentEx {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		Student s1 = new Student(1, "kiran");
		Student s3 = new Student(1, "Saran");
		Student s2 = new Student(2, "Sathish");
		
		set.add(s1);
		set.add(s3);
		set.add(s2);
		
		System.out.println(set.size());
		
		for (Student student : set) {
			System.out.println(student);
		}
		
		System.out.println("------------");
		
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		
	}
}
