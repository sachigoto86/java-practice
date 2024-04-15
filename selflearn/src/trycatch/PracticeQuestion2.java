package trycatch;

public class PracticeQuestion2 {

	public static void main(String[] args) {

		try {

			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("a / b = " + (a / b) + " remaining" + (a % b));
			System.out.println("Ending the program");

		} catch (NumberFormatException e) {
			System.out.println("enter numbers");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("please enter a number that is not 0");
			e.printStackTrace();
		} catch (Exception e) {
			//もし、このExceptionを一番上にもってきてしまうと、すべてのエラーが上でキャッチされてしまう。
			System.out.println("exception occured");
			e.printStackTrace();
		}

	}

}
