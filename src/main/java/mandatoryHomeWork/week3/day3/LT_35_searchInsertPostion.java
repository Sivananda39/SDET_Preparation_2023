package mandatoryHomeWork.week3.day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class LT_35_searchInsertPostion {
//	Homework - 10/05/2023:
//		https://leetcode.com/problems/search-insert-position/description/
	
//	Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//			You must write an algorithm with O(log n) runtime complexity.
//
//			 
//
//			Example 1:
//
//			Input: nums = [1,3,5,6], target = 5
//			Output: 2

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(searchInsertPos());
	}

	private static int  searchInsertPos() {
		int[] nums = {1,3,5,6};
		int left=0, mid=0;;
		int right=nums.length-1;
		int k=5;
		while (left < right) {
			mid = (left+right)/2;
			if (nums[mid]==k) {
				return mid;
			}
			else if (nums[mid]<k) {
				left=mid+1;
			}
			else if (nums[left] >= k) {
				return left;
			}
			else if (nums[left]< k) {
				return left+1;
			}
			else {
				right = mid-1;
			}
				
			
		}
		
	return left;	
	}

}
