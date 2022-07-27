package lab04.part2.homework1;

import java.text.ParseException;
import java.util.Scanner;

public class MainInvoiceBread {
    public static void main(String[] args) throws ParseException {
        HoaDonBanhMy hoaDonBanhMy = new HoaDonBanhMy();

        int choose;
        Scanner nhap = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("======================= MENU ====================");
            System.out.println("1. Tính khuyến mãi");
            System.out.println("2. Nhập thông tin hóa đơn");
            System.out.println("3. In hóa đơn");
            System.out.println("4. Thoát");
            System.out.println("=========== Mời nhập từ 1 --> 4:===========");
            choose = nhap.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Tiền khuyến mãi");
                    hoaDonBanhMy.tinhTienKmai();
                    break;
                case 2:
                    System.out.println("Nhập vào thông tin hóa đơn");
                    hoaDonBanhMy.inputBreadInvoice();
                    break;
                case 3:
                    System.out.println("In hóa đơn");
                    System.out.println(hoaDonBanhMy.toString());;
                    break;
                case 4:
                    System.out.println("Goodbye");
                    System.exit(0);
                default:
                    System.out.println("Con lạy thánh, đừng trêu như vậy nữa");
            }
        }


    }
}
