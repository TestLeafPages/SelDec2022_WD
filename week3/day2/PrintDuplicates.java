package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] nums = { 2, 4, 6, 3, 5, 3, 2, 1 };
		//output=2,3
		Set<Integer> unique = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			boolean add = unique.add(nums[i]);
			if (!add) {
				System.out.println(nums[i]);
			}
		}
	}

}
