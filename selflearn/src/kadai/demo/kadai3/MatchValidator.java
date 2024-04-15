package kadai.demo.kadai3;

public class MatchValidator {
	// perfectMatch,partialMatch, noMatchの３つで、スコアをつけて、その結果をString型で返します。

	static String evaluateMatches(String playerInput, String randomNumber) {

		int perfectMatch = 0;
		int partialMatch = 0;
		int noMatch = 0;

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

}
