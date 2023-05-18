package week3_WeekdayProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class week3day3program3_minDiffScores {
//	Homework - 10/05/2023:
//		https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/

//	Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
//
//	Return the minimum possible difference.
//
//	 
//
//	Example 1:
//
//	Input: nums = [90], k = 1
//	Output: 0
//	Explanation: There is one way to pick score(s) of one student:
//	- [90]. The difference between the highest and lowest score is 90 - 90 = 0.
//	The minimum possible difference is 0.
//	Example 2:
//
//	Input: nums = [9,4,1,7], k = 2
//	Output: 2
//	Explanation: There are six ways to pick score(s) of two students:
//	- [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
//	- [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
//	- [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
//	- [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
//	- [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
//	- [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
//	The minimum possible difference is 2.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(searchInsertPos());
	}

	private static int searchInsertPos() {
		int[] nums = { 9, 4, 1, 7 };
		Arrays.sort(nums);
		int left = 0, min = 0, diff = 0;
		int k = 2;

		for (int right = k - 1; right < nums.length; right++) {
			diff = nums[right] - nums[left];
			System.out.println("The diffrence is : " + diff);
			while (diff < k) {
				diff = diff + nums[left];
				System.out.println("Now The diffrence is : " + diff);
			}
			if (min == 0 || diff < min) {
				min = diff;
				left++;
			}
		}

		return min;
	}

}
