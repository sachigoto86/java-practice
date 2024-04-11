package kadai;

import java.util.Arrays;
import java.util.Scanner;

public class kadai2 {

    public static void main(String[] args) {

        int numOfGames = 0;
        Integer[] validEntries = { 1, 2, 3 };
        Counter scoreCounter = new Counter();

        // ゲーム回数の設定
        Scanner scanner = new Scanner(System.in);

        System.out.print("回数入力してください。: ");

        numOfGames = Integer.parseInt(scanner.next());
        

        // 一回戦ごとに勝ち負けの判定をする
        for (int i = 1; i <= numOfGames; i++) {
            int comp = (int) (Math.random() * 3) + 1;
            System.out.println("[" + i + "] 回戦　入力してください。(1.グー 2.パー　3.チョキ)");

            int player = Integer.parseInt(scanner.next());

            if (Arrays.asList(validEntries).contains(player)) {
                GameStatusChecker.GameStatusChecker(player, comp, i, scoreCounter);

            } else {
                System.out.println("正しい入力ではありません。(入力値: " + player + " ) 正しい値を入力してください。");
                i -= 1;
            }

        }

        //結果の表示

        System.out.println("戦績: " + scoreCounter.getWins() + "勝 " + scoreCounter.getLoses() + "敗 "
                + scoreCounter.getDraws() + "引き分け ");

    }
}
