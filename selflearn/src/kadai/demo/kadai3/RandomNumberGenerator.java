package kadai.demo.kadai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RandomNumberGenerator {

	private ArrayList<Integer> numberList;

	//1から９までの３桁のランダム数を生成し、String型で返します。
	public String generate(int numberOfDigits) {

		numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		Collections.shuffle(numberList);
		String randomNumber = "";
		for (int i = 0; i < numberOfDigits; i++) {
			randomNumber += numberList.get(i).toString();
		}

		System.out.println("anwer " + randomNumber);
		return randomNumber;

	}
}
