package java_quiz;

public class InitializationBlock {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			// instance initialization block
			new Duck();

		}

		for (int i = 0; i < 5; i++) {
			Goose.myInt++; // static initialization block accessing its field
			//            Goose.myMethod(); // static initalization block accessing its method
			new Goose();
		}

	}

}

class Duck {
	// instance initialization block
	{
		System.out.println("Duck");
	}
}

class Goose {
	// create default constructor - this message will get printed only when you invoke the constructor by using new Goose() 
	// as long as you are calling methods and fields directly without calling the constuctor, you wont' see the message. 
	Goose() {
		super();
		System.out.println("Goose constructor was invoked");
	}

	//static initialization block
	static int myInt = 0;
	static {
		System.out.println("Goose");
	} // only invoked once even thouth it gets executed 5 times!

	static void myMethod() {
		myInt++;
	}
}
