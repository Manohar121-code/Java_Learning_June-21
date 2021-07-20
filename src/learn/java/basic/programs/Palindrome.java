package learn.java.basic.programs;

public class Palindrome {
	public static void main(String[] args) {
		String s = "java";
		boolean isPalindrome = isPalindrome(s);
		System.out.println(isPalindrome);
	}
	
	public static boolean isPalindrome(String s) {
		String rev = "";
		for (int i = s.length()-1; i >= 0; i--) {
			char ch = s.charAt(i);
			rev = rev + ch;
		}
		boolean isPalindrome;
		if (rev.equals(s)) {
			isPalindrome = true;
		} else {
			isPalindrome = false;
		}
		return isPalindrome;
	} 
}
