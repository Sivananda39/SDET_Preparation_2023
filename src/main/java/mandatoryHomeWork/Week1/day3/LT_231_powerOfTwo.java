package mandatoryHomeWork.Week1.day3;

import org.junit.Test;

public class LT_231_powerOfTwo {
//	2. https://leetcode.com/problems/power-of-two/ - can try with loop
	
	
	

	@Test
	public void example1() {
		
		
		printisPowerof2();
	}
	
	


	private void printisPowerof2( ) {
		int n =5;
		boolean result = true;
		while (n>2) {
			n=n/2;
			
		}
		if(n==2) {
			
			System.out.println(result);
		}
		else {
			System.out.println("False");
		}
		
		

	}


}
