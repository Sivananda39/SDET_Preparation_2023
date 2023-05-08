package week1_WeekdayProblems;

public class week1day5program3_maximumReplace69 {
//	28/04/2023:
//	3. https://leetcode.com/problems/maximum-69-number/
	
//	You are given a positive integer num consisting only of digits 6 and 9.
//
//	Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
//
//	 
//
//	Example 1:
//
//	Input: num = 9669
//	Output: 9969
//	Explanation: 
//	Changing the first digit results in 6669.
//	Changing the second digit results in 9969.
//	Changing the third digit results in 9699.
//	Changing the fourth digit results in 9666.
//	The maximum number is 9969.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 9669;
		printMaximumReplaceOf69(number);
		
	}
	


	public static void printMaximumReplaceOf69(int number ) {
		 
		int replacedNum=0;
		char[] numArr = new char[String.valueOf(number).length()];
		for (int i = 0; i < String.valueOf(number).length(); i++) {
		 numArr = String.valueOf(number).toCharArray();
			if (numArr[i] == '6') {
				numArr[i] = '9';
				break;
			}
			}
		replacedNum = Integer.parseInt(String.valueOf(numArr));
		
			System.out.println("the maximum number you can get by changing at most one digit : "+replacedNum);
		
		
		
		

	}
}
