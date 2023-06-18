package mandatoryHomeWork.week5.day_3;

public class LT_1108_DefangingIPAddress {
//	Homework 24/05/2023:
//		https://leetcode.com/problems/defanging-an-ip-address/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defangIP();
	}

	public static void  defangIP() {
		String address= "1.1.1.1";
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<address.length();i++) {
			if(address.charAt(i)=='.') {
				sb.append("[.]");
			}
			else {
				sb.append(address.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
