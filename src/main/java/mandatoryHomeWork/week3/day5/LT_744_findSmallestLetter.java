package mandatoryHomeWork.week3.day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class LT_744_findSmallestLetter {
//	Homework - 12/05/2023:
//		https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
	
//	You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//
//	Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
//
//	 
//
//	Example 1:
//
//	Input: letters = ["c","f","j"], target = "a"
//	Output: "c"
//	Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
//	Example 2:
//
//	Input: letters = ["c","f","j"], target = "c"
//	Output: "f"
//	Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findSmalletLetterGreatthanTarget());
	}

	public static char findSmalletLetterGreatthanTarget() {
		char[] letters = {'c','f','j'};
		char target = 'a';
		for (int i = 0; i < letters.length; i++) {
			
			if (letters[i] <= target && letters[i+1] > target) {
				 return letters[i];
			}
			
				
		}
		return letters[0];
		
	}

}
