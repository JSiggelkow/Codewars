package practice.kyu_5.human_readable_time;

import java.time.Duration;

public class HumanReadableTime {
	public static String makeReadable(int seconds) {
		Duration d = Duration.ofSeconds(seconds);

		return String.format("%02d:%02d:%02d",d.toHours(), d.toMinutesPart(), d.toSecondsPart());
	}
}
