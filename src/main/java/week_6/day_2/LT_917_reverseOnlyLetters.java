package week_6.day_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class LT_917_reverseOnlyLetters {
//	Homework - 30/05/2023


//https://leetcode.com/problems/reverse-only-letters/ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 reverseOnlyLetters();
	}

	public static void reverseOnlyLetters() {
		String s="ab-cd";
		
		char[] sArr=s.toCharArray();
		int left=0;
		int right=s.length()-1;
		
		while(left<=right) {
		if(isChar(sArr[left]) && isChar(sArr[right])) {
			char temp=sArr[left];
			sArr[left++]=sArr[right];
			sArr[right--]=temp;
		}
		else if(!isChar(sArr[left])) {
			left++;
		}
		
		else {
			right--;
		}
		}
		s="";
		for (char c : sArr) {
			s=s+c;
		}
		System.out.println(s);
	}
	public static boolean isChar(int sArr) {
		
		
		if(('A'<=sArr && sArr<='Z') || ('a'<=sArr && sArr<='z')) {
			return true;
		}
		
		return false;
	}

}
