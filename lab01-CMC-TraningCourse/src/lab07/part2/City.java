package lab07.part2;

import java.util.Scanner;

public class City {
    Scanner scanner = new Scanner(System.in);
    private String cityId; //Mã thành phố

    private String cityName; //Tên thành phố

    private String country; //Tên nước

    private double area; //diện tích

    public City(String cityId, String cityName, String country, double area) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.country = country;
        this.area = area;
    }

    public City() {
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void nhap() {
        scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã thành phố");
        cityId = scanner.nextLine();
        System.out.println("Nhập vào tên thành phố");
        cityName = scanner.nextLine();
        System.out.println("Nhập vào đất nước");
        country = scanner.nextLine();
        System.out.println("Nhập vào diện tích");
        area = scanner.nextDouble();
    }

    public void hienthi() {
        System.out.println("City{" + "cityId='" + cityId + '\'' + ", cityName='" + cityName + '\'' + ", country='" + country + '\'' + ", area=" + area + '}');
    }


}
