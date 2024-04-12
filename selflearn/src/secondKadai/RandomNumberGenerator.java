package secondKadai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RandomNumberGenerator {
	private ArrayList<Integer> numberList;

	public String generate() {
		numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		Collections.shuffle(numberList);
		String randomThreeDigitsNumber = numberList.get(0).toString() + numberList.get(1).toString()
				+ numberList.get(2).toString();
		return randomThreeDigitsNumber;

	}
}
