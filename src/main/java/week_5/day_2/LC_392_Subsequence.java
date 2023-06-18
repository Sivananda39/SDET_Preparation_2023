package week_5.day_2;

import java.util.ArrayList;
import java.util.List;

public class LC_392_Subsequence {
	// Homework 23/05/2023:
//	https://leetcode.com/problems/is-subsequence/
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			subsqnce();
		}

		public static boolean  subsqnce() {
			
			String s="abc";
			String t ="ahbgdc";
			 int left=0;
				int right=0;
				int count=0;
				if((s.length()==0 && t.length()==0) || s.length()==0) return true;
				else if( t.length()==0) return false;
				else {
				while(right<t.length()) {
					if(s.charAt(left)==t.charAt(right)) {
						count++;
						if(count==s.length()) return true;
						
						left++;
						right++;
					}
					else {
						right++;
					}
				}
				}
				return false;
	   		
		}
}
