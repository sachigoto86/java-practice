package problem5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Problem5_2 {
	public static void main(String[] args) {
		//		以下のように、0から10までの乱数を発生させてその値を表示し、0が出たら、それまで入力した整数を逆から表示するプログラムを作りなさい。

		Random rand = new Random();
		int number = rand.nextInt(11);
		ArrayList<Integer> numberList = new ArrayList<>();
		ArrayList<Integer> originalList = new ArrayList<>();
		while (number != 0) {
			numberList.add(number);
			originalList.add(number);
			number = rand.nextInt(11);
		}

		Collections.reverse(numberList);

		//		StringBuilder reversedList = new StringBuilder();
		//
		//		for (int item : numberList) {
		//			reversedList.append(item + " ");
		//		}

		System.out.println("Original " + (originalList));
		System.out.println("Original " + (numberList));
		//		System.out.println("Reversed: " + reversedList);

	}
}
