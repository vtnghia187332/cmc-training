package lab01.part4;

import java.util.Scanner;

public class Homework6 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //input 1st integer number
            System.out.println("Please input first integer number");
            int n1 = scanner.nextInt();
            //input 2nd integer number
            System.out.println("Please input second integer number");
            int m1  = scanner.nextInt();

            //input 1st double number
            System.out.println("Please input first double number");
            double n2 = scanner.nextDouble();
            //input 2nd double number
            System.out.println("Please input first double number");
            double m2 = scanner.nextDouble();

            //sum of (2 integer numbers and 2 double numbers)
            Double sumOfNumbers = (Double) ((n1+m1) + (n2+m2));
            //output result
            System.out.println("Result is: "+sumOfNumbers);
        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }


    }
}
