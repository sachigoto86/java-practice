package trycatch;

public class PracticeQuestion {
	public static void main(String[] args) {

		try {
			System.out.println("start processing");
			System.out.println(args.length);
			int[] a = new int[3];
			for (int i = 0; i < args.length; i++) {
				a[i] = Integer.parseInt(args[i]);
				System.out.println(a[i]);
			}
		} catch (NumberFormatException e) {
			System.out.println("Exception: NumberFormatException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Exception: Exception");
		} finally {
			System.out.println("End the process");
		}
	}

}
