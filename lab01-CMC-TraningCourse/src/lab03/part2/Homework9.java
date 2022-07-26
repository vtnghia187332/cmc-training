package lab03.part2;

import java.util.Scanner;

public class Homework9{
    public static void main(String[] args) {
        int choose;
        Scanner nhap = new Scanner(System.in);
        //Bước 5: Khai báo biến n kiểu int trong hàm main và thực hiện
        //theo các chức năng của menu.
        int n = 0;
        //Bước 2: Sử dụng vòng lặp while để hiển thị lên menu như yêu cầu
        while (true) {
            System.out.println("======================= Cuối tuần bạn muốn làm gì? ====================");
            System.out.println("1. Đi học Java");
            System.out.println("2. Đi chơi Công viên ngắm gấu");
            System.out.println("3. Đi (về) nhà nghỉ");
            System.out.println("4. Ra sông Hồng tắm tiên");
            System.out.println("5. Ngủ cả ngày");
            System.out.println("6. Thoát");
            System.out.println("=========== Mời nhập từ 1 --> 6:===========");
            choose = nhap.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("====== Đi học Java ======== ");
                    break;
                case 2:
                    System.out.println("====== Đi chơi Công viên ngắm gấu ======== ");
                    break;
                case 3:
                    System.out.println("====== Đi (về) nhà nghỉ ======== ");

                    break;
                case 4:
                    System.out.println("====== Ra sông Hồng tắm tiên ========");
                    break;
                case 5:
                    System.out.println("========== Ngủ cả ngày ========");
                    break;
                case 6:
                    System.out.println("Say hi");
                    System.exit(0);
                default:
                    //Nếu người dùng không lựa chọn từ 1 đến 4 thì in ra như này
                    System.out.println("Con lạy thánh, đừng trêu như vậy nữa");
            }
        }
    }
}
