package problem7_1;

public class Airplane {

	public static void main(String[] args) {

		//		try {
		//			int a[] = { 0, 1, 2 };
		//
		//			for (int i = 0; i < 4; i++) {
		//				System.out.println("a[" + i + "]=" + a[i]);
		//			}
		//
		//		} catch (ArrayIndexOutOfBoundsException e) {
		//
		//			System.out.println("It is outside of array range");
		//
		//		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				try {
					System.out.print(i + "/ " + j + " = " + i / j + " ");
				} catch (ArithmeticException e) {
					System.out.println("Can't divide a number by 0");

				}
			}
			System.out.println();
		}

	}

}
