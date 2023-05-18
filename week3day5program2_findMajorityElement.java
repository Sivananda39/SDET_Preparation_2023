package week3_WeekdayProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class week3day5program2_findMajorityElement {
//	Homework - 12/05/2023:
//		https://leetcode.com/problems/majority-element/
//	Given an array nums of size n, return the majority element.
//
//			The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//			 
//
//			Example 1:
//
//			Input: nums = [3,2,3]
//			Output: 3

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findMajorityElement();
	}

	public static void findMajorityElement() {
		
		int[] nums= {3,2,3};
		int majorEle=nums.length/2;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		// get the no.of characters count each
		System.out.println(map);
		for (int j = 0; j < nums.length-1; j++) {
			if (map.get(nums[j]) > majorEle) {
				System.out.println(nums[j]);
			}
		}
		
		
	}

}
