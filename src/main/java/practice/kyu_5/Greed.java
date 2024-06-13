package practice.kyu_5;

public class Greed {
	public static int greedy(int[] dice) {
		int[] roles = {0, 0, 0, 0, 0, 0};
		for (int i : dice) roles[i - 1]++;

		return (roles[0] / 3 * 1000) + (roles[1] / 3 * 200) + (roles[2] / 3 * 300) + (roles[3] / 3 * 400) + (roles[4] / 3 * 500) + (roles[5] / 3 * 600) + (roles[0] % 3 * 100) + (roles[4] % 3 * 50);
	}
}
