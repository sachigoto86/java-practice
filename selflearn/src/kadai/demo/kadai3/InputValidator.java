package kadai.demo.kadai3;

import java.util.regex.Pattern;

public class InputValidator {
	//　ユーザが入力したインプットが正しいかをチェックします。
	//　基準は３桁すべてが整数で異なる数であること。
	static boolean validate(String playerInput, int numberOfDigits) {

		String validateInput = String.format("^(?!.*(.).*\\1)\\d{%d}$", numberOfDigits);
		Pattern pattern = Pattern.compile(validateInput);
		boolean isValidInput = pattern.matcher(playerInput).matches();
		return isValidInput;

	}

}
