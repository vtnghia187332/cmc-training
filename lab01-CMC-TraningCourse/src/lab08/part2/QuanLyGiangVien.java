package lab08.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyGiangVien {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<GiangVien> giangViens = new ArrayList<>();
        List<GiangVienCoHuu> giangVienCoHuus = new ArrayList<>();
        List<GiangVienThinhGiang> giangVienThinhGiangs = new ArrayList<>();
        try {
            int choose;
            Scanner nhap = new Scanner(System.in);
            int n = 0;
            while (true) {
                System.out.println("\n======================= MENU =======================\n");
                System.out.println("1. Nhập vào thông tin của giảng viên");
                System.out.println("2. Xuất danh sách toàn bộ giảng viên");
                System.out.println("3. Xuất danh sách giảng viên cơ hữu");
                System.out.println("4. Xuất danh sách giảng viên thỉnh giảng");
                System.out.println("5. Tính tổng số tiền lương của toàn bộ giảng viên");
                System.out.println("6. Tìm giảng viên có tổng lương cao nhất");
                System.out.println("7. Thoát");
                System.out.println("=========== Mời nhập từ 1 --> 7:===========");
                choose = nhap.nextInt();
                switch (choose) {
                    case 1:
                        inputTeacher(giangViens);
                        break;
                    case 2:
                        System.out.println("====== Xuất danh sách toàn bộ giảng viên ======== ");
                        displayTeachers(giangViens);
                        break;
                    case 3:
                        System.out.println("======Xuất danh sách giảng viên cơ hữu ======== ");
                        displayGiangVienCoHuu(giangVienCoHuus);
                        break;
                    case 4:
                        System.out.println("======  Xuất danh sách giảng viên thỉnh giảng ========");
                        displayGiangVienThinhGiag(giangVienThinhGiangs);
                        break;
                    case 5:
                        System.out.println("========== Tính tổng số tiền lương của toàn bộ giảng viên ========");
                        calSalaryTeachers(giangViens);
                        break;
                    case 6:
                        System.out.println("========== Tìm giảng viên có tổng lương cao nhất ========");
                        teacherHaveHightestSalary(giangViens);
                        break;
                    case 7:
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

    public static void inputTeacher(List<GiangVien> giangViens) {
        System.out.println("====== Nhập vào thông tin của giảng viên ======== ");
        System.out.println("Nhập vào số giảng viên muốn nhập");
        GiangVien giangVien = new GiangVien();
        int numberTeacher = scanner.nextInt();
        for (int i = 0; i < numberTeacher; i++) {
            giangVien.nhap();
            giangViens.add(giangVien);
        }
    }

    public static void displayTeachers(List<GiangVien> giangViens) {
        for (GiangVien giangVien : giangViens
        ) {
            giangVien.hienthi();
        }
    }

    public static void displayGiangVienCoHuu(List<GiangVienCoHuu> giangVienCoHuus) {
        for (GiangVienCoHuu giangVienCoHuu : giangVienCoHuus
        ) {
            giangVienCoHuu.hienthi();
        }
    }

    public static void displayGiangVienThinhGiag(List<GiangVienThinhGiang> giangVienCoHuus) {
        for (GiangVienThinhGiang giangVienThinhGiang : giangVienCoHuus
        ) {
            giangVienThinhGiang.hienthi();
        }
    }

    public static void calSalaryTeachers(List<GiangVien> giangViens) {
        double sumOfSalary = 0;
        for (int i = 0; i < giangViens.size(); i++) {
            sumOfSalary += giangViens.get(i).getWorkHours() * 400000;
        }
    }

    public static GiangVien teacherHaveHightestSalary(List<GiangVien> giangViens) {
        GiangVien giangVien = new GiangVien();
        GiangVien tempSalary = giangViens.get(0);
        for (int i = 0; i < giangViens.size(); i++) {
            giangVien = (giangViens.get(i).getWorkHours() * 400000 > tempSalary.getWorkHours() * 400000) ? giangViens.get(i) : tempSalary;
        }
        return giangVien;
    }
}
