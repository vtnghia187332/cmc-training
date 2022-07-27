package lab06.part2;

import java.util.Scanner;

public class Homework3 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào độ dài mảng");
            int n = scanner.nextInt();

            int array[] = new int[n];
            System.out.println("Nhập vào giá trị " + n + " phần tử của mảng");

            for (int i = 0; i < array.length; i++) {
                System.out.print("Giá trị thứ " + (i + 1) + " là: ");
                int inputArray = scanner.nextInt();
                array[i] = inputArray;
            }
            System.out.print("Giá trị của mảng là: [");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("]");

        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }
}
