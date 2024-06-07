package practice.kyu_7.is_sator_square;

import org.junit.jupiter.api.Test;
import practice.kyu_7.is_sator_square.Kata;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
	char[][][] sampleTablets = {
			new char[][]{{'T', 'E', 'N'},
					{'E', 'Y', 'E'},
					{'N', 'E', 'T'}},

			new char[][]{{'N', 'O', 'T'},
					{'O', 'V', 'O'},
					{'N', 'O', 'T'}},

			new char[][]{{'B', 'A', 'T', 'S'},
					{'A', 'B', 'U', 'T'},
					{'T', 'U', 'B', 'A'},
					{'S', 'T', 'A', 'B'}},

			new char[][]{{'P', 'A', 'R', 'T'},
					{'A', 'G', 'A', 'R'},
					{'R', 'A', 'G', 'A'},
					{'T', 'R', 'A', 'M'}},

			new char[][]{{'S', 'A', 'T', 'O', 'R'},
					{'A', 'R', 'E', 'P', 'O'},
					{'T', 'E', 'N', 'E', 'T'},
					{'O', 'P', 'E', 'R', 'A'},
					{'R', 'O', 'T', 'A', 'S'}},

			new char[][]{{'S', 'A', 'L', 'A', 'S'},
					{'A', 'R', 'E', 'N', 'A'},
					{'L', 'E', 'V', 'E', 'L'},
					{'A', 'R', 'E', 'N', 'A'},
					{'S', 'A', 'L', 'A', 'S'}}
	};

	void tester(char[][] tablet, boolean expected) {
		boolean submitted = Kata.isSatorSquare(tablet);
		StringBuilder message = new StringBuilder();
		if(submitted != expected) {
			message.append("Testing for tablet:\n\n");
			for(int row = 0; row < tablet.length; row++) {
				message.append("  ");
				for(int col = 0; col < tablet.length; col++) {
					message.append(tablet[row][col] + " ");
				}
				message.append("\n");
			}
			message.append("\n");
		}
		assertEquals(expected, submitted, message.toString());
	}

	@Test
	void sampleTests() {
		for(int test = 0; test < 6; test++) {
			tester(sampleTablets[test], test % 2 == 0 ? true : false);
		}
	}
}