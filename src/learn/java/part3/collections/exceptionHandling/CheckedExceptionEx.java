package learn.java.part3.collections.exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionEx {
	public static void main(String[] args) {
		File f = new File("D://test/abcd.txt");
		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println("File location is invalid");
		}
	}
}
