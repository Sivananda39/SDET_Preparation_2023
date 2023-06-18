package mandatoryHomeWork.week2.day4;

import java.util.Arrays;

public class LT_2000_reversePrefix {
//	Homework - 04/05/2023
//
//	https://leetcode.com/problems/reverse-prefix-of-word/
//	Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

//For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
//Return the resulting string.
//
// 
//
//Example 1:
//
//Input: word = "abcdefd", ch = "d"
//Output: "dcbaefd"
//Explanation: The first occurrence of "d" is at index 3. 
//Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
//Example 2:
//
//Input: word = "xyxzxe", ch = "z"
//Output: "zxyxxe"
//Explanation: The first and only occurrence of "z" is at index 3.
//Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reversePrefixofWord();
	}
	


	public static void reversePrefixofWord( ) {
	
		char prefix = 'd';
		String word = "abcdefd";
		char temp;
		char[] c = word.toCharArray();
		int left=0;
		int right=c.length ;
		for (int i = 0; i < right; i++) {
			
			if (c[i] == prefix) {
				right = i;
				break;
			}
		}
		
		while(left <= right) {
			
			temp = c[left];
			c[left] = c[right];
			c[right] = temp;
			left++;
			right--;
			
		}
		
		System.out.println(c);
		}
		
		
	
}
