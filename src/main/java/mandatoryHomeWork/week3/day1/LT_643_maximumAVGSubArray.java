package mandatoryHomeWork.week3.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class LT_643_maximumAVGSubArray {
//	 Homework - 08/05/2023
//	 https://leetcode.com/problems/maximum-average-subarray-i
///You are given an integer array nums consisting of n elements, and an integer k.
//
//Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
//
// 
//
//Example 1:
//
//Input: nums = [1,12,-5,-6,50,3], k = 4
//Output: 12.75000
//Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		maxAvgSubArray();
	}

	public static void maxAvgSubArray() {
		int[] nums = {1,12,-5,-6,50,3};
		int k=4;
		int sum=0;
		double maxOutputAvg = 0, temp=0;
		for (int i = 0; i < k; i++) {
			sum=sum + nums[i];
		}
		System.out.println(sum);
		maxOutputAvg = sum/k;
		temp=maxOutputAvg;
		for (int j = k; j < nums.length; j++) {
			sum = sum + nums[j] - nums[j - k];
			maxOutputAvg = sum / k;
			if (temp > maxOutputAvg)
				maxOutputAvg = temp;
			temp = maxOutputAvg;
		}
		System.out.println(maxOutputAvg);
		
		if (temp < maxOutputAvg)
			System.out.println(maxOutputAvg);
	}

}
