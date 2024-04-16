package problem5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem5_7 {

	public static void main(String[] args) {
		//		以下のように、0から10までの乱数を発生させ、その数値を小さい順に並べ替えて表示されるようなプログラムを作りなさい。0が出力されたら、プログラムは終了するものとする。なお、それまで入力され続けていた数値は、ArrayListに格納し、適切な場所に挿入するようにすること。

		Scanner scanner = new Scanner(System.in);

		//		System.out.println("0～10の値を出力");
		ArrayList<Integer> numberList = new ArrayList<>();
		int input = 0;

		while (true) {
			input = (int) (Math.random() * 11);
			System.out.println("0～10の値を出力: " + input);

			if (input != 0) {
				numberList.add(input);
				Collections.sort(numberList);
				System.out.println("出力された数 : " + numberList);
			} else {
				break;
			}
		}

		System.out.print(numberList);

	}

}
