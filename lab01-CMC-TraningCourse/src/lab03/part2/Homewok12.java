package lab03.part2;

import java.util.Scanner;

public class Homewok12 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Số đầu tiên cần kiểm tra của dãy số fibonacci: ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if(fibonacci(i) == 0){
                    System.out.print("");
                }else {
                    System.out.print(fibonacci(i) + " ");
                }
            }

        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
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
