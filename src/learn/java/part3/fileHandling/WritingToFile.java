package learn.java.part3.fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingToFile {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("D://fileIOEx/sample.txt");
			System.out.println("Enter something");
			fw.write(new Scanner(System.in).nextLine());
		} catch (Exception e) {
			System.out.println("Exception occurred - "+ e.getMessage());
		} finally {
			fw.close();
		}
		System.out.println("Writing to file done successfully");
	}
}
