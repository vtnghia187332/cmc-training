package lab08.part2;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {
    private String department;
    private Double hoursCanWork;

    public GiangVienThinhGiang(String name, String address, String phoneNumber, double workHours, String department, Double hoursCanWork) {
        super(name, address, phoneNumber, workHours);
        this.department = department;
        this.hoursCanWork = hoursCanWork;
    }

    public GiangVienThinhGiang(String department, Double hoursCanWork) {
        this.department = department;
        this.hoursCanWork = hoursCanWork;
    }

    public GiangVienThinhGiang() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double gethoursCanWork() {
        return hoursCanWork;
    }

    public void sethoursCanWork(Double hoursCanWork) {
        this.hoursCanWork = hoursCanWork;
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("GiangVienThinhGiang{" +
                "department='" + department + '\'' +
                ", hoursCanWork='" + hoursCanWork + '\'' +
                '}');
    }

    @Override
    public void nhap() {
        super.nhap();
        scanner = new Scanner(System.in);
        System.out.println("Nhập vào cơ quan làm việc");
        department = scanner.nextLine();
        System.out.println("Nhập vào giờ có thể giảng dạy");
        hoursCanWork = scanner.nextDouble();
    }


}
