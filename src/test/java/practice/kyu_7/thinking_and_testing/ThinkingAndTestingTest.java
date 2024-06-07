package practice.kyu_7.thinking_and_testing;

import org.junit.jupiter.api.Test;
import practice.kyu_7.thinking_and_testing.ThinkingAndTesting;

import static org.junit.jupiter.api.Assertions.*;

class ThinkingAndTestingTest {
	@Test
	public void exampleTests1() {
		// n?
		assertEquals(0, ThinkingAndTesting.testTrueFalse(0));
		assertEquals(1, ThinkingAndTesting.testTrueFalse(1));
	}

	@Test
	public void exampleTests2() {
		// n - 1?
		assertEquals(1, ThinkingAndTesting.testTrueFalse(2));
		assertEquals(2, ThinkingAndTesting.testTrueFalse(3));
	}

	@Test
	public void exampleTests3() {
		// round(n / 3f)?
		assertEquals(1, ThinkingAndTesting.testTrueFalse(4));
		assertEquals(2, ThinkingAndTesting.testTrueFalse(5));
		assertEquals(2, ThinkingAndTesting.testTrueFalse(6));
	}

	@Test
	public void exampleTests4() {
		// none of the above?
		assertEquals(3, ThinkingAndTesting.testTrueFalse(7));
		assertEquals(1, ThinkingAndTesting.testTrueFalse(8));
		assertEquals(2, ThinkingAndTesting.testTrueFalse(9));
		assertEquals(2, ThinkingAndTesting.testTrueFalse(10));
		assertEquals(3, ThinkingAndTesting.testTrueFalse(100));
		assertEquals(6, ThinkingAndTesting.testTrueFalse(1000));
		assertEquals(5, ThinkingAndTesting.testTrueFalse(10000));
	}
}