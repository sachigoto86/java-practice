package kadai;

public class GameStatusChecker {

	static void evaluateGameRound(int player, int comp, int round, Counter scoreCounter) {

		String[] rockPapaerScissors = { "グー", "パー", "チョキ" };

		if (player == comp) {
			System.out.println("[" + round + "] 回戦　結果: 引き分け( COM: " + comp + " " + rockPapaerScissors[comp - 1] + ")");
			scoreCounter.setCount("lose");

		} else if ((player == 1 && comp == 3) || (player == 2 && comp == 1) || (player == 3 && comp == 2)) {
			System.out.println("[" + round + "] 回戦　結果: 勝ち( COM: " + comp + " " + rockPapaerScissors[comp - 1] + ")");
			scoreCounter.setCount("win");
		} else {
			System.out.println("[" + round + "] 回戦　結果: 負け( COM: " + comp + " " + rockPapaerScissors[comp - 1] + ")");
			scoreCounter.setCount("draw");
		}

	}

}
