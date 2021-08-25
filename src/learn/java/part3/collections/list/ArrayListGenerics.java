package learn.java.part3.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListGenerics {
	public static void main(String[] args) {
		List<String> languagesList = new ArrayList<String>();
		languagesList.add("java");
		languagesList.add("python");
		languagesList.add("golang");
		languagesList.add("c++");
		
		System.out.println("------- Iterating elements by Iterator --------");
		Iterator<String> itr = languagesList.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
		}

		System.out.println("----------- Iterating by normal for loop by index ----------");
		for(int i = 0; i < languagesList.size(); i++) {
			String s = languagesList.get(i);
			System.out.println(s);
		}
		
		System.out.println("----------- loop elements by for each -----------");
		for (String s : languagesList) {
			System.out.println(s);
			String substring = s.substring(2);
			System.out.println(substring);
		}
	}
}
