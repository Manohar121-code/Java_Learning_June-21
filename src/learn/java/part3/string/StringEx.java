package learn.java.part3.string;

public class StringEx {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println("s1 == s2");
		if (s1 == s2) {
			System.out.println("same address");
		} else {
			System.out.println("not same address");
		}
		
		System.out.println("s3 == s4");
		if (s3 == s4) {
			System.out.println("same address");
		} else {
			System.out.println("not same address");
		}
		
		System.out.println("-------------------------");
		
		System.out.println("s1.equals(s2)");
		if (s1.equals(s2)) {
			System.out.println("same data");
		} else {
			System.out.println("not same data");
		}
		
		System.out.println("s3.equals(s4)");
		if (s3.equals(s4)) {
			System.out.println("same data");
		} else {
			System.out.println("not same data");
		}
		
		System.out.println("-------------");
		String s5 = s3.intern();
		System.out.println(s1 == s5);
		
//		System.out.println(s3);
		
		String s = "java";
		String p = " is a programming language";
		s = s.substring(2);
	}
}
