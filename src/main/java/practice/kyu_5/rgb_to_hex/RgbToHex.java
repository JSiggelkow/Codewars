package practice.kyu_5.rgb_to_hex;

public class RgbToHex {
	public static String rgb(int r, int g, int b) {
		return String.format("%02X%02X%02X", checkRange(r), checkRange(g), checkRange(b));
	}

	public static int checkRange(int n) {
		return n < 0 ? 0 : Math.min(n, 255);
	}
}
