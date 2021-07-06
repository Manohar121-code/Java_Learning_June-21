package learn.java.basic.loops;

public class WhileLoopEx {
	public static void main(String[] args) {
//		dec/init
//		while(condition) {
//			block of code
//			inc/dec
//		}
		
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("------------------");
		
		int j = 5;
		while (j >= 1) {
			System.out.println(j);
			j--;
		}
	}
}
