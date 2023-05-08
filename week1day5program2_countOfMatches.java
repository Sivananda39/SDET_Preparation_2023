package week1_WeekdayProblems;

public class week1day5program2_countOfMatches {
//	28/04/2023:
//	2. https://leetcode.com/problems/count-of-matches-in-tournament/
	
//	Return the number of matches played in the tournament until a winner is decided.
//
//	 
//
//	Example 1:
//
//	Input: n = 7
//	Output: 6
//	Explanation: Details of the tournament: 
//	- 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
//	- 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
//	- 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
//	Total number of matches = 3 + 2 + 1 = 6.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 7;
		printCountofMatches(count);
		
	}
	


	public static int printCountofMatches(int count ) {
		 
		int matches = 0;
		if (count == 1) {
			return 0;
		} else {
			while (count > 1) {
				if (count % 2 == 0) {
					matches = matches + count / 2;
					count = count / 2;
				} else {
					matches = matches + ((count - 1) / 2);
					count = (count - 1) / 2 + 1;
				}
				
			}
			System.out.println("No. Of matches : " +matches);
			return matches;
		}
		

	}
}
