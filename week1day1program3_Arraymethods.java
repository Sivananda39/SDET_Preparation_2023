import java.util.Arrays;

import org.testng.annotations.Test;

public class week1day1program3_Arraymethods {

//	3. Implement below methods using array
//	a. add to the specific index
//	b. print the array value as string
//	c. contains
//	d. remove a value
//	e. trim to the given length
	
	
	@Test
public void example1() {
		
		
		arraymethods1InsertSpecifc();	
		arraymethod2ArrayValueAsString();
		arraymethod3ArrayValueContains();
		arraymethod4ArrayValueRemove();
		arraymethod5ArrayTrim();
	}
	
	private int[] arraymethods1InsertSpecifc() {
		int[] a= {1,2,3,4,5};
		int insertNUm = 6;
		int index=3;
		int n= a.length;
		int newArr[] = new int[n+1];
		System.out.println("Given intial array as: " + Arrays.toString(a));
	//adding numbr 6 to array
		for (int i = 0; i < n; i++) {
				newArr[i]=a[i];	
		}
		newArr[n]=insertNUm;
		System.out.println("Given intial array as: " + Arrays.toString(newArr));
		return newArr;
			
		
	}
	
	private static void arraymethod2ArrayValueAsString() {
		String S = "D Siva Nanda";
		String[] s2 = S.split(" ");
		

		for (int i = 0; i <= s2.length-1; i++) {
			//printing array value as string
			if (i==1) {
				System.out.println(s2[i]);
			}	
		}
	}
	private static void arraymethod3ArrayValueContains() {
		int[] a= {1,2,3,4,5};
		int contains = 4;
		boolean containsValue = false;
		for (int i : a) {
		if (i == contains) {
			containsValue = true;
			break;
		}
		}
		System.out.println(containsValue);
		}
	
	private void arraymethod4ArrayValueRemove() {

		int[] nums= {1,2,3,4,5};
		int remove = 4;
		 for (int i = 0; i < nums.length; i++) {
			 if (nums[i] != remove) {
				 System.out.println(nums[i]);
			 }
			 
			
		}

	}
	private void arraymethod5ArrayTrim() {

		int[] nums= {1,2,3,4,5};
		int trim = 2;
		 for (int i = 0; i < nums.length-trim; i++) {
			 
				 System.out.println(nums[i]);
			 
			 
			
		}

	}
	
}

