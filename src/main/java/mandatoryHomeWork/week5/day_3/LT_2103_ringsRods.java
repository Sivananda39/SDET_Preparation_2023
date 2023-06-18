package mandatoryHomeWork.week5.day_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LT_2103_ringsRods {
//	Homework 24/05/2023:
//		https://leetcode.com/problems/rings-and-rods/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ringRods();
	}

	public static void ringRods() {
		String rings = "B0B6G0R6R0R6G9";
		HashMap<Integer, Set<Character>> map = new HashMap<Integer, Set<Character>>();
		// traverse only the numbers
		for (int i = 0; i < rings.length(); i += 2) {

			int rodNo = Character.getNumericValue(rings.charAt(i + 1));

			if (!map.containsKey(rodNo)) {
				Set<Character> val = new HashSet<Character>();
				val.add(rings.charAt(i));
				map.put(rodNo, val);
			}

			else {
				Set<Character> set = map.get(rodNo);
				set.add(rings.charAt(i));
				map.put(rodNo, set);
			}
		}
		System.out.println(map);
		int count = 0;
		for (Map.Entry<Integer, Set<Character>> i : map.entrySet()) {
			Set<Character> value = i.getValue();
			if (value.size() == 3)
				count++;
		}
		System.out.println(count);
	}
}
