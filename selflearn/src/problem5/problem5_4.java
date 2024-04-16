package problem5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class problem5_4 {
	//このプログラムを改造し、コンソールから文字列を入力させ続けて、何も入力せずEnterを押すと、それまで入力した文字列のが全て表示されるプログラムを作りなさい。このとき文字列は、ArrayListで作った可変長配列に格納すること。
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

		System.out.println(list);
	}

}
