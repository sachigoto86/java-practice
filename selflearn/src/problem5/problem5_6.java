package problem5;

import java.util.ArrayList;
import java.util.Scanner;

public class problem5_6 {

	public static void main(String[] args) {
		//以下のように、0から10までの乱数を発生させてその値を表示し、0が出たら、それまで入力した整数の中から2を除いた数を選んで表示するプログラムを作りなさい。このとき、入力された整数値はlistで作った可変長配列の中に格納し、最後に、2の入った要素をremove()メソッドで削除してから表示するようにしなさい。

		Scanner scanner = new Scanner(System.in);

		//		System.out.print("0～10の値を入力 ");
		ArrayList<Integer> numberList = new ArrayList<>();
		//		System.out.print("0～10の値を入力 ");
		//		int input = (int) (Math.random() * 11);
		//		;
		int input;

		while (true) {

			System.out.print("0～10の値を入力 ");
			input = (int) (Math.random() * 11);
			System.out.println(input);

			if (input != 0) {
				numberList.add(input);
			} else {
				break;
			}

		}

		System.out.println(numberList);

		while (numberList.contains(Integer.valueOf(2))) {
			numberList.remove(Integer.valueOf(2));
		}

		System.out.println(numberList);
		scanner.close();

	}

}
