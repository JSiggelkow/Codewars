package practice.kyu_6.higher_num_with_same_bits;

import org.junit.jupiter.api.Test;
import practice.kyu_6.higher_num_with_same_bits.Kata;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
	@Test
	public void basicTests() {
		assertEquals(256, Kata.nextHigher(128), "for nextHigher(128)");
		assertEquals(2, Kata.nextHigher(1), "for nextHigher(1)");
		assertEquals(1279, Kata.nextHigher(1022), "for nextHigher(1022)");
		assertEquals(191, Kata.nextHigher(127), "for nextHigher(127)");
		assertEquals(1253359, Kata.nextHigher(1253343), "for nextHigher(1253343)");
	}
}