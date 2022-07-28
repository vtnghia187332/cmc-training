package lab10.part2;

import lab07.part2.City;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            List<LuxuryCar> luxuryCars = new ArrayList<>();
            int choose;
            Scanner nhap = new Scanner(System.in);
            int n = 0;
            while (true) {
                System.out.println("\n======================= MENU =======================\n");
                System.out.println("1. Nhập vào một danh sách LuxuryCar");
                System.out.println("2. Hiển thị thông tin của danh sách");
                System.out.println("3. Sắp xếp danh sách giảm dần bởi giá bán và hiển thị thông tin");
                System.out.println("4. Tìm kiếm thông tin theo tên xe nhập vào");
                System.out.println("5. Hiển thị tổng giá bán với giá vận chuyển là $ 20,000");
                System.out.println("6. Thoát");
                System.out.println("=========== Mời nhập từ 1 --> 7:===========");
                choose = nhap.nextInt();
                switch (choose) {
                    case 1:
                        break;
                    case 2:
                        System.out.println("====== Nhập vào một danh sách LuxuryCar ======== ");
                        break;
                    case 3:
                        System.out.println("======Hiển thị thông tin của danh sách ======== ");
                        break;
                    case 4:
                        System.out.println("======Tìm kiếm thông tin theo tên xe nhập vào========");
                        break;
                    case 5:
                        System.out.println("========== Hiển thị tổng giá bán với giá vận chuyển là $ 20,000 ========");
                        break;
                    case 6:
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

    public static void inputLuxuriesCar(List<LuxuryCar> luxuryCars) {
        System.out.println("Nhập vào số xe hơi mà bạn muốn");
        int numberCars = scanner.nextInt();
        LuxuryCar luxuryCar = new LuxuryCar();

        for (int i = 0; i < numberCars; i++) {
//            luxuryCar.nhap;
            luxuryCars.add(luxuryCar);
        }
    }

    public static void displayCars(List<LuxuryCar> luxuryCars) {
        for (LuxuryCar car : luxuryCars
        ) {
//            car.hienthi();
        }
    }

    public static LuxuryCar findCarByName(String name, List<LuxuryCar> cars) {
        LuxuryCar luxuryCar = new LuxuryCar();
        for (LuxuryCar car : cars
        ) {
            if (name == car.getName()) {
                luxuryCar = car;
            }
        }
        return luxuryCar;
    }

    public static float sumSalePrice() {
        LuxuryCar luxuryCar = new LuxuryCar();
        System.out.println("Nhập vào giá vận chuyển");
        float transportCost = scanner.nextFloat();
        return luxuryCar.calculatePrice(transportCost);
    }
}
