package lab01.part4;

import java.util.Scanner;

public class Homework5 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //input a 1st INTEGER number
            System.out.println("Please input first integer number");
            int firstNumber = scanner.nextInt();

            //input a 2nd INTEGER number
            System.out.println("Please input second integer number");
            int secondNumber = scanner.nextInt();

//            output sum of 2 integer numbers
            System.out.println("Addition of 2 integer number is: " + (firstNumber + secondNumber));

        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: "+e);

        }
    }
}
