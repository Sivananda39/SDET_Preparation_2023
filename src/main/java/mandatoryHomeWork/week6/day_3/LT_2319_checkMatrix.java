package mandatoryHomeWork.week6.day_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class LT_2319_checkMatrix {
//	Homework - 31/05/2023


//https://leetcode.com/problems/check-if-matrix-is-x-matrix/ "

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkMatrix());
	}

	public static boolean checkMatrix() {
		int mat[][]= {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
		int size=mat.length;//since n matrix
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i==j || j==size-i-1) {
					if(mat[i][j]==0) return false;
				}
				else {
					if(mat[i][j]!=0) return false;
				}
			}
		}
		return true;
		
	}
	
}
