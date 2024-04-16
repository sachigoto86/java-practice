package lastkadai;

import java.util.regex.Pattern;

public class InputValidator {
	//　ユーザが入力したインプットが正しいかをチェックします。
	//　基準は３桁すべてが整数で異なる数であること。
	static void validate(String playerInput, int numberOfDigits) throws InputValidationException {
		// インプットがすべてnumberであるかどうか
		if (!playerInput.matches("\\d+")) {
			throw new InputValidationException("Input must contain only digits.");
		}
		// インプットした桁数が指定した桁数を一致するかどうか。
		if (playerInput.length() != numberOfDigits) {
			throw new InputValidationException("Please enter " + numberOfDigits + "digits");
		}

		//　すべての番号がユニークであるかどうか。
		String validateInput = String.format("^(?!.*(.).*\\1)\\d{%d}$", numberOfDigits);
		Pattern pattern = Pattern.compile(validateInput);
		if (!pattern.matcher(playerInput).matches()) {
			throw new InputValidationException("Please enter unique digits");
		}
	}

	static void validateRounds(String input) throws InputValidationException {
		// インプットがすべてnumberであるかどうか
		if (!input.matches("\\d+")) {
			throw new InputValidationException("Input must contain only number.");
		}

	}

	static void validateDigits(String input) throws InputValidationException {
		// インプットがすべてnumberであるかどうか
		if (!input.matches("\\d+")) {
			throw new InputValidationException("Input must contain only digits.");
		}

		// インプットの値が１０以下であるかどうか
		if (Integer.parseInt(input) >= 10) {
			throw new InputValidationException("Input must be less than 10");
		}

	}

}

class InputValidationException extends Exception {
	public InputValidationException(String message) {
		super(message);
	}

}
