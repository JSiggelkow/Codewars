package practice.higher_num_with_same_bits;

public class Kata {

	public static int nextHigher(int n) {
		int c = n & -n;
		int r = n+c;
		return (((r^n) >>> 2)/c)|r;
	}

}
