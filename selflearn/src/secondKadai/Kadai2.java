package secondKadai;

import java.util.Scanner;

public class Kadai2 {

	public static void main(String[] args) {

		//ユニークな３桁の番号がランダムに作られる
		RandomNumberGenerator randomizedNumber = new RandomNumberGenerator();
		String randomNumber = randomizedNumber.generate();

		int counter = 1;

		while (counter <= 10) {

			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter unique three digits number: ");
			String playerInput = scanner.next();
			//call inputValidator. If it is valid, it will return true, if it's not it will return fasle. 
			boolean isValid = InputValidator.validate(playerInput);
			if (isValid) {
				String result = MatchValidator.results(playerInput, randomNumber);
				if (result.contains("3")) {
					System.out.println("Congratulations");
					break;
				} else {
					counter++;
				}

			} else {
				continue;
			}

		}

	}

}
