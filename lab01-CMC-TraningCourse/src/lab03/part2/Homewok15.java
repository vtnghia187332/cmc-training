package lab03.part2;

import java.util.Scanner;

public class Homewok15 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //input a number
        System.out.println("Input a number");
        int number = sc.nextInt();
        int choose;
        Scanner nhap = new Scanner(System.in);
        int n = 0;
        int dem;
        while (true) {
            System.out.println("\n======================= MENU ====================\n");
            System.out.println("1. Nhập vào một số nguyên dương n");
            System.out.println("2. In các số fibonacci trong khoảng từ 1 đến n");
            System.out.println("3. Phân tích n thành tích lũy thừa các thừa số nguyên tố");
            System.out.println("4. Thoát");
            System.out.println("=========== Mời nhập từ 1 --> 4:===========");
            choose = nhap.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("The number is: " + number);
                    break;
                case 2:
                    for (int i = 0; i < number; i++) {
                        if (fibonacci(i) == 0) {
                            System.out.print("");
                        } else {
                            System.out.print(fibonacci(i) + " " + "\n");
                        }
                    }
                    break;
                case 3:
                    for (int i = 2; i < number; i++) {
                        dem = 0;
                        while (number % i == 0) {
                            ++dem;
                            number /= i;
                        }
                        if (dem > 0) {
                            if (dem > 1) {
                                System.out.print(i + "^" + dem);
                            } else {
                                System.out.println(i);
                            }
                            if (number > i) {
                                System.out.print(" * ");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Goodbye");
                    System.exit(0);
                default:
                    System.out.println("Con lạy thánh, đừng trêu như vậy nữa");
            }
        }
    }

    //calculate fibonacci number
    public static int fibonacci(int n) {

        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        if (fn > n) {
            return 0;
        } else {
            return fn;
        }
    }
}
