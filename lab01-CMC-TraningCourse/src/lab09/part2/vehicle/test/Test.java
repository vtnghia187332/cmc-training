package lab09.part2.vehicle.test;

import lab09.part2.Car;
import lab09.part2.Truck;
import lab09.part2.Vehicles;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();

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
                        input(cars, trucks);
                        break;
                    case 2:
                        System.out.println("====== Hiển thị toàn bộ thông tin của 3 Car và 3 Truck ======== ");
                        display(cars, trucks);
                        break;
                    case 3:
                        System.out.println("======Hiển thị danh sách các xe trước khi sắp xếp và sau khi sắp xếp theo giá ======== ");
                        sortByPrice(cars, trucks);
                        break;
                    case 4:
                        System.out.println("======Người dùng sẽ phải nhập vào 1 chuỗi, sau đó chương trình in ra đối tượng có model đó========");
                        findByModel(cars, trucks);
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

    public static void input(List<Car> cars, List<Truck> trucks) {
        Car car = new Car();
        Truck truck = new Truck();
        System.out.println("nhập thông tin vào cho mảng 3 đối tượng Car");
        for (int i = 0; i < 3; i++) {
            car.input();
            cars.add(car);
        }
        System.out.println("nhập thông tin vào cho mảng 3 đối tượng Truck");
        for (int i = 0; i < 3; i++) {
            truck.input();
            trucks.add(truck);
        }
    }

    public static void display(List<Car> cars, List<Truck> trucks) {
        System.out.println("hiển thị toàn bộ thông tin của 3 Car");
        for (Car car : cars) {
            car.display();
        }
        System.out.println("hiển thị toàn bộ thông tin của 3 Truck");
        for (Truck truck : trucks) {
            truck.display();
        }
    }

    public static void sortByPrice(List<Car> cars, List<Truck> trucks) {
        System.out.println("Danh sách Cars trước khi sắp xếp");
        for (Car car : cars) {
            car.display();
        }
        System.out.println("Danh sách Cars sau khi sắp xếp");
        List<Car> sortedListCars = cars.stream().sorted(Comparator.comparingDouble(Car::getPrice)).collect(Collectors.toList());


        System.out.println("Danh sách Trucks trước khi sắp xếp");
        for (Truck truck : trucks) {
            truck.display();
        }
        System.out.println("Danh sách Trucks sau khi sắp xếp");
        List<Truck> sortedListTrucks = trucks.stream().sorted(Comparator.comparingDouble(Truck::getPrice)).collect(Collectors.toList());
    }


    public static void findByModel(List<Car> cars, List<Truck> trucks) {
        System.out.println("Nhập vào từ khóa muốn tìm kiếm");
        String keyword = scanner.nextLine();

        boolean isFound = false;
        for (Car car : cars) {
            if (keyword == car.getModel()) {
                System.out.println("Kết quả tìm kiếm là: " + car);
                isFound = true;
            }
        }
        for (Truck truck : trucks) {
            if (keyword == truck.getModel()) {
                System.out.println("Kết quả tìm kiếm là: " + truck);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Không tìm thấy kết quả ");
        }

    }
}
