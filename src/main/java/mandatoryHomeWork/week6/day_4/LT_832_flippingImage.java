package mandatoryHomeWork.week6.day_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class LT_832_flippingImage {
//	Homework - 01/06/2023


//https://leetcode.com/problems/flipping-an-image/ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(flipimage());
	}

	public static int[][] flipimage() {
		int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
		int size=image.length; //n*n matrix
		for(int i=0;i<size;i++) {
			
			int[] img=image[i];
				int left=0;
				int right=size-1;
				int temp;
				while(left<right) {//110-->011-->100
					temp=img[left];//1
					img[left++]=invert(img[right]);//1
					img[right--]=invert(temp);//0
				}
				if(left==right) {
					img[left] =	invert(img[left]);
				}
				
		
		}
		return image;
		
	}
	public static int invert(int i) {
		if(i==0) return 1;
		return 0;
	}
	
}
