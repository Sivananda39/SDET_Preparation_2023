import java.util.Arrays;

import org.testng.annotations.Test;

public class week1day4program1_printSandglassStar {
//	27/04/2023:
//		DO NOT use any Data Structure or in-built methods for any of the following
//		1. Sandglass Star Pattern
//		Enter the number of rows: 5
//
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * *

	//sameas apart of pyramid - but here both as in 1 inverted shape
	
	

	@Test
	public void example1() {
		
		int rows = 5;
		printRightPascalTrainagle(rows);
	}
	
	


	public static void printRightPascalTrainagle(int rows ) {
		int currentRow=rows;
		// to print half sandbox or inverted pyramid
        while(currentRow > 0){
            int prefixSpace = rows-currentRow;
            while(prefixSpace-- > 0)
                System.out.print(" ");
            int stars=(currentRow*2)-currentRow;
            while (stars-- > 0)
                System.out.print(" *");
            currentRow--;
            System.out.println();
        }
		
		currentRow = 1;
		// to print  lower - triangle / pyramid
        while(currentRow <= rows){
            int prefixSpace = rows-currentRow;
            while(prefixSpace-- > 0)
                System.out.print(" ");

            int stars=(currentRow*2)-currentRow;
            while (stars-- > 0)
                System.out.print(" *");
            currentRow++;
            System.out.println();
        }

        
//		
		//LowerTriangle
//        	int n =5;
//		for (int i = 0; i < n; i++) {
//			for (int j = n-i; j > 1; j--) {
//					System.out.print(" " );
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print("* ");
//		}
//			System.out.println(" " );
//		}
    
      
        
		}
        
	

	
}
