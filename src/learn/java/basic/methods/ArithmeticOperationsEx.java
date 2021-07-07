package learn.java.basic.methods;

public class ArithmeticOperationsEx {
	public static void main(String[] args) {
		int i = 20;
		int j = 4;
		int sum = add(i, j);
		System.out.println("Sum - " + sum);
		
		int sub = sub(i, j);
		System.out.println("Sub - "+ sub);
		
		int mul = mul(i, j);
		System.out.println("Mul - "+ mul);
		
		int div = div(i, j);
		System.out.println("Div - "+ div);
		
		int modulo = modulo(i, j);
		System.out.println("Rem - "+ modulo);
		
	}
	
	public static int add(int i, int j) {
		int sum = i + j;
		return sum;
	}
	
	public static int sub(int i, int j) {
		int sub = i - j;
		return sub;
	}
	
	public static int mul(int i, int j) {
		int mul = i * j;
		return mul;
	}
	
	public static int div(int i, int j) {
		int div = i / j;
		return div;
	}
	
	public static int modulo(int i, int j) {
		int rem = i % j;
		return rem;
	}
}
