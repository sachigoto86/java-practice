package kadai.demo.kadai2;

import java.util.Scanner;

public class Kadai2 {

	public static void main(String[] args) {
		// randomNumberGenerator を呼び出し、３桁のランダム数を生成します。
		RandomNumberGenerator randomizedNumber = new RandomNumberGenerator();
		String randomNumber = randomizedNumber.generate();

		Scanner scanner = new Scanner(System.in);
		int counter = 1;

		while (counter <= 10) {
			System.out.print("[Round " + counter + "] Input Number: ");
			String playerInput = scanner.next();

			//InputValidator を呼び出し、生成されたランダム数と照合します。
			boolean isValid = InputValidator.validate(playerInput);
			if (isValid) {
				// もし、完璧にマッチしていれば、その時点でゲーム終了します。
				String result = MatchValidator.evaluateMatches(playerInput, randomNumber);
				if (result.charAt(0) == '3') {
					System.out.println("Congratulations!");
					break;
				} else {
					System.out.println(
							"〇(" + result.charAt(0) + ") ×(" + result.charAt(1) + ") △(" + result.charAt(2) + ")");
					counter++;
				}
			} else {
				System.out.println("[Error] Reason: Not the correct value.");
			}
		}

		if (counter > 10) {
			System.out.println("Failed. The correct answer was: " + randomNumber);
		}

		scanner.close();
	}
}
