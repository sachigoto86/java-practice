package trycatch;

import java.io.IOException;

public class ThrowsMethod {
	public static void main(String[] args) {
		WriteFile wf = new WriteFile();

		try {
			wf.open();
			wf.write();
		} catch (IOException e) {
			System.out.println("IOExeption occured");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		} finally {
			wf.close();
		}
	}
}
