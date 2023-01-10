package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListBasics {
	public static void main(String[] args) {
		
                List<String> learners = new ArrayList<String>();
                learners.add("Kripa");
                learners.add("Priya");
                learners.add("Krishnan");
                learners.add("Nilesh");
                learners.add("Jayanthi");
                
                
                
                learners.remove("Priya");
                System.out.println(learners);
                
                learners.add(2, "Karthick");
                learners.add("Saranya");
                System.out.println(learners);
                
                int size = learners.size();
                System.out.println(size);
                
               System.out.println(learners.get(2));
                
                learners.clear();
                System.out.println(learners);
               
                
	}
}
