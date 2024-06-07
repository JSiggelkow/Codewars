package practice.prize_draw;

import java.util.*;

record Person(String name, int winningNum) {

}

public class Rank {

	public static String nthRank(String st, Integer[] we, int n) {

		if (st.isEmpty()) return "No participants";
		String[] names = st.split(",");

		if (names.length < n) return "Not enough participants";

		ArrayList<Person> persons = new ArrayList<>();
		for (int i = 0; i < names.length; i++) {
			persons.add(new Person(names[i], getWinningNum(names[i], we[i])));
		}

		return persons.stream()
				.sorted(Comparator.comparing(Person::winningNum).reversed()
						.thenComparing(Person::name))
				.skip(n - 1)
				.map(Person::name)
				.findFirst()
				.orElse(null);
	}

	private static int getWinningNum(String st, int weight) {
		int winningNum = st.length();
		for (int i = 0; i < st.length(); i++) {
			winningNum += st.toLowerCase().charAt(i) - 96;
		}
		return winningNum * weight;
	}
}
