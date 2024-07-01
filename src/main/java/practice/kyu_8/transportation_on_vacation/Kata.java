package practice.kyu_8.transportation_on_vacation;

public class Kata {
	public static int rentalCarCost(int d) {
		//test commit
		return d >= 7 ? d * 40 - 50 : d >= 3 ? d * 40 - 20 : d * 40;
	}
}
