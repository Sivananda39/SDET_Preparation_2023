package week_6.day_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class LT_28_IndexOfFirstOccurenceInString {
//	Homework - 29/05/2023


//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

//	Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//			 
//
//			Example 1:
//
//			Input: haystack = "sadbutsad", needle = "sad"
//			Output: 0
//			Explanation: "sad" occurs at index 0 and 6.
//			The first occurrence is at index 0, so we return 0.
//	Example 2:
//
//		Input: haystack = "leetcode", needle = "leeto"
//		Output: -1
//		Explanation: "leeto" did not occur in "leetcode", so we return -1.
	/*
	 * pseudocode take given strings and compare if a string contains b
	 * if contains return index else return -1
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "sadbutsad";
//		String s2 = "sad";
		String s1 = "leetcode";
		String s2 = "leeto";
		System.out.println(occurenceStrings(s1, s2));
	}

	public static int occurenceStrings(String s1, String s2) {
		
		if(s1.contains(s2)){
            int s = s1.indexOf(s2);
            return s;
        }
    return -1;
	}

}
