package lab09.part2.vehicle.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {
            int choose;
            Scanner nhap = new Scanner(System.in);
            int n = 0;
            while (true) {
                System.out.println("\n======================= MENU =======================\n");
                System.out.println("1. Nhập thông tin vào cho mảng 3 đối tượng Car và mảng 3 đối tượng Truck");
                System.out.println("2. Hiển thị toàn bộ thông tin của 3 Car và 3 Truck");
                System.out.println("3. Hiển thị danh sách các xe trước khi sắp xếp và sau khi sắp xếp theo giá");
                System.out.println("4. Người dùng sẽ phải nhập vào 1 chuỗi, sau đó chương trình in ra đối tượng có model đó");
                System.out.println("5. Thoát");
                System.out.println("=========== Mời nhập từ 1 --> 5:===========");
                choose = nhap.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("========Nhập thông tin vào cho mảng 3 đối tượng Car và mảng 3 đối tượng Truck=======");
                        break;
                    case 2:
                        System.out.println("====== Hiển thị toàn bộ thông tin của 3 Car và 3 Truck ======== ");
                        break;
                    case 3:
                        System.out.println("======Hiển thị danh sách các xe trước khi sắp xếp và sau khi sắp xếp theo giá ======== ");
                        break;
                    case 4:
                        System.out.println("======Người dùng sẽ phải nhập vào 1 chuỗi, sau đó chương trình in ra đối tượng có model đó========");
                        break;
                    case 5:
                        System.out.println("Goodbye");
                        System.exit(0);
                    default:
                        System.out.println("Con lạy thánh, đừng trêu như vậy nữa");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
