package practice.kyu_6.EnoughIsEnough;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {

		Map<Integer, Integer> intCounts = new HashMap<>();
		List<Integer> elementsList = Arrays.stream(elements)
				.boxed()
				.filter(i -> {
					intCounts.putIfAbsent(i, 0);
					intCounts.put(i, intCounts.get(i) + 1);
					return intCounts.get(i) <= maxOccurrences;
				})
				.toList();

		return elementsList.stream().mapToInt(Integer::intValue).toArray();
	}
}
