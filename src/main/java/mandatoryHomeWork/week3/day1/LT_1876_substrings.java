package mandatoryHomeWork.week3.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class LT_1876_substrings {
//	 Homework - 08/05/2023
//	 https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description
///A string is good if there are no repeated characters.
//
//Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
//
//Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
//
//A substring is a contiguous sequence of characters in a string.
//
// 
//
//Example 1:
//
//Input: s = "xyzzaz"
//Output: 1
//Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
//The only good substring of length 3 is "xyz".
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		substringsWithDistinctChars();
	}

	public static void substringsWithDistinctChars() {

		String s1 = "xyzzaz";
		int count = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		// get the no.of characters count each
		System.out.println(map);
		for (int j = 0; j < s1.length() - 2; j++) {
			int substring=0;
			for (int k = j + 1; k < (j + 3); k++) {

				if (s1.charAt(j) == s1.charAt(k))
					break;
				else if (k == (j + 2)) {
					if (s1.charAt(j + 1) == s1.charAt(k))
						break;
					else
						substring=substring+1;
				}
				else
					substring=substring+1;
			}
			 if(substring==2) count++;
		}
		
		System.out.println(count);

	}

}
