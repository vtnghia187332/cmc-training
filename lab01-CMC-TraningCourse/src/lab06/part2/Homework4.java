package lab06.part2;

import java.util.Scanner;

public class Homework4 {
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

            int maxArray = array[0];
            int minArray = array[0];
            for (int i = 0; i < array.length; i++) {
                maxArray = (maxArray <= array[i]) ? (maxArray = array[i]) : (maxArray);
                minArray = (minArray > array[i]) ? (array[i]) : (minArray);

            }
            System.out.println("In ra phần tử max: " + maxArray);
            System.out.println("In ra phần tử min: " + minArray);
        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }
}
