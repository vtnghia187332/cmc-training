package lab06.part2;

import java.util.Scanner;

public class Homework7 {
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
            //output
            for (int i = 0; i < array.length; i++) {
                if (isEvenNumber(array[i])) {
                    System.out.println("In ra các phần tử là số chẵn của mảng: " + array[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }

    public static boolean isEvenNumber(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

