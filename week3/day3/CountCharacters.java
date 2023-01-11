package week3.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountCharacters {

	public static void main(String[] args) {

		String companyName = "amazon india";
		// a-3,m-1,z-1,o-1,n-2,i-2,d-1, -1
		// Character-Key
		// Integer-Value

		Map<Character, Integer> map = new HashMap<>();

		/*
		 * Convert String to character array loop through each character add the
		 * character to the map
		 */
         //find the occurence of each character
		char[] charArray = companyName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char key = charArray[i];
			if (map.containsKey(key)) { 
				Integer value = map.get(key);
				map.put(key, value + 1);
			} else {

				map.put(key, 1);
			}
		}
		System.out.println(map);
		
		//Print only single occurence
		for (Entry<Character, Integer> eachEntry : map.entrySet()) {
			if (eachEntry.getValue()==1) {
				System.out.println(eachEntry.getKey());
			}
			
		}
      
		//find the maximum occuring character
		int maxOccurNum=0;
		char maxOccurChar=0;
		for (Entry<Character, Integer> entry: map.entrySet()) {
			if (entry.getValue()>maxOccurNum) {
				maxOccurNum = entry.getValue();
				maxOccurChar = entry.getKey();
			}
			
		}
		System.out.println("Max occuring is "+ maxOccurChar + " and occurences is : "+maxOccurNum);
	}

}
