package practice.kyu_5.human_readable_time;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static practice.kyu_5.human_readable_time.HumanReadableTime.makeReadable;

class HumanReadableTimeTest {
	@Test
	public void Tests() {
		assertEquals( "00:00:00",makeReadable(0));
		assertEquals( "00:00:05",makeReadable(5));
		assertEquals( "00:01:00",makeReadable(60));
		assertEquals( "23:59:59",makeReadable(86399));
		assertEquals( "99:59:59",makeReadable(359999));
	}
}