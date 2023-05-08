package week2_WeekdayProblems;

import java.util.Arrays;

public class week2day2program1_mergeStringsWords {
//	Homework - 02/05/2023
//
//	https://leetcode.com/problems/merge-strings-alternately/description/	
//	You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//
//	Return the merged string.
//
//	 
//
//	Example 1:
//
//	Input: word1 = "abc", word2 = "pqr"
//	Output: "apbqcr"
//	Explanation: The merged string will be merged as so:
//	word1:  a   b   c
//	word2:    p   q   r
//	merged: a p b q c r
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mergeTwoStrings();
	}
	


	public static void mergeTwoStrings( ) {
	
		String str1 = "abc";
		String str2 = "pqr";
		String mergedSTR = "";
		int length =0;
		int i = 0;
		if (str1.length() < str2.length()) {
			mergedSTR = str2;
		}
		else
			length = str1.length();
		
		
		for (; i < length; i++) {
			mergedSTR = mergedSTR + str1.charAt(i) + str2.charAt(i);
		}
		if (length < str1.length()) {
			mergedSTR = mergedSTR + str1.substring(i);
		}
		else if (length < str2.length()) {
			mergedSTR = mergedSTR + str1.substring(i);
		
			
		}
		System.out.println(mergedSTR);
	}
}
