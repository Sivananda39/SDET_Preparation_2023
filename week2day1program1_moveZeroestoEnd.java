package week2_WeekdayProblems;

public class week2day1program1_moveZeroestoEnd {
//	Homework - 01/05/2023
//
//	https://leetcode.com/problems/move-zeroes/
////	Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
// 
//
//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		moveZeroestoEnd();
	}
	


	public static void moveZeroestoEnd( ) {
		 
		int nums[] = {0,1,0,3,12};
		int newArray[] = new int[nums.length];
		int temp=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]>0) {
				newArray[temp]= nums[i];
				temp++;
			}
		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.println("Now the zeores are moved to end as : " + newArray[i]);
		}

	}
}
