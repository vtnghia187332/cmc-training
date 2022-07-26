package lab02.part2;

import java.util.Scanner;

public class Homework8 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Input first integer number");
            int firstNumber = scanner.nextInt();
            System.out.println("Input second integer number");
            int secondNumber = scanner.nextInt();
            System.out.println("Input third integer number");
            int thirdNumber = scanner.nextInt();
            System.out.println("Input fourth integer number");
            int fourthNumber = scanner.nextInt();

            //check a pair of number -> find higher number
            int firstHigherNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;
            int secondHigherNumber = (thirdNumber > fourthNumber) ? thirdNumber : fourthNumber;

            //check maximum number
            int maximumNumber = (firstHigherNumber > secondHigherNumber) ? firstHigherNumber : secondHigherNumber;
            //output
            System.out.println("Maximum number is: " + maximumNumber);
        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }

}
