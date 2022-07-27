package lab06.part2;

import java.util.Scanner;

public class Homework2 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            int max = 10;
            int min = 1;
            int range = max - min + 1;


            for (int i = 0; i < array.length; i++) {
                int rand = (int) (Math.random() * range) + min;
                array[i] = rand;
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
