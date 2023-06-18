package mandatoryHomeWork.week6.day_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class LT_1582_binaryMatrix {
//	Homework - 31/05/2023

//https://leetcode.com/problems/special-positions-in-a-binary-matrix/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	binaryMatrix();
	}

	public static void binaryMatrix() {
		int[][] mat = {{1,0,0},{0,0,1},{1,0,0}};
		int i=0;
		int j=0;
		int onesCount=0;
		int count=0;
		int size=mat[0].length;//3
		while(j<size) {
			while(i<mat.length) {//3	
			
			int val=mat[i][j];//00,01,02
			//System.out.println(val);
			if(val==1) {
				onesCount++;
			}
			i++;
			
			}
			if(onesCount==1) {
				count++;
			}
			onesCount=0;
			i=0;
			j++;
		}
		System.out.println(count);
	}

}
