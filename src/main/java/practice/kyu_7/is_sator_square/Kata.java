package practice.kyu_7.is_sator_square;

public class Kata {

	public static Boolean isSatorSquare(char[][] tablet) {


		int wordCount = tablet.length;
		int upperRight = 0;
		int lowerLeft = 0;
		int upperLeft = 0;
		int lowerRight = 0;

		//Calculate upper right
		for (int i = 0; i < wordCount; i++) {
			for (int j = 0; j < wordCount - i; j++) {
				upperRight += tablet[i][j + i] - 64;
			}
		}
		//Calculate lower left
		for (int i = wordCount; i > 0; i--) {
			for (int j = 0; j < i ; j++) {
				lowerLeft += tablet[i - 1][j] - 64;
			}
		}
		//Calculate upper left
		for (int i = 0; i < wordCount; i++) {
			for (int j = 0; j < wordCount - i; j++) {
				upperLeft += tablet[i][j] - 64;
			}
		}
		//Calculate lower right
		for (int i = 0; i < wordCount; i++) {
			for (int j = wordCount; j >= wordCount - i ; j--) {
				lowerRight += tablet[i][j - 1] - 64;
			}
		}

		//check Top to bottom
		String[] names = getWords(tablet, wordCount);
		boolean topToBottom = checkTopToBottom(names, tablet, wordCount);
		return (upperRight == lowerLeft) && (upperLeft == lowerRight) && topToBottom;


	}

	public static boolean checkTopToBottom(String[] words, char[][] tablet, int wordCount) {
		boolean isValid = true;

		for (String word : words) {
			boolean isWordFound = false;
			for (int i = 0; i < wordCount; i++) {
				StringBuilder temp = new StringBuilder();
				for (int j = 0; j < wordCount; j++) {
					temp.append(tablet[j][i]);
				}
				if (!word.equals(String.valueOf(temp))) continue;
				isWordFound = true;
				break;
			}
			if (isWordFound) {
				isValid = true;
			} else {
				isValid = false;
				break;
			}
		}


		return isValid;
	}

	public static String[] getWords(char[][] tablet, int wordCount) {
		String[] names = new String[wordCount];
		for (int i = 0; i < wordCount; i++) {
			StringBuilder temp = new StringBuilder();
			for (int j = 0; j < wordCount; j++) {
				temp.append(tablet[i][j]);
			}
			names[i] = String.valueOf(temp);
		}
		return names;
	}
}
