package mandatoryHomeWork.week5.day_4;

public class LT_2011_valueOfVariable {
//	Homework 25/05/2023:
//	https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		valueofVariable();
	}

	public static void  valueofVariable() {
		String[] operations = {"--X","X++","X++"};
		int val=0;
		for(String i:operations) {
			if(i.contains("-")) {
				val+=-1;
			}
			else {
				val+=1;
			}
		}
		System.out.println(val);
	}
}
