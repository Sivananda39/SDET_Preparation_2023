package week_6.day_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class LT_1572_matrixDiagonalSum {
//	Homework - 30/05/2023


//https://leetcode.com/problems/matrix-diagonal-sum/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		matrixSumDiagonal();
	}

	public static void matrixSumDiagonal() {
		int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(i==j || j==mat[i].length-1-i) {
					sum=sum+mat[i][j];
				}
			}
		}
		System.out.println(sum);
		
	}

}
