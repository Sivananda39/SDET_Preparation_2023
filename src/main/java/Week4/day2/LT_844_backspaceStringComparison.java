package Week4.day2;

import java.util.Stack;

public class LT_844_backspaceStringComparison {
//	 Homework - 16/05/2023
//	https://leetcode.com/problems/backspace-string-compare/

//	Example 1:

//Input: s = "ab#c", t = "ad#c"
//Output: true
//Explanation: Both s and t become "ac".
//Example 2:
//
//Input: s = "ab##", t = "c#d#"
//Output: true
//Explanation: Both s and t become "".
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(backSpaceStringComparison());
	}

	
		public static boolean backSpaceStringComparison() {
			String s = "ab#c" ;
			String t= "ad#c";
			
			StringBuilder sb= new StringBuilder();
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)!='#') {
					sb.append(s.charAt(i));
					count=i;//2
				}
				else {
					//sb.deleteCharAt(i);
					//count--;//1
					sb.deleteCharAt(count);
					count--;
				}
			}
			System.out.println(sb);
			StringBuilder sbt= new StringBuilder();
			count=0;
			for(int i=0;i<t.length();i++) {
				if(t.charAt(i)!='#') {
					sbt.append(t.charAt(i));
					count=i;
				}
				else {
					//sbt.deleteCharAt(i);
					count--;
				}
			}
			
			System.out.println(sbt);
			s=sb.toString();
			t=sbt.toString();
			if(s.equals(t)) {
				return true;
			}
			
			return false;
			
			
		}
		
		
			
}
