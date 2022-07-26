package lab03.part2;

import java.util.Scanner;

public class Homework2 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("input n:");
            int n = scanner.nextInt();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + i;
            }
            System.out.println(sum);

        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }
}
