package trycatch;

public class Divide2 {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("Start calculating");
			System.out.println("a/b = " + (a / b) + " remaining " + (a % b));
			System.out.println("end");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter two integers");
			System.out.println("detaisl: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception Occured");
			System.out.println("Details " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Ending the program");
		}
	}

}
