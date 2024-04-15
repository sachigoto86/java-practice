package kadai.demo.kadai2;

import java.util.regex.Pattern;

public class InputValidator {
	//　ユーザが入力したインプットが正しいかをチェックします。
	//　基準は３桁すべてが整数で異なる数であること。
	static boolean validate(String playerInput) {

		String validateInput = "^(?!.*(.).*\\1)\\d{3}$";
		Pattern pattern = Pattern.compile(validateInput);
		boolean isValidInput = pattern.matcher(playerInput).matches();
		return isValidInput;

	}

}
