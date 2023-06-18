package Week4.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

import org.junit.Test;

import Week4.day4.LT_206_reverselnkedlists.Node;

public class LC_682_baseballGame {
//	 Homework - 15/05/2023
//	https://leetcode.com/problems/baseball-game/

//	Input: ops = ["5","2","C","D","+"]
//	Output: 30
//	Explanation:
//	"5" - Add 5 to the record, record is now [5].
//	"2" - Add 2 to the record, record is now [5, 2].
//	"C" - Invalidate and remove the previous score, record is now [5].
//	"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
//	"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
//	The total sum is 5 + 10 + 15 = 30.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(baseballGame());
	}

	public static int baseballGame(){
//		String[] input = {"5","2","C","D","+"};
//		String[] input = {"5","-2","4","C","D","9","+","+"};
		String[] input = {"1","C"};
		int count =0;
		List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<input.length;i++){
            
            if(input[i].equals("+")){
                int sum = list.get(list.size()-1)+list.get(list.size()-2);
                list.add(sum);
            }
            else if(input[i].equals("D")){
                int prod = 2*(list.get(list.size()-1));
                list.add(prod);
            }
            else if(input[i].equals("C")){
                list.remove(list.size()-1);
            }
            else{
                int t = Integer.parseInt(input[i]);
                list.add(t);
            }
        }
        for(int i=0;i<list.size();i++){
        	count = count  + list.get(i);
        }
        return count;
		
	}

}
