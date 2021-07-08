package learn.java.basic.array;

public class ArrayEx {
	public static void main(String[] args) {
//		<datatype>[] <identifier> = new <datatype>[size];
		int[] arr = new int[10];
//		int arr[] = new int[10];
//		arr[2] = 30;
//		int i = arr[2];
//		System.out.println(i);
		
		System.out.println("Length - "+ arr.length);
		
		int k = 10;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("placing value in "+ i + " index and value - " + k);
			arr[i] = k++;
		}
		
		System.out.println("************RETRIEVING FROM ARRAY***********");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("----------------------");
		
		int[] arr2 = {1,2,3,4,5};
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
