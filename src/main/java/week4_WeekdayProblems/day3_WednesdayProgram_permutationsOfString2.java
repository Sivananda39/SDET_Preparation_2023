package week4_WeekdayProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class day3_WednesdayProgram_permutationsOfString2 {
//	sathish kumar10:17 PM
//	Input: s1 = "ab", s2 = "eidbaooo"
//	Output: true
//	Explanation: s2 contains one permutation of s1 ("ba").
//
//	sathish kumar10:18 PM
//	Input: s1 = "ab", s2 = "eidboaoo"
//	Output: false

	/*
	 * pseudocode take given string and convert to chararray now with chararaay
	 * traverse till ch.lenght
	 * swap each char and vice versa
	 * add each swapped ones and print all at once
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(permutationString());
	}

	public static boolean permutationString() {
		String s1 = "sadbutsad";
		String s2 = "sad";
		
		HashMap<Character, Integer> mapStr = new HashMap<Character, Integer>();
		  
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			mapStr.put(c, mapStr.getOrDefault(c, 0) + 1);
		}
		// get the no.of characters count each
		System.out.println(mapStr);
		
		HashMap<Character, Integer> mapStr2 = new HashMap<Character, Integer>();
		  
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			mapStr2.put(c, mapStr.getOrDefault(c, 0) + 1);
		}
		// get the no.of characters count each
		System.out.println(mapStr2);
		
		
		
			if (mapStr.containsValue(mapStr2)) {
				return true;
			}
			
				
				
		
		return false;
		
		
		
		

	}

}
