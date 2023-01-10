package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		String companyName = "google";
		String str = "";
		char[] charArray = companyName.toCharArray();
		Set<Character> unique = new LinkedHashSet<>();
		for (int i = 0; i < charArray.length; i++) {
			unique.add(charArray[i]);
		}
		System.out.println(unique);//[g,o,l,e]
		for (Character each : unique) {
			str=str+each;
		}
		System.out.println(str);
	}

}
