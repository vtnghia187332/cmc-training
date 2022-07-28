package lab08.part2;

import java.util.Scanner;

public class GiangVien {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String address;
    private String phoneNumber;
    private double workHours;

    public GiangVien(String name, String address, String phoneNumber, double workHours) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.workHours = workHours;
    }

    public GiangVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public void hienthi() {
        System.out.println("GiangVien{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", workHours=" + workHours + '}');
    }

    public void nhap() {
        scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã tên giảng viên");
        name = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ");
        address = scanner.nextLine();
        System.out.println("Nhập vào số điện thoại");
        phoneNumber = scanner.nextLine();
        System.out.println("Nhập vào số giờ làm việc");
        workHours = scanner.nextDouble();
    }

}
