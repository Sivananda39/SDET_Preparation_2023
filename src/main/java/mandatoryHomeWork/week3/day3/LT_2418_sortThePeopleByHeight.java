package mandatoryHomeWork.week3.day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class LT_2418_sortThePeopleByHeight {
//	Homework - 10/05/2023:
//		https://leetcode.com/problems/sort-the-people/
	
//	You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
//
//	For each index i, names[i] and heights[i] denote the name and height of the ith person.
//
//	Return names sorted in descending order by the people's heights.
//
//	 
//
//	Example 1:
//
//	Input: names = ["Mary","John","Emma"], heights = [180,165,170]
//	Output: ["Mary","Emma","John"]
//	Explanation: Mary is the tallest, followed by Emma and John.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sortPeopleByHeight();
	}

	public static void sortPeopleByHeight() {
		
		String[] names ={"Mary","John","Emma"};
		int[] heights = {180,165,170};
		int count = 0;
		HashMap<Integer, String> mapHeightwise = new HashMap<Integer, String>();
		for (int i = 0; i < heights.length; i++) {
		
			mapHeightwise.put(heights[i], names[i]);
		}
		// get the heightwiseassinged
		System.out.println(mapHeightwise);
		//heightsSorted
		Arrays.sort(heights);
		//heighwisesortedarray
		System.out.println(Arrays.toString(heights));
		for (int j = heights.length-1; j >= 0 ; j--) {
			
			names[count] = mapHeightwise.get(heights[j]);
			count++;
			
		}
		System.out.println(Arrays.toString(names));
	}

}
