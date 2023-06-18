package mandatoryHomeWork.week3.day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class LT_1200_minimumAbsoluteDifference {
//	Homework - 09/05/2023:
//		https://leetcode.com/problems/minimum-absolute-difference/
//	Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

//Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
//
//a, b are from arr
//a < b
//b - a equals to the minimum absolute difference of any two elements in arr
// 
//
//Example 1:
//
//Input: arr = [4,2,1,3]
//Output: [[1,2],[2,3],[3,4]]
//Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		minimumAbsoluteDifference();
	}

	public static void minimumAbsoluteDifference() {
		int[] arr = {4,2,1,3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int left=0;
		int diff=0;
		int k=1;
		for (int right = 1; right < arr.length; right++) {
			diff = arr[right]-arr[left];
			System.out.println("The diffrence is : "+diff);
			while(diff > k) {
				diff = diff + arr[left];
				
			}
			if (diff == k) {
				System.out.println(left + ", " + right);
			}
		}
	}

}
