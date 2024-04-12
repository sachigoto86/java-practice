package kadai;

import java.util.Arrays;
import java.util.Scanner;

public class kadai2 {

	public static void main(String[] args) {

		int numOfGames;
		Integer[] validEntries = { 1, 2, 3 };
		Counter scoreCounter = new Counter();

		// ゲーム回数の設定
		Scanner scanner = new Scanner(System.in);
		System.out.print("回数入力してください。: ");
		numOfGames = Integer.parseInt(scanner.next());

		// 一回戦ごとに勝ち負けの判定をする
		int roundCounter = 1;
		while (roundCounter <= numOfGames) {
			int compChoice = (int) (Math.random() * 3) + 1;
			System.out.println("[" + roundCounter + "] 回戦　入力してください。(1.グー 2.パー　3.チョキ)");
			int playerChoice = Integer.parseInt(scanner.next());

			if (Arrays.asList(validEntries).contains(playerChoice)) {
				GameStatusChecker.evaluateGameRound(playerChoice, compChoice, roundCounter, scoreCounter); // Assuming this is a static method
				roundCounter++;
			} else {
				System.out.println("正しい入力ではありません。(入力値: " + playerChoice + " ) 正しい値を入力してください。");
			}
		}

		// 結果の表示
		System.out.println("戦績: " + scoreCounter.getWins() + "勝 " + scoreCounter.getLoses() + "敗 "
				+ scoreCounter.getDraws() + "引き分け ");
	}
}
