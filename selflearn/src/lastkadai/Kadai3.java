package lastkadai;

import java.util.Scanner;

public class Kadai3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int rounds = 0;

		while (true) {
			System.out.print("[Setting] Set Round :");
			String roundInput = scanner.next();
			// 入力された値がnumberであるかどうかのチェック
			try {
				InputValidator.validateRounds(roundInput);
				rounds = Integer.parseInt(roundInput);
				break;
			} catch (InputValidationException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}

		int numberOfDigits = 0;
		System.out.print("[Setting] Set Number Length :");

		while (true) {
			System.out.print("[Setting] Set Number Length :");
			String digitsInput = scanner.next();
			// 入力された値がnumberであるか、それが、１０以下であるかのチェック
			try {
				InputValidator.validateDigits(digitsInput);
				numberOfDigits = Integer.parseInt(digitsInput);
				break;
			} catch (InputValidationException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}

		// randomNumberGenerator を呼び出し、指定された桁のランダム数を生成します。
		RandomNumberGenerator randomizedNumber = new RandomNumberGenerator();
		String randomNumber = randomizedNumber.generate(numberOfDigits);
		int currentRound = 1;

		while (currentRound <= rounds) {
			System.out.print("[Round " + currentRound + "] Input Number: ");
			String playerInput = scanner.next();

			// 入力された値のバリデーションチェック
			try {
				InputValidator.validate(playerInput, numberOfDigits);
				//InputValidator を呼び出し、生成されたランダム数と照合します。
				// もし、完璧にマッチしていれば、その時点でゲーム終了します。
				String result = MatchValidator.evaluateMatches(playerInput, randomNumber);

				if (MatchValidator.isPerfectMatch(numberOfDigits)) {
					System.out.println("Congratulations!");
					return;
				} else {
					System.out.println(
							"〇(" + result.charAt(0) + ") △(" + result.charAt(1) + ")" + " ×(" + result.charAt(2) + ")");
					currentRound++;
				}

			} catch (InputValidationException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}

		System.out.println("Failed. The correct answer was: " + randomNumber);

		scanner.close();
	}
}
