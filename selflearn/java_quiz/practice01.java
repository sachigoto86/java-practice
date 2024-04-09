package java_quiz;

import java.util.Arrays;

public class practice01 {

	public static void main(String[] args) {
		//          
		//          var food = "";
		//          
		//          switch (food){
		//              case "A":
		//                 System.out.println("ハンバーガー");
		//                 break;
		//              case "B":
		//                  System.out.println("とんかつ");
		//                  break;
		//              case "C":
		//                  System.out.println("ラーメン");
		//                  break;
		//              default:
		//                  System.out.println("入力し直して下さい。");
		//                  
		//                  
		//          }

		//int inputValue = 5;
		//
		//var stars = new StringBuilder();
		//for (int i = 1; i <= inputValue; i++) {
		//	for (int k = 0; k < i; k++) {
		//		stars.append("☆");
		//
		//	}
		//
		//	stars.append(System.lineSeparator());
		//
		//}
		//
		//System.out.print(stars);

		//int inputValue = 10;
		//int sum = 0;
		//
		//for (var i = 1; i <= inputValue; i++) {
		//	if (i % 2 == 0)
		//		continue;
		//	else
		//		sum += i;
		//
		//}
		//
		//System.out.println(sum);

		int randomNumber = 0;

		//while (randomNumber != 7){
		//    randomNumber = (int) (Math.random() * 9) + 1;
		//    System.out.println("it's not 7"); 
		//    
		//}
		//
		//System.out.println("it's 7");

		//while(true) {
		//    if(randomNumber == 7) {
		//        System.out.println("it's 7. end of the loop");
		//        break;
		//    }
		//    
		//     randomNumber = (int) (Math.random() * 9) + 1;
		//     System.out.println("it is not 7");
		//}

		//
		//int[] arr = new int[5];
		//for (int i = 0; i < 5; ++i) {
		//    arr[i] = i;
		//}
		//for (int i = 0; i < 10; ++i) {
		//    try {
		//        System.out.println(arr[i]);
		//    } catch (ArrayIndexOutOfBoundsException e) {
		//        System.out.println("Index out of bounds for array: " + i);
		//    }
		//}

		int[] numArray = new int[10];

		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = i + 1;
		}

		numArray[2] = numArray[6] * numArray[1];

		numArray[3] = -1;

		numArray[0] = 9;
		numArray[numArray.length - 1] = 9;

		System.out.println(Arrays.toString(numArray));

	}

}
