import java.util.Arrays;

import org.testng.annotations.Test;

public class week1day2program2_AddDigitsLeetCode {
//	https://leetcode.com/problems/add-digits/	    

//	Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
//
//			 
//
//			Example 1:
//
//			Input: num = 38
//			Output: 2
//			Explanation: The process is
//			38 --> 3 + 8 --> 11
//			11 --> 1 + 1 --> 2 
//			Since 2 has only one digit, return it.
//			Example 2:
//
//			Input: num = 0
//			Output: 0
			 
	
	

	@Test
	public void example1() {
		
		int n = 38;
		addDigits(n);
	}
	
	


	public static void addDigits(int n ) {
		int total = 0;
		 while(n >0 || total >9) {
			 if(n==0) {
				 n=total;
				 total=0;
			 }
			 total = total + n%10;
			 n=n/10;
		 }
		 System.out.println(total);

		 
	}

	
}
