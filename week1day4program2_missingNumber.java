import java.util.Arrays;

import org.testng.annotations.Test;

public class week1day4program2_missingNumber {
//	27/04/2023:
//	2. https://leetcode.com/problems/missing-number/description/

//	Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//
//			 
//
//			Example 1:
//
//			Input: nums = [3,0,1]
//			Output: 2
//			Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//			Example 2:
//
//			Input: nums = [0,1]
//			Output: 2
//			Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//			Example 3:
//
//			Input: nums = [9,6,4,2,3,5,7,0,1]
//			Output: 8
//			Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
//	
//	

	@Test
	public void example1() {
		
//		int nums[] = {0,1,3};
		int nums[] = {9,6,4,2,3,5,7,0,1};
		
//		missingNUmberifsorted(nums);
		missingNUmberifUnsorted(nums);
	}
	
	


	public static void missingNUmberifsorted(int nums[] ) {
		
		for (int i = 0; i < nums.length; i++) {
			if (i != nums[i]) {
				System.out.println("Missing Number in a sorted array is : " + i);
				
			}
		}
        
		}
public static void missingNUmberifUnsorted(int nums[] ) {
		Arrays.sort(nums);
		int index = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != index) {
				System.out.println("Missing Number in an Un sorted array is : " + index);
				i--;
			}
			index++;
		}
        
		}
        
	

	
}
