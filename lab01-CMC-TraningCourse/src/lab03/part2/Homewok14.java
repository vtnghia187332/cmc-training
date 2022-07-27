package lab03.part2;

import java.util.Scanner;

public class Homewok14 {
    public static void main(String[] args) {
        int choose;
        Scanner nhap = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("======================= MENU ====================");
            System.out.println("1. Nhập họ tên của bạn");
            System.out.println("2. Nhập vào điểm toán, điểm lý, điểm văn");
            System.out.println("3. Hiển thị điểm trung bình");
            System.out.println("4. Hiển thị xếp loại theo điểm trung bình");
            System.out.println("5. Thoát");
            System.out.println("=========== Mời nhập từ 1 --> 5:===========");
            choose = nhap.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("====== Nhập họ tên của bạn ======== ");
                    break;
                case 2:
                    System.out.println("====== Nhập vào điểm toán, điểm lý, điểm văn ======== ");
                    break;
                case 3:
                    System.out.println("====== Hiển thị điểm trung bình ======== ");

                    break;
                case 4:
                    System.out.println("====== Hiển thị xếp loại theo điểm trung bình ========");
                    break;
                case 5:
                    System.out.println("Goodbye");
                    System.exit(0);
                default:
                    System.out.println("Con lạy thánh, đừng trêu như vậy nữa");
            }
        }
    }
}
