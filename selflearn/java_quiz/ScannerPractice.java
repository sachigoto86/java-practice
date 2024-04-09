package java_quiz;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);

        System.out.print("Enter a number");

        var result = inputValue.nextInt();

        if (result >= 90)
            System.out.println("Very Good!");
        else if (result >= 80)
            System.out.println("Good!");
        else if (result >= 60)
            System.out.println("Not Bad!");
        else
            System.out.println("Bad!");
    }

}
