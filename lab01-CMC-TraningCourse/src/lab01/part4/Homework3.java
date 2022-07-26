package lab01.part4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework3 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //input a INTEGER number
            System.out.println("Please input integer number");
            int intergerNumber = scanner.nextInt();

            //input a DOUBLE number
            System.out.println("Please input double number");
            double doubleNumber = scanner.nextDouble();

//        output numbers
            System.out.println("Integer number is: " + intergerNumber);
            System.out.println("Double number is: " + doubleNumber);
        } catch (InputMismatchException e) {
            System.out.println("Error!!, Please input a number");
        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: "+e);

        }
    }
}
