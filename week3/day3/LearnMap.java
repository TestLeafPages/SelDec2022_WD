package week3.day3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {
	   //employeeId,employeenames
		
     Map<Integer, String>	map = new LinkedHashMap<>();
     map.put(101, "Jayanthi");
     map.put(232, "Ramya");
     map.put(102, "sudeshwari");
     map.put(432, "Soma Sundaresh");
     map.put(211, "Sri");
     map.put(341, "Nilesh");
     map.put(232, "Karthick");
     
     map.remove(211);
     
     String value = map.get(101);
     System.out.println(value);
     
     System.out.println(map);
     
     Set<Integer> keySet = map.keySet();
     for (Integer eachKey : keySet) {//101, 232, 102, 432, 341
		//System.out.println(eachKey +"->" +map.get(eachKey));
		System.out.println(map.get(eachKey));
	}
     System.out.println("2nd Method---------------------");
     Set<Entry<Integer, String>> entrySet = map.entrySet();
     for (Entry<Integer, String> eachEntry : entrySet) {
		//System.out.println(eachEntry.getKey());
		System.out.println(eachEntry.getValue());
	}

	}

}
