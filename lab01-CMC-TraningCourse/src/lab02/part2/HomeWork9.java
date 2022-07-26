package lab02.part2;

import java.util.Scanner;

public class HomeWork9 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //input a month
            System.out.println("Input a month");
            int aMonth = scanner.nextInt();
            //input a year
            System.out.println("Input a year");
            int aYear = scanner.nextInt();

            int getDay;

            //check days
            if (aMonth > 0 && aMonth <= 12
                    && aMonth != 2
                    && aMonth != 4
                    && aMonth != 6
                    && aMonth != 9
                    && aMonth != 11
            ) {
                getDay = 31;
            } else if (aMonth > 0 && aMonth <= 12
                    && aMonth == 4
                    && aMonth != 2
                    && aMonth == 6
                    && aMonth == 9
                    && aMonth == 11
            ) {
                getDay = 30;
            } else if (aMonth > 0 && aMonth <= 12
                    && aYear % 4 == 0
            ) {
                getDay = 29;
            } else {
                getDay = 28;
            }
            //output
            System.out.println("there are " + getDay + " days of " + aMonth + " " + aYear);
        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }
}
