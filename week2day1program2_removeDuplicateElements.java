package week2_WeekdayProblems;

import java.util.Arrays;

public class week2day1program2_removeDuplicateElements {
//	Homework - 01/05/2023
//	https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//		The judge will test your solution with the following code:
//
//			int[] nums = [...]; // Input array
//			int[] expectedNums = [...]; // The expected answer with correct length
//
//			int k = removeDuplicates(nums); // Calls your implementation
//
//			assert k == expectedNums.length;
//			for (int i = 0; i < k; i++) {
//			    assert nums[i] == expectedNums[i];
//			}
//			If all assertions pass, then your solution will be accepted.
//
//			 
//
//			Example 1:
//
//			Input: nums = [1,1,2]
//			Output: 2, nums = [1,2,_]
//			Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//			It does not matter what you leave beyond the returned k (hence they are underscores).
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removeDuplicatesSortedArray();
	}
	


	public static void removeDuplicatesSortedArray( ) {
	
		int nums[] = {1,1,2};
		int left=0;
		int right=1;
		while(right < nums.length) {
			
			int i=nums[left];
			int j=nums[right];
			if (i==j) {
				right++;
			}
			else if (i < j){
				left++;
				nums[left] = nums[right];
				right++;
			}
			
		}
		System.out.println("total  non duplicates: " + left);
		int[] expectedNums = new int[left];
		int k = expectedNums.length;
		for (int i = 0; i < k; i++) {
		     expectedNums[i]=nums[i];
		}
		System.out.println("Now updated output : " +Arrays.toString(expectedNums));
	}
}
