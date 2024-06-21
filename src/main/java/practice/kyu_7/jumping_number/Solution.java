package practice.kyu_7.jumping_number;

import java.util.concurrent.atomic.AtomicReference;

public class Solution {

	public static void main(String[] args) {
		jumpingNumber(8987);
	}


	public static String jumpingNumber(int number) {
		String numStr = String.valueOf(number);

		for (int i = 0; i < numStr.length() - 1; i++) {
			if (Math.abs(numStr.charAt(i) - numStr.charAt(i + 1)) != 1) {
				return "Not!!";
			}
		}

		return "Jumping!!";
	}
}
