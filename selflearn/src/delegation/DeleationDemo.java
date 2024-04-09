package delegation;

public class DeleationDemo {

	public static void main(String[] args) {
		Epson epson = new Epson();
		HP hp = new HP();

		Printer printer = new Printer(epson);

		printer.print();

	}

}

interface Task {

	public void print();
}

// delegation class 
// it's like a controler

class Printer implements Task {
	Task printer;

	// constructor
	public Printer(Task printer) {
		this.printer = printer;
	}

	@Override
	public void print() {
		this.printer.print();

	}

}



class HP implements Task {

	@Override
	public void print() {
		System.out.println("HP Printing... ");

	}

}

class Epson implements Task {

	@Override
	public void print() {
		System.out.println("EPSON Printing... ");

	}

}