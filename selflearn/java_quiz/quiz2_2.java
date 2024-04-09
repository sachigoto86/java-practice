package java_quiz;

public class quiz2_2 {

	public static void main(String[] args) {
		/*
		空の状態から関数等を定義して書いてみてください
		今回は円の面積を求める関数circleAreaを作成し、mainで呼び出してください
		(Area of a circle) = (radius) * (radius) * 3.14
		(radius) = (diameter)/2
		Instructrion: 
		First of all define two Function main as void type and cicleArea.
		In main function you don't need to declare and define anything.
		Need to think: data type of the function circleArea
		*/

		//    	  Finally call the function in main and output the result in any ways you like.
		System.out.println(circleArea(10));
	}

	//    Parameter: diameter as integer.
	public static double circleArea(int diameter) {
		//      Also need to define pi(3.14) as const double type.
		final double pi = 3.14;
		//      In circleArea declare radius and then let it store the value.
		var radius = diameter / 2;
		//      Declare or define result and let it store the result or return the result directly.
		return Math.pow(radius, 2) * pi;

	};

}
