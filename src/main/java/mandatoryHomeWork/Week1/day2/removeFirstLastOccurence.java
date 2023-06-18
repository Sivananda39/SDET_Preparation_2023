package mandatoryHomeWork.Week1.day2;

import java.util.Arrays;

import org.junit.Test;

public class removeFirstLastOccurence {
//	3. Remove the first and last occurrence of a given number in the input array
//	input = {1,2,3,4,5,1}, number = 1
//	output = {2,3,5}
			 
	
	

	@Test
	public void example1() {
		
		int a[] = { 1, 2, 3, 4, 5, 1 };
		int target = 1;
		int result[] = removeOccurence(a, target);
		System.out.println("Pos case :");
		System.out.println(Arrays.toString(result));
		removeOccurence(a, target );
	}
	
	


	public static int[] removeOccurence(int[] a, int target ) {
		int occNum = 0;
		for (int temp : a) {
			if (temp == target)
				occNum++;
		}
		int out[] = new int[a.length - occNum];
		int index=0;
		if(occNum == 0) return a;
		for(int temp1 : a) {
			if(temp1 != target) {
				out[index++] = temp1;
			}
		}
		return out;
		 
	}

}
