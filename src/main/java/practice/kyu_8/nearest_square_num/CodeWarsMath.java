package practice.kyu_8.nearest_square_num;

public class CodeWarsMath {
	public static int nearestSq(final int n){
		return (int) (Math.pow(Math.round(Math.sqrt(n)),2));
	}
}
