package lab07.part2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerCity {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        try {
        List<City> cities = new ArrayList<>();
        int choose;
        Scanner nhap = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("\n======================= MENU =======================\n");
            System.out.println("1. Nhập thông tin n thành phố");
            System.out.println("2. Hiển thị thông tin vừa nhập");
            System.out.println("3. Sắp xếp thông tin tăng dần theo tên nước.");
            System.out.println("4. Tìm kiếm thông tin theo cityId");
            System.out.println("5. Thoát");
            System.out.println("=========== Mời nhập từ 1 --> 5:===========");
            choose = nhap.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("======== Nhập thông tin n thành phố===============");
                    inputNumberCity(cities);
                    break;
                case 2:
                    System.out.println("====== Hiển thị thông tin vừa nhập===========");
                    displayCities(cities);
                    break;
                case 3:
                    System.out.println("======== Sắp xếp thông tin tăng dần theo tên nước.===========");
                    sortASCByCityName(cities);
                    break;
                case 4:
                    System.out.println("====== Tìm kiếm thông tin theo cityId=========");
                    System.out.println("Nhập vào từ khóa muốn tìm kiếm");
                    String inputString = scanner.nextLine();
                    findByCityId(inputString, cities);
                    break;
                case 5:
                    System.out.println("Goodbye");
                    System.exit(0);
                default:
                    System.out.println("Con lạy thánh, đừng trêu như vậy nữa");
            }
        }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }

    public static void inputNumberCity(List<City> cities) {
        System.out.println("Nhập vào số thành phố mà bạn muốn");
        int numberCities = scanner.nextInt();
        City city = new City();
        //nhập liệu thông tin
        for (int i = 0; i < numberCities; i++) {
            city.nhap();
            cities.add(city);
        }
    }

    public static void displayCities(List<City> cities) {
        for (City city : cities) {
            city.hienthi();
        }
    }

    public static List<String> sortASCByCityName(List<City> cities) {
        List<String> cityName = new ArrayList<>();
        for (int i = 0; i < cities.size(); i++) {
            cityName.add(cities.get(i).getCityName());
        }
        Collections.sort(cityName);
        System.out.println(cityName);
        return cityName;
    }

    public static City findByCityId(String cityId, List<City> cities) {
        City city = new City();
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getCityId() == cityId) {
                return cities.get(i);
            } else {
                return null;
            }
        }
        return city;
    }

}
