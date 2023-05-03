import java.util.Arrays;

import org.testng.annotations.Test;

public class week1day3program1_printRightPascalsTriangle {
//	1. Right Pascal’s Triangle
//	Enter the number of rows: 5
//
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 

	//sameas apart of pyramid - but here both as in 1 inverted shape
	
	

	@Test
	public void example1() {
		
		int rows = 5;
		printRightPascalTrainagle(rows);
	}
	
	


	public static void printRightPascalTrainagle(int rows ) {
		int currentRow = 1;
		// to print half diamond or upper pyramid
        while(currentRow <= rows){
            int prefixSpace = rows-1;
            while(prefixSpace-- > 0)
                System.out.print("");

            int stars=(currentRow*2)-1;
            while (stars-- > 0)
                System.out.print("*");
            currentRow++;
            System.out.println();
        }

        currentRow-=2;
        while(currentRow > 0){
            int prefixSpace = currentRow-rows;
            while(prefixSpace-- > 0)
                System.out.print(" ");
            int stars=(currentRow*2)-1;
            while (stars-- > 0)
                System.out.print("*");
            currentRow--;
            System.out.println();
        }
//		
		//UpperRightTriangle
//        for (int i = 1; i <= rows; i++) {
//        	System.out.print(" " );
//			for (int j = rows-i; j < rows; j++) {
//					System.out.print(" *" );
//			}
//			
//			System.out.println(" " );	
//        }
      
        
		}
        
	

	
}
