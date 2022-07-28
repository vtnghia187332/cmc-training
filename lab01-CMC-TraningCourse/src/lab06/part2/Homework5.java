package lab06.part2;

import java.util.Scanner;

public class Homework5 {
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
                if (isPrimeNumber(array[i])) {
                    System.out.println("In ra các phần tử là số nguyên tố của mảng: " + array[i]);
                }
            }

        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
