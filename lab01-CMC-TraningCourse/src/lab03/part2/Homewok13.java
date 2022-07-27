package lab03.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homewok13 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Input a number: ");
            int n = sc.nextInt();

            int dem;

            for (int i = 2; i < n; i++) {
                dem = 0;
                while (n % i == 0) {
                    ++dem;
                    n /= i;
                }
                if (dem > 0) {
                    if (dem > 1) {
                        System.out.print(i + "^" + dem);
                    } else {
                        System.out.println(i);
                    }
                    if (n > i) {
                        System.out.print(" * ");
                    }
                }
            }


        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }
}
