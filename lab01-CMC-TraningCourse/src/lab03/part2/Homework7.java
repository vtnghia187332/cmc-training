package lab03.part2;

import java.util.Scanner;

public class Homework7 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //input a number
            System.out.println("input a number");
            int number = scanner.nextInt();

            //check odd number
            if (number > 0) {
                System.out.println("odd number are(is): ");
                //sum of odd numbers
                int sumOddNumber = 0;

                //sum of numbers
                int sumNumbers = 0;
                for (int i = 1; i <= number; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i + " ");
                        sumOddNumber += i;
                    }
                    sumNumbers += i;
                }
                //cal sum of odd numbers
                System.out.println("Tổng bình phương số lẻ là: " + (sumOddNumber * sumOddNumber));

                // trung bình cộng của N số nguyên dương từ 1 tới N
                int averageNumber = sumNumbers / number;
                System.out.println("In ra các số chẵn lớn hơn trung bình cộng của N số nguyên dương từ 1 tới Number");
                for (int i = 1; i < number; i++) {
                    if (i % 2 == 0) {
                        if (i > averageNumber) {
                            System.out.println(i);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }
}
