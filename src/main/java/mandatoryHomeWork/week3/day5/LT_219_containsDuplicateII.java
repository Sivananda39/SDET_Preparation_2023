package mandatoryHomeWork.week3.day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class LT_219_containsDuplicateII {
//	Homework - 12/05/2023:
//	https://leetcode.com/problems/contains-duplicate-ii/
	
//	Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
//			 
//
//			Example 1:
//
//			Input: nums = [1,2,3,1], k = 3
//			Output: true
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findMajorityElement());
	}

	public static boolean findMajorityElement() {
		
		int[] nums= {1,2,3,1};
		int k=3;
		int diff =0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			System.out.println(map);
			diff = Math.abs(map.get(nums[i])-i);
			if (map.containsKey(nums[i]) && diff <= k) {
				return true;
			}
		}
		// get the no.of characters count each
		System.out.println(map);
		
		
		return false;
	}

}
