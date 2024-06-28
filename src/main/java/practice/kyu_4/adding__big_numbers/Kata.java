package practice.kyu_4.adding__big_numbers;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {
	public static String add(String a, String b) {
		ArrayList<String> biggerNumList = (a.length() >= b.length()) ? new ArrayList<>(Arrays.asList(a.split(""))) : new ArrayList<>(Arrays.asList(b.split("")));
		ArrayList<String> smallerNumList = (b.length() <= a.length()) ? new ArrayList<>(Arrays.asList(b.split(""))) : new ArrayList<>(Arrays.asList(a.split("")));
			int biggerNumIndex = biggerNumList.size() - 1;
		int smallerNumIndex = smallerNumList.size() - 1;
		int carry = 0;

		for (; biggerNumIndex >= 0; biggerNumIndex--) {

			if (smallerNumIndex >= 0) {
				int numA = Integer.parseInt(biggerNumList.get(biggerNumIndex));
				int numB = Integer.parseInt(smallerNumList.get(smallerNumIndex));

				if (numA + numB + carry > 9) {
					biggerNumList.set(biggerNumIndex, String.valueOf(numA + numB + carry - 10));
					carry = 1;
				} else {
					biggerNumList.set(biggerNumIndex, String.valueOf(numA + numB + carry));
					carry = 0;
				}
			}

			if (smallerNumIndex < 0 && carry == 1) {
				int numA = Integer.parseInt(biggerNumList.get(biggerNumIndex));

				if (numA + carry > 9) {
					biggerNumList.set(biggerNumIndex, String.valueOf(numA + carry - 10));
				} else {
					biggerNumList.set(biggerNumIndex,String.valueOf(numA + carry));
					carry = 0;
				}
			}

			smallerNumIndex--;
		}

		if (carry == 1) biggerNumList.add(0,"1");

		for (int i = 0; i < biggerNumList.size(); i++) {
			if (biggerNumList.get(i).equals("0")) {
				biggerNumList.remove(i);
				i--;
				continue;
			}
			break;
		}

		StringBuilder result = new StringBuilder();

		for (String s : biggerNumList) {
			result.append(s);
		}
		return result.toString();
	}
}