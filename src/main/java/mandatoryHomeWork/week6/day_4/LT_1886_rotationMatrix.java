package mandatoryHomeWork.week6.day_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class LT_1886_rotationMatrix {
//	Homework - 01/06/2023

//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rotationMatrix());
	}

	public static boolean rotationMatrix() {
		int mat[][]= {{0,1},{1,0}};
		int target[][]= {{1,0},{0,1}};
		int size=mat.length;
		if(size==1) {
			if(Arrays.deepEquals(mat,target)){
				return true;
			}
			return false;
		}
		int[][] rot =new int[size][size];//n*n matrix
		int[][] temp=mat;
		while(!Arrays.deepEquals(rot, mat)) {
			rot = new int[size][size];
		for(int i=0;i<size;i++) {
			
			for(int j=0;j<size;j++) {
				
				rot[j][size-1-i]=temp[i][j];
				
				
			}
		}
		System.out.println(Arrays.toString(rot));
		
		if(Arrays.deepEquals(rot,target)) return true;
		else {
			temp=rot;
			
		} 
		}
		return false;
	}

}
