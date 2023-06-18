package mandatoryHomeWork.week2.day3;

import java.util.Arrays;

public class LT_942_stringMatchofDI {
//	Homework - 03/05/2023
//
//	https://leetcode.com/problems/di-string-match/
//	A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

//s[i] == 'I' if perm[i] < perm[i + 1], and
//s[i] == 'D' if perm[i] > perm[i + 1].
//Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
//
// 
//
//Example 1:
//
//Input: s = "IDID"
//Output: [0,4,1,3,2]
//Example 2:
//
//Input: s = "III"
//Output: [0,1,2,3]
//Example 3:
//
//Input: s = "DDI"
//Output: [3,2,0,1]
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stringMatchofID();
	}
	


	public static void stringMatchofID( ) {
	
		String Str = "IDID";
		int left=0;
		int right=Str.length()+1;
		int[] resultArr = new int[right];
		int i=0;
		for(i=0; i< Str.length();i++) {
			
			if (Str.charAt(i) == 'I') {
				resultArr[i] = left++;
			}
			else {
				resultArr[i] = --right;
			}
			System.out.println(resultArr[i] + " , ");
			}
		
		if (Str.charAt(i-1) == 'I') {
			resultArr[i] = --right;
		}
		else {
			resultArr[i] = left;
		}
		
		System.out.println("Now returned stringMatchofID : " + resultArr[i]);
		}
		
		
	
}
