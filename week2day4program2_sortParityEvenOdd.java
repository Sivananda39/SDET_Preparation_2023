package week2_WeekdayProblems;

import java.util.Arrays;

public class week2day4program2_sortParityEvenOdd {
//	Homework - 04/05/2023
//	https://leetcode.com/problems/sort-array-by-parity/
//	Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//
//	Return any array that satisfies this condition.
//
//	 
//
//	Example 1:
//
//	Input: nums = [3,1,2,4]
//	Output: [2,4,3,1]
//	Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sortparityEvenOdd();
	}

	public static void sortparityEvenOdd() {

		int[] nums = { 3, 1, 2, 4 };
		int reaminder = 0;
		int[] output = new int[nums.length];
		int left = 0;
		int right = nums.length - 1;
		System.out.println("  Given integer Array is : " + nums);
		for (int i = 0; i <nums.length; i++) {
			
			reaminder = nums[i]%2;
			if(reaminder == 0 && i > nums.length/2){
				output[left] = nums[i];
				left++;	
			}
			else if(reaminder != 0 && i > nums.length/2){
				output[right] = nums[i];
				right--;	
			}
			else if(reaminder != 0 && i <= nums.length/2){
				output[right] = nums[i];
				right--;	
			}
			else if(reaminder == 0 && i <= nums.length/2){
				output[left] = nums[i];
				left++;	
			}
			

		}

		System.out.println("  sorted integer array is : " + Arrays.toString(output));

	}

}
