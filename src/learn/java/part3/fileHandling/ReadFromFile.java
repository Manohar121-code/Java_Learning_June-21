package learn.java.part3.fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D://fileIOEx/sample.txt");
		int k = 0;
		while ((k = fr.read()) != -1) {
			char ch = (char) k;
			System.out.print(ch);
		}
		fr.close();
	}
}
