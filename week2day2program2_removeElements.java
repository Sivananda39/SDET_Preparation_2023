package week2_WeekdayProblems;

import java.util.Arrays;

public class week2day2program2_removeElements {
//	Homework - 02/05/2023
//	https://leetcode.com/problems/remove-element/
//	The judge will test your solution with the following code:
//
//		int[] nums = [...]; // Input array
//		int val = ...; // Value to remove
//		int[] expectedNums = [...]; // The expected answer with correct length.
//		                            // It is sorted with no values equaling val.
//
//		int k = removeElement(nums, val); // Calls your implementation
//
//		assert k == expectedNums.length;
//		sort(nums, 0, k); // Sort the first k elements of nums
//		for (int i = 0; i < actualLength; i++) {
//		    assert nums[i] == expectedNums[i];
//		}
//		If all assertions pass, then your solution will be accepted.
//
//			 
//	Example 1:
//
//		Input: nums = [3,2,2,3], val = 3
//		Output: 2, nums = [2,2,_,_]
//		Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//		It does not matter what you leave beyond the returned k (hence they are underscores).
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removeElements();
	}
	


	public static void removeElements( ) {
	
		int nums[] = {3,2,2,3};
		int left=0;
		int right=nums.length-1;
		int k=3;
		while(left <=  right) {
			
			if(nums[left] == k && nums[right] != k) {
				nums[left++] = nums[right];
				nums[right--] = k;
			}
			else if(nums[right] == k) {
				right--;
			}
			else if(nums[left] != k) {
				left++;
			}
			}
		System.out.println("Now updated output : " +Arrays.toString(nums));
		}
		
		
	
}
