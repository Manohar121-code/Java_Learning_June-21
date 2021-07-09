package learn.java.basic.string;

public class StringBasics {
	public static void main(String[] args) {
		String s = "java";
		int len = s.length();
		System.out.println("Length - "+ len);
		
		char ch = s.charAt(2);
		System.out.println("char at 2nd index - "+ ch);
		
		int i = s.indexOf('a');
		System.out.println("index of a - "+ i);
		
		int i2 = s.indexOf('a', 2);
		System.out.println("index of a from 2nd index - "+ i2);
		
		int i3 = s.lastIndexOf('a');
		System.out.println("last index of a - "+ i3);
		
		String concat = s.concat(" is a programming language");
		System.out.println(concat);
		
		boolean equals = s.equals("java");
		System.out.println(equals);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		System.out.println("--------------");
		String s2 = "once upon a time king was there";
		String[] strArr = s2.split(" ");
		System.out.println(strArr.length);
		for (int j = 0; j < strArr.length; j++) {
			System.out.println(strArr[j]);
		}
		System.out.println("--------------");
		
		boolean startsWith = s2.startsWith("twice");
		System.out.println(startsWith);
		
		boolean endsWith = s2.endsWith("was there");
		System.out.println(endsWith);
		
		String substring = s2.substring(5);
		System.out.println(substring);
		
		String substring2 = s2.substring(5, 14);
		System.out.println(substring2);
		
		System.out.println("----------------------");
		char[] charArray = s.toCharArray();
		for (int j = 0; j < charArray.length; j++) {
			System.out.println(charArray[j]);
		}
		System.out.println("----------------------");
		
		String upperCase = s2.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);
		
		String s3 = "   dirty string  ";
		String trim = s3.trim();
		System.out.println(trim);
		
		int i4 = 10;
		boolean b = true;
		String valueOf = String.valueOf(b);
		System.out.println(valueOf);
		
	}
}
