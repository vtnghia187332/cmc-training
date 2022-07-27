package lab04.part2.homework3;

import java.util.Scanner;

public class XeMay {
    public Scanner scanner = new Scanner(System.in);

    private String ten;
    private String nhaSanXuat;
    private int soLuongBanhXe;

    public XeMay(String ten, String nhaSanXuat, int soLuongBanhXe) {
        this.ten = ten;
        this.nhaSanXuat = nhaSanXuat;
        this.soLuongBanhXe = soLuongBanhXe;
    }

    public XeMay() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getSoLuongBanhXe() {
        return soLuongBanhXe;
    }

    public void setSoLuongBanhXe(int soLuongBanhXe) {
        this.soLuongBanhXe = soLuongBanhXe;
    }

    public void input() {
        System.out.println("Nhập vào Tên");
        ten = scanner.nextLine();

        System.out.println("Nhập vào Địa chỉ");
        nhaSanXuat = scanner.nextLine();

        //        clear buffer
        scanner = new Scanner(System.in);

        System.out.println("Nhập vào Lương");
        soLuongBanhXe = scanner.nextInt();
    }

    public void display() {
        System.out.println("XeMay{" + "ten='" + ten + '\'' + ", nhaSanXuat='" + nhaSanXuat + '\'' + ", soLuongBanhXe=" + soLuongBanhXe + '}');
    }

    @Override
    public String toString() {
        return "XeMay{" + "ten='" + ten + '\'' + ", nhaSanXuat='" + nhaSanXuat + '\'' + ", soLuongBanhXe=" + soLuongBanhXe + '}';
    }
}
