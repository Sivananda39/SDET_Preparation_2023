package mandatoryHomeWork.week5.day_1;

import java.util.ArrayList;
import java.util.List;

public class LC_1700_UnableToEatLunch {
	// Homework 22/05/2023:
//		https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			unabletoTakeLunch();
		}

		public static int  unabletoTakeLunch() {
			
			int[] student= {1,1,0,0};
	    	   int[] sandwich= {0,1,0,1};
	    	   int left=0;
	   		int right=0;
	   		int count=0;
	   		int temp;
	   		
	   		List<Integer> stList = new ArrayList<Integer>();
	   		for (int i : student) {
	   			stList.add(i);
	   		}
	   		//System.out.println(stList);
	   		List<Integer> saList = new ArrayList<Integer>();
	   		for (int j : sandwich) {
	   			saList.add(j);
	   		}
	   		//System.out.println(stList.get(0));
	   		//System.out.println(saList.get(0));
	   		while(left<stList.size()) {
	   			
	   			if(count==stList.size()) {
	   				return stList.size();
	   			}
	   			
	   			else if(stList.get(left)==saList.get(right)) {
	   				stList.remove(left);
	   				saList.remove(right);
	   				count=0;
	   			}
	   			else {
	   				temp=stList.get(left);
	   				stList.remove(left);
	   				stList.add(temp);
	   				count++;
	   			}
	   			
	   		}
	   		return 0;
	   		
		}
}
