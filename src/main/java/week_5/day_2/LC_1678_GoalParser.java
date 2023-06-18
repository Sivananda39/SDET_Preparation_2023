package week_5.day_2;

public class LC_1678_GoalParser {
	// Homework 23/05/2023:
//	https://leetcode.com/problems/goal-parser-interpretation/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(goalParser());
	}

	public static String  goalParser() {
		String s="G()(al)";
		String out="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='G') {
				out=out+'G';
			}
			else if(s.charAt(i)=='(') {
				i++;
				if(s.charAt(i)==')') {
					out=out+'o';
				}
				else {
					out=out+"al";
					i+=2;
					}
				}
				
				}
		return out;

	}

}
