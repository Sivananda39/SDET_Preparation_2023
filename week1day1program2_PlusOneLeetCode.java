import java.util.Arrays;

import org.testng.annotations.Test;

public class week1day1program2_PlusOneLeetCode {
//24 /04 - Day -01 hoework
	//2nd - https://leetcode.com/problems/plus-one/
//	//Input: digits = [1,2,3]
//	Output: [1,2,4]
//			Explanation: The array represents the integer 123.
//			Incrementing by one gives 123 + 1 = 124.
//			Thus, the result should be [1,2,4]
//	You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//	Increment the large integer by one and return the resulting array of digits.

	@Test
	public void example1() {
		int a=52;
		
		convertIntArray();
	}
	
	


	private void convertIntArray( ) {
		int a[]= {1,9};
	
		
//	works for 123,4561 not for 99 or 999	
//			if(a[a.length-1]< 9 ) {
//				
//				a[a.length-1]=a[a.length-1]+1;
//				System.out.println( "updated last index is " + a[a.length-1]);
//				
//		
//				
//			}
//			
//			int newArray1[] = new int[a.length];
//		for(int j=0;j<a.length;j++) {
//			newArray1[j]=a[j];
//			System.out.println(newArray1[j]);
//			
//			
//		}
//		
		//works for 9,29,99and 999 also
		for(int j=0;j<a.length;j++) {
		if(a[j]==9 ) {
			
			a=new int[a.length+1];
			a[0]=1;
			
			
		}
		System.out.println(a[j]);	
		}
	

		

	}

	
}
