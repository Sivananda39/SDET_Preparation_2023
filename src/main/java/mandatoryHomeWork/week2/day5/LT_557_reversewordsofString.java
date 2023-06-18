package mandatoryHomeWork.week2.day5;

import java.util.Arrays;
import java.util.Iterator;

public class LT_557_reversewordsofString {
//	Homework - 05/05/2023
//	 https://leetcode.com/problems/reverse-words-in-a-string-iii/
//	Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
//	 
//
//	Example 1:
//
//	Input: s = "Let's take LeetCode contest"
//	Output: "s'teL ekat edoCteeL tsetnoc"

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseWordsinString();
	}

	public static void reverseWordsinString() {

		String s = "Let's take LeetCode contest";
		String[] str = s.split(" ");
		char[] c = s.toCharArray();
		int left=0, right=c.length-1;
		while (left <= right) {
			char temp = c[right];
			c[right] = c[left];
			c[left]=temp;
			left++;
			right--;
			
		}
			//reversing the entire sentence
			System.out.println(c);
			//converting to string
			String string = new String(c);  
			System.out.println(string);
			String[] s2 = string.split(" ");
			String rev = "";
			for (int i = 0; i < s2.length; i++) {
				rev = s2[i] + " " + rev;
				
			}
			//reversed words of astring as output
			 System.out.println(rev);
		

	}

}
