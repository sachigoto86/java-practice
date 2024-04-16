package lastkadai;

public class MatchValidator {
	// perfectMatch,partialMatch, noMatchの３つで、スコアをつけて、その結果をString型で返します。
	private static int perfectMatch = 0;
	private static int partialMatch = 0;
	private static int noMatch = 0;

	public static String evaluateMatches(String playerInput, String randomNumber) {
		perfectMatch = 0;
		partialMatch = 0;
		noMatch = 0;
		for (int i = 0; i < randomNumber.length(); i++) {
			if (randomNumber.charAt(i) == playerInput.charAt(i)) {
				perfectMatch++;
			} else if (randomNumber.indexOf(playerInput.charAt(i)) != -1) {
				partialMatch++;
			} else {
				noMatch++;
			}
		}

		return String.valueOf(perfectMatch) + String.valueOf(partialMatch) + String.valueOf(noMatch);
	}

	public static boolean isPerfectMatch(int numberOfDigits) {
		if (numberOfDigits == perfectMatch) {
			return true;
		} else {
			return false;
		}
	}
}
