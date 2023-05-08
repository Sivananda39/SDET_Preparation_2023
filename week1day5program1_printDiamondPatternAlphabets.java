package week1_WeekdayProblems;

public class week1day5program1_printDiamondPatternAlphabets {
//	28/04/2023:
//	DO NOT use any Data Structure or in-built methods for any of the following
//	1. Diamond Pattern in Java
//	Enter a Character between A to Z : F
//
//	     A
//	    B B
//	   C   C
//	  D     D
//	 E       E
//	F         F
//	 E       E
//	  D     D
//	   C   C
//	    B B
//	     A

//sameas apart of pyramid - but here both as in 1 diamondshape
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		printDiamondforAlphabets(rows);
		//Need to update this code for alphabets as output
	}
	


	public static void printDiamondforAlphabets(int rows ) {
		 
//		for(char alphabet = 'A'; alphabet <= 'Z'; ++alphabet) {
//			System.out.println("Alphabets are " + " "+ alphabet);
//		}
		int currentRow = 1;
		// to print half diamond or upper pyramid
        while(currentRow <= rows){
            int prefixSpace = rows-currentRow;
            while(prefixSpace-- > 0)
                System.out.print(" ");

            int stars=(currentRow*2)-1;
            while (stars-- > 0)
                System.out.print("*");
            
            int suffixspace = prefixSpace+currentRow;
            while(suffixspace-- > 0)
                System.out.print(" ");
            currentRow++;
            
            System.out.println();
        }

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
