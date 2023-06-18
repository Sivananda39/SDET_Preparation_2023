package mandatoryHomeWork.week3.day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class LT_1859_sortingTheSentence {
//	Homework - 11/05/2023:
//		https://leetcode.com/problems/sorting-the-sentence/

//	A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
//
//	A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
//
//	For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
//	Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
//
//	 
//
//	Example 1:
//
//	Input: s = "is2 sentence4 This1 a3"
//	Output: "This is a sentence"
//	Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sortTheSentence();
	}

	public static void sortTheSentence() {

		String input = "is2 sentence4 This1 a3";
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch >= '1' && ch <= '9') {
				map.put(ch - '0', temp);
				temp = "";
				System.out.println(map);
			}
			else if (ch != ' ')
				temp = temp + ch;
		}
		System.out.println(map);

		String sort = "";
		for (int i = 1; i <= map.size(); i++) {
			sort = sort + map.get(i) + " ";
		}
		System.out.println(sort);

		;
	}

}
