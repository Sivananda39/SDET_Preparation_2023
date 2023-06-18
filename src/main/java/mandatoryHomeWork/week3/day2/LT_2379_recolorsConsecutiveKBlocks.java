package mandatoryHomeWork.week3.day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class LT_2379_recolorsConsecutiveKBlocks {
//	Homework - 09/05/2023:
//		https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
//	You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.
//
//	You are also given an integer k, which is the desired number of consecutive black blocks.
//
//	In one operation, you can recolor a white block such that it becomes a black block.
//
//	Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
//
//	 
//
//	Example 1:
//
//	Input: blocks = "WBBWWBBWBW", k = 7
//	Output: 3
//	Explanation:
//	One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
//	so that blocks = "BBBBBBBWBW". 
//	It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
//	Therefore, we return 3.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		recolorConsecutiveBlocks();
	}

	public static void recolorConsecutiveBlocks() {

		String blocks = "WBBWWBBWBW";
		int k = 7;
		int num = 0;
		int minOccur = blocks.length();
		int left = 0, right = 0;
		int max = Integer.MAX_VALUE;
		while (left < minOccur) {
			if (blocks.charAt(left) == 'W') {
				num++;
				System.out.println(num + "      ; from left ");
			}
			else if (left - right +1 == k) {
				max=Math.min(num, max);
				if (blocks.charAt(right) == 'W') {
					num--;
					System.out.println(num + "  ;from right ");
				}
				right++;
			}
			left++;
		}
		
		System.out.println("min occurence is " +num);

	}

}
