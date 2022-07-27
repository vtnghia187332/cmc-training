package lab03.part2;

import java.util.Scanner;

public class Homewok10 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //khai báo biến a là số cần kiểm tra, sum là tổng các ước số của a
        int sum = 0, a;
        System.out.println("\n\nNhập vào số cần kiểm tra: ");
        a = sc.nextInt();

        //sử dụng vòng lặp for từ 1 đến a/2 (vì ước số của a luôn luôn nhỏ hơn a/2)
        for (int i = 1; i <= a / 2; i++) {
            //tìm ước của số a
            if (a % i == 0)
                //tổng các ước số của a
                sum += i;
        }
        //nếu tổng ước số sum = a thì a là số hoàn hảo
        if (sum == a) {
            System.out.println(a + " là số hoàn hảo");
        }
        //ngược lại không phải là số hoàn hảo
        else {
            System.out.println(a + " không phải là số hoàn hảo");
        }

    }
}
