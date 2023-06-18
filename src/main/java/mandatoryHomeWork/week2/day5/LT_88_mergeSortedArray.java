package mandatoryHomeWork.week2.day5;

import java.util.Arrays;

public class LT_88_mergeSortedArray {
//	Homework - 05/05/2023
//	 https://leetcode.com/problems/merge-sorted-array/
//	You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//
//	Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//	The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//
//	 
//
//	Example 1:
//
//	Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//	Output: [1,2,2,3,5,6]
//	Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//	The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mergeSortedArrays();
	}

	public static void mergeSortedArrays() {

		int[] nums1 = { 1,2,3};
		int[] nums2 = { 2,5,6 };
		int left=0,right=0,index=0;
		int[] output = new int[nums1.length+nums2.length];
		while(left >= 0) {
			
			if (right >= nums2.length) {
				output[index]=nums1[left];
				
			}
			else if (left >= nums1.length) {
				output[index]=nums2[right];
				
			}
			else if (nums1[left] < nums2[right]) {
				output[index]=nums1[left];
				left++;
				index++;
				
			}
			else
			{
				output[index]=nums2[right];
				right++;
				index++;
				
			}
			
			
		}
		

		System.out.println("  Merged sorted integer array is : " + Arrays.toString(output));

	}

}
