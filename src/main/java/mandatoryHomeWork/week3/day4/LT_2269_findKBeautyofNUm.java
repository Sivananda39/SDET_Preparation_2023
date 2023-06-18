package mandatoryHomeWork.week3.day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class LT_2269_findKBeautyofNUm {
//	Homework - 11/05/2023:
//		https://leetcode.com/problems/find-the-k-beauty-of-a-number/
	
//	The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:
//
//		It has a length of k.
//		It is a divisor of num.
//		Given integers num and k, return the k-beauty of num.
//
//		Note:
//
//		Leading zeros are allowed.
//		0 is not a divisor of any value.
//		A substring is a contiguous sequence of characters in a string.
//
//		 
//
//		Example 1:
//
//		Input: num = 240, k = 2
//		Output: 2
//		Explanation: The following are the substrings of num of length k:
//		- "24" from "240": 24 is a divisor of 240.
//		- "40" from "240": 40 is a divisor of 240.
//		Therefore, the k-beauty is 2.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findKBeauty();
	}

	public static void findKBeauty() {
		int num = 240;
		int k=2;
		int remainder=0;
		int count=0;
		String numValue = String.valueOf(num);
		String subString = "";
		int divisor=0;
		for (int i = 0; i <= numValue.length()-k; i++) {
			subString = numValue.substring(i, i+k);
			divisor = Integer.parseInt(subString);
			remainder = num % divisor;
			if (remainder ==0) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
