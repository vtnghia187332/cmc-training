package lab06.part2;

import java.util.Scanner;

public class Homework6 {
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
                if (isPerfectNumber(array[i])) {
                    System.out.println("In ra các phần tử là số hoàn hảo của mảng: " + array[i]);
                }
            }

        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }

    public static boolean isPerfectNumber(int a) {
        int sum = 0;

        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0)
                //tổng các ước số của a
                sum += i;
        }
        //nếu tổng ước số sum = a thì a là số hoàn hảo
        if (sum == a) {
            return true;
        }
        //ngược lại không phải là số hoàn hảo
        else {
            return false;
        }
    }
}
