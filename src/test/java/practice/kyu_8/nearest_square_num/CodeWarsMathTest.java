package practice.kyu_8.nearest_square_num;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeWarsMathTest {
	@Test
	public void basicTests() {
		assertEquals(1, CodeWarsMath.nearestSq(1));
		assertEquals(1, CodeWarsMath.nearestSq(2));
		assertEquals(9, CodeWarsMath.nearestSq(10));
		assertEquals(121, CodeWarsMath.nearestSq(111));
		assertEquals(10000, CodeWarsMath.nearestSq(9999));
	}
}