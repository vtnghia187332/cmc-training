package lab06.part2;

import java.sql.Array;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int array[] = new int[10];
            System.out.println("Nhập vào giá trị 10 phần tử của mảng");

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
