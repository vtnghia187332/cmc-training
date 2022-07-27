package lab03.part2;

import java.util.Scanner;

public class Homewok11 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //find "số hoàn hảo"
            int sum = 0, a;
            System.out.println("\n\nNhập vào số cần kiểm tra: ");
            a = sc.nextInt();

            //lặp các số cần tính toán
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i / 2; j++) {
                    //tìm ước của số a
                    if (i % j == 0)
                        //tổng các ước số của a
                        sum += j;
                }
                //nếu tổng ước số sum = i thì i là số hoàn hảo
                if (sum == i) {
                    System.out.println(i + " là số hoàn hảo");
//
                } else {
//                    System.out.println(i + " không phải là số hoàn hảo");
                }
//                reset sum
                sum = 0;
            }

        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }
}
