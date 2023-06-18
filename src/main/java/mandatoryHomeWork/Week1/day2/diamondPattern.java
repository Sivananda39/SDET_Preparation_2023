package mandatoryHomeWork.Week1.day2;

import org.junit.Test;

public class diamondPattern {
//	"1. Diamond Shape Pattern Program
//	Enter the number of rows: 5
//
//	    *
//	   ***
//	  *****
//	 *******
//	*********
//	 *******
//	  *****
//	   ***
//	    *

	//sameas apart of pyramid - but here both as in 1 diamondshape
	
	

	@Test
	public void example1() {
		
		int rows = 5;
		printDiamond(rows);
	}
	
	


	public static void printDiamond(int rows ) {
		int currentRow = 1;
		// to print half diamond or upper pyramid
        while(currentRow <= rows){
            int prefixSpace = rows-currentRow;
            while(prefixSpace-- > 0)
                System.out.print(" ");

            int stars=(currentRow*2)-1;
            while (stars-- > 0)
                System.out.print("*");
            currentRow++;
            System.out.println();
        }
//        currentRow =-1;
//        while(currentRow <= rows){
//            int stars=(currentRow*2)-1;
//            while (stars++ <= rows)
//                System.out.print("*");
//            System.out.println();
//            currentRow++;
//            int prefixSpace = rows-currentRow;
//            while(prefixSpace++ <= rows)
//                System.out.print(" "); 
//        }
        currentRow-=2;
        while(currentRow > 0){
            int prefixSpace = rows-currentRow;
            while(prefixSpace-- > 0)
                System.out.print(" ");
            int stars=(currentRow*2)-1;
            while (stars-- > 0)
                System.out.print("*");
            currentRow--;
            System.out.println();
        }
		

	}

}
