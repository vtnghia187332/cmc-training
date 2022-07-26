package lab02.part2;

import java.util.Scanner;

public class Homework6 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //input
        System.out.println("Input a integer number");
        int number = scanner.nextInt();

        //check number
        if (number % 2 == 0) {
            //output
            System.out.println("Đây là số chẵn!");
        } else {
            //output
            System.out.println("Đây là số lẻ!");
        }
    }
}
