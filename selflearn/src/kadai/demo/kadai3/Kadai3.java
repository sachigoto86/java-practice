package kadai.demo.kadai3;

import java.util.Scanner;

public class Kadai3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int counter = 0;
		while (true) {
			System.out.print("[Setting] Set Round :");
			try {
				counter = Integer.parseInt(scanner.next());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid Input:Please enter a number");
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		int numberOfDigits = 0;
		while (true) {
			System.out.print("[Setting] Set Number Length :");
			try {
				numberOfDigits = Integer.parseInt(scanner.next());
				if (numberOfDigits > 10) {
					throw new Exception("please enter larget than 10");
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid Input:Please enter a number that is less than or equal to 10");
				continue;
			} catch (Exception e) {
				System.out.println(e);
				continue;
			}
		}

		// randomNumberGenerator を呼び出し、指定された桁のランダム数を生成します。
		RandomNumberGenerator randomizedNumber = new RandomNumberGenerator();
		String randomNumber = randomizedNumber.generate(numberOfDigits);

		int currentRound = 1;

		while (currentRound <= counter) {
			System.out.print("[Round " + currentRound + "] Input Number: ");
			String playerInput = scanner.next();

			//InputValidator を呼び出し、生成されたランダム数と照合します。
			boolean isValid = InputValidator.validate(playerInput, numberOfDigits);
			if (isValid) {
				// もし、完璧にマッチしていれば、その時点でゲーム終了します。
				String result = MatchValidator.evaluateMatches(playerInput, randomNumber);
				if (result.charAt(0) == '3') {
					System.out.println("Congratulations!");
					break;
				} else {
					System.out.println(
							"〇(" + result.charAt(0) + ") ×(" + result.charAt(1) + ") △(" + result.charAt(2) + ")");
					currentRound++;
				}
			} else {
				System.out.println("[Error] Reason: Not the correct value.");
			}
		}

		System.out.println("Failed. The correct answer was: " + randomNumber);

		scanner.close();
	}
}
