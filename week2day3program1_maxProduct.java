package week2_WeekdayProblems;

import java.util.Arrays;

public class week2day3program1_maxProduct {
//	Homework - 03/05/2023
//
//	https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
//	Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
	 

//	Example 1:
//
//	Input: nums = [3,4,5,2]
//	Output: 12 
//	Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
//	Example 2:
//
//	Input: nums = [1,5,4,5]
//	Output: 16
//	Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
//	Example 3:
//
//	Input: nums = [3,7]
//	Output: 12
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		maxProductOfTwoElements();
	}
	


	public static void maxProductOfTwoElements( ) {
	
		int nums[] = {3,4,5,2};
		int left=0;
		int right=nums.length-1;
		int max1 =0, max2 = 0;
		
		for(left=0;left <=  right; left++, right--) {
			
			if (nums[left] < nums[right]) {
				
				
				if (nums[right] == max1) {
					max2 = max1;
				}
				else {
					if (nums[right] >= max1) {
						max1 = nums[right];
					}
					if (nums[left] >= max2) {
						max2 = nums[left];
					}
				}
				
			}
			else {
				
				if (nums[left] == max1) {
					max2 = max1;
				}
				else {
					if (nums[left] >= max1) {
						max1 = nums[left];
					}
					if (nums[right] >= max2) {
						max2 = nums[right];
					}
				}
			}
			
			
			}
		int maxProduct = ((max1-1) * (max2-1));
		System.out.println("Now returned maximum  output : " + maxProduct);
		}
		
		
	
}
