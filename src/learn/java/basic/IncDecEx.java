package learn.java.basic;

public class IncDecEx {
	public static void main(String[] args) {
		int i = 10;
		i++;
		System.out.println(i);
		
		int j = 20;
		j--;
		System.out.println(j);
		
		System.out.println("------------");
		
		++i;
		System.out.println(i);
		
		int k = 30;
		System.out.println(k++);
		System.out.println(k);//31
		
		System.out.println(++k);
		
		int h = 20;
		System.out.println(--h);//19
		
		System.out.println(h--);
		System.out.println(h);//18
		
		int p = 15;
		if (p++ == 15) {
			System.out.println("true");
		}
		
		int q = 13;
		int r = 15;
		if (++q == --r) {
			System.out.println("true");
		}
	}
}
