package lab02.part2;

import java.util.Scanner;

public class Homework5 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //input name of student
            System.out.println("Input name of student");
            String studentName = scanner.nextLine();

            //input code of student
            System.out.println("Input code of student");
            String studentCode = scanner.nextLine();

            //input theoryMark
            System.out.println("Input theory mark of student");
            Double theoryMark = scanner.nextDouble();

            //input practiceMark
            System.out.println("Input practice mark  of student");
            Double practiceMark = scanner.nextDouble();
            //input rating
            String rating;
            double averageMark = (double) ((theoryMark + practiceMark) / 2);

            //check data
            if (theoryMark > 0 && practiceMark > 0 && averageMark > 0) {
                if (theoryMark < 4D && practiceMark < 4D) {
                    System.out.println("Sinh viên " + studentName + " phải học lại");
                } else if (theoryMark < 4D) {
                    System.out.println("Sinh viên " + studentName + " thi lại lý thuyết");
                } else if (practiceMark < 4D) {
                    System.out.println("Sinh viên " + studentName + " thi lại thực hành");
                } else if (averageMark >= 4 && averageMark >= 7) {
                    System.out.println("Sinh viên " + studentName + " đạt môn Java");
                } else if (averageMark > 7) {
                    System.out.println("Sinh viên " + studentName + " đạt xuất sắc môn Java");
                }
            } else {
                System.out.println("Marks can not be negative");
            }
        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }

    }

}

