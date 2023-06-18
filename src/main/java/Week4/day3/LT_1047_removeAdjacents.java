package Week4.day3;

import java.util.Stack;

public class LT_1047_removeAdjacents {
//	 Homework - 17/05/2023
//	https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

//	Example 1:
//
//		Input: s = "abbaca"
//		Output: "ca"
//		Explanation: 
//		For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, 
//		and this is the only possible move.  
//		The result of this move is that the string is "aaca", of which only "aa" is possible, 
//		so the final string is "ca".

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(removeAdjacentDups());
	}

	public static String removeAdjacentDups() {
			String s = "abbaca" ;
			Stack<Character> stack= new Stack<Character>();
	        for(int i=0;i<s.length();i++){
	            char c= s.charAt(i);
	            if(!stack.isEmpty() && stack.peek()==c) stack.pop();
	            else stack.push(c);
	        }


	        StringBuilder t= new StringBuilder();
	        while(!stack.isEmpty()){
	            t.append(stack.pop());

	        }

	        return t.reverse().toString();
	        
		}
		
		
		
			
}
