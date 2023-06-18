package mandatoryHomeWork.Week1.day1;

import org.junit.Test;

public class pyramidPattern {
//	DO NOT use any Data Structure or in-built methods for any of the following
//	1. Pyramid Program
//	    * 
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * *
	
	//Print * as per input
	// input 1 loop  as space then *
	//input 2nd as rows then *
	//* *
	//maintain spaces and new lines as per input
	

	@Test
	public void example1() {
		
		
		printPyarmid();
	}
	
	


	public static void printPyarmid( ) {
		int n =5;
		for (int i = 0; i < n; i++) {
			for (int j = n-i; j > 1; j--) {
					System.out.print(" " );
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
		}
			System.out.println(" " );
		}

		
		

	}

}
