package week_6.day_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class LT_2540_minCommonValue {
//	Homework - 30/05/2023

//https://leetcode.com/problems/minimum-common-value/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minCommonVal());
	}

	public static int minCommonVal() {
		int nums1[] = { 1, 2, 3 };
		int nums2[] = { 2, 4 };
		int left = 0;
		int right = 0;
		int min = Integer.MAX_VALUE;

		while (left < nums1.length && right < nums2.length) {

			if (nums1[left] == nums2[right]) {
				if (min > nums1[left])
					min = nums1[left++];
				right++;
			} else if (nums1[left] < nums2[right]) {
				left++;
			} else
				right++;

		}
		if (min == Integer.MAX_VALUE)
			return -1;
		return min;
	}

}
