package lab08.part2;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien {
    Scanner scanner = new Scanner(System.in);
    private double wageAggreementl;
    private double workHoursLegal = 40;

    public GiangVienCoHuu(String name, String address, String phoneNumber, double workHours, double wageAggreementl, double workHoursLegal) {
        super(name, address, phoneNumber, workHours);
        this.wageAggreementl = wageAggreementl;
        this.workHoursLegal = workHoursLegal;
    }

    public GiangVienCoHuu(double wageAggreementl, double workHoursLegal) {
        this.wageAggreementl = wageAggreementl;
        this.workHoursLegal = workHoursLegal;
    }

    public double getWageAggreementl() {
        return wageAggreementl;
    }

    public void setWageAggreementl(double wageAggreementl) {
        this.wageAggreementl = wageAggreementl;
    }

    public double getWorkHoursLegal() {
        return workHoursLegal;
    }

    public void setWorkHoursLegal(double workHoursLegal) {
        this.workHoursLegal = workHoursLegal;
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("GiangVienCoHuu{" +
                "scanner=" + scanner +
                ", wageAggreementl=" + wageAggreementl +
                ", workHoursLegal=" + workHoursLegal +
                '}');
    }

    @Override
    public void nhap() {
        super.nhap();
        scanner = new Scanner(System.in);
        System.out.println("Nhập vào lương thỏa thuận");
        wageAggreementl = scanner.nextDouble();
        System.out.println("Nhập vào số giờ làm việc quy định");
        workHoursLegal = scanner.nextDouble();


    }


}
