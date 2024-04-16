package problem5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class problem5_5 {
	//	probex5-4を参考にして、コンソールから文字列を入力させ続けて、何も入力せずEnterを押すと、それまで入力した文字列の中から、5文字以上の単語以外のものがすべて表示されるようにプログラムを作りなさい。なお入力され続けていた文字列は、すべて一旦ArrayListに格納し、最後に5文字以上のものを削除してから表示しなさい。

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		//  コンソールから文字列の読み込み
		System.out.print("文字を入力: ");
		String buf = br.readLine();
		ArrayList<String> list = new ArrayList<>();
		while (!buf.isEmpty()) {
			list.add(buf);
			System.out.print("文字を入力: ");
			buf = br.readLine();
		}

		Iterator<String> listItem = list.iterator();

		while (listItem.hasNext()) {
			String item = listItem.next();
			if (item.length() <= 5) {
				listItem.remove();
			}
		}

		System.out.println(list);
	}
}
