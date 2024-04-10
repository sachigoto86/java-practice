package prob1_4;

public class Counter {
	
	//  カウント
	private int count = 0;
	public static int totalCount = 0;

	//  コンストラクタ
	public void reset() {
		totalCount -= count;
		count = 0;

	}

	//  カウント
	public void count() {
		count++;
		totalCount++;
	}

	//  値の取得
	public int getCount() {
		return count;
	}

	public static int getTotalCount() {
		return totalCount;
	}
}