package week_5.day_1;

public class LC_925_LongPressedName {
	// Homework 22/05/2023:
//	https://leetcode.com/problems/long-pressed-name/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(longPressedname());
	}

	public static Boolean  longPressedname() {
		String name = "alex";
		String typed = "aaleex";
		int max = Integer.max(name.length(), typed.length());
		Boolean longpressed = false;
		if (name.length() > 0) {
			int left = 0, right = 0;
			while (right < max) {
				if (name.charAt(left) == typed.charAt(right)) {
					longpressed = true;
					left++;
					right++;
					continue;
				}
				if (left > 0 && name.charAt(left - 1) == typed.charAt(right))
					right++;
				else
					return false;
				if (name.length() != left && typed.length() == right) {
					return false;
				}

			}
		} else {
			System.out.print("Name is empty so longpressed is ");
		}
		return longpressed;

	}

}
