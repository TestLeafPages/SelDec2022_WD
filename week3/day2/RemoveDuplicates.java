package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = { 2, 4, 6, 3, 5, 3, 2, 1 };
		// Output=4,6,5,1
		Set<Integer> unique = new LinkedHashSet<>();
		for (int i = 0; i < nums.length; i++) {
			unique.add(nums[i]);
		}
		System.out.println(unique);
	}

}
