package problem5;

import java.util.ArrayList;
import java.util.Random;

public class Problem5_1 {
	public static void main(String[] args) {
		//	以下のように、0から10までの乱数を発生させてその値を表示し、0が出たら、それまで入力した整数をすべて、奇数・偶数にわけて表示するプログラムを作りなさい。この時、入力された奇数・偶数の値は、それぞれ別の、ArrayListで作った可変長配列の中に格納すること。

		Random rand = new Random();
		int number = rand.nextInt(11);
		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();

		while (number != 0) {
			if (number % 2 == 0) {
				evens.add(number);
			} else {
				odds.add(number);
			}
			number = rand.nextInt(11);
			//			System.out.println(number);
		}

		StringBuilder oddList = new StringBuilder();
		StringBuilder evenList = new StringBuilder();

		for (int odd : odds) {
			oddList.append(odd + " ");
		}

		for (int even : evens) {
			evenList.append(even + " ");
		}

		System.out.println("偶数: " + evenList);
		System.out.println("奇数: " + oddList);

	}
}
