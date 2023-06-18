package mandatoryHomeWork.Week1.day3;

import java.util.Arrays;

import org.junit.Test;

public class removeAllOccurence {
//	3. Remove all occurrence of a number which is present in the given index number
//	input = {1,2,3,4,5,1}, indexToRemove = 5
//	output = {2,3,4,5}
			 
	
	

	@Test
	public void example1() {
		
		int a[] = { 1, 2, 3, 4, 5, 1 };
		int target = 1;
		int result[] = removeindex(a, target);
		System.out.println(Arrays.toString(result));
		removeindex(a, target );
	}
	
	


	public static int[] removeindex(int[] a, int target ) {
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
