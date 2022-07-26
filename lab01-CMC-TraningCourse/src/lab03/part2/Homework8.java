package lab03.part2;

import java.util.Scanner;

public class Homework8 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //input a number
            System.out.println("input a number");
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println("Giai thừa của số " + number + " là: " + tinhGiaithua(number));
            }
        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }

    public static long tinhGiaithua(int n) {
        long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }
}
