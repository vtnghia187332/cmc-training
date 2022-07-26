package lab03.part2;

import java.util.Scanner;

public class Homework4 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            boolean isPrime = false;

            System.out.println("input n:");
            int n = scanner.nextInt();

            //check prime number
            if (n < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i < (n - 1); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                    }
                }
                isPrime = true;
            }
            if (isPrime == true) {
                System.out.println("That is Prime number");
            } else {
                System.out.println("That is not Prime number");
            }

        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }


    }

}
