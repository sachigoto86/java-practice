package problem5;

import java.util.ArrayList;
import java.util.Random;

public class problem5_3 {
	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(100);

		ArrayList<Integer> numberList = new ArrayList<>();

		while (number != 0) {
			numberList.add(number);
			number = rand.nextInt(100);
		}

		ArrayList<ArrayList<Integer>> allLists = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			allLists.add(new ArrayList<Integer>());
		}

		for (int num : numberList) {
			int index = num % 10;
			allLists.get(index).add(num);
		}

		for (int i = 0; i < allLists.size(); i++) {
			if (!allLists.get(i).isEmpty()) { // Only print lists that are not empty
				System.out.println("ーの位が " + i + ": " + allLists.get(i));
			} else {
				System.out.println("ーの位が " + i + ": なし");
			}
		}

	}
}
