package week4_WeekdayProblems;

import java.util.Stack;

public class week4day4program2_makeStringGreat {
//	 Homework - 18/05/2023
//	https://leetcode.com/problems/backspace-string-compare/


//
//	Example 1:
//
//		Input: s = "leEeetcode"
//		Output: "leetcode"
//		Explanation: In the first step, either you choose i = 1 or i = 2,
//		both will result "leEeetcode" to be reduced to "leetcode".
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(makeStringGreat());
	}

	
		public static String makeStringGreat() {
			String s = "leEeetcode" ;
			Stack<Character> stack=new Stack<Character>();
		       
	        for(int i=0;i<s.length();i++)
	        {
	            
	            if(stack.size()>0&&stack.peek()!=s.charAt(i)){
	               String t1=""+stack.peek();
	               String t2=""+s.charAt(i);
	                if(t1.toLowerCase().equals(t2.toLowerCase()))stack.pop();
	                else stack.push(s.charAt(i));
	            }
	            else
	               stack.push(s.charAt(i));  
	            
	        }
	        String str="";
	        while(stack.size()>0){
	            str=stack.pop()+str;
	        }
	        return str;
	        
		}
		
		
			
}
