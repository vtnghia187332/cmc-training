package lab01.part4;

import java.util.Scanner;

public class Homework2 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {

            //input a number
            System.out.println("Please input some number");
            int number = scanner.nextInt();
            //output a number
            System.out.println("A number is: " + number);

        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: "+e);
        }

    }
}
