package lab02.part2;

import java.util.Scanner;

public class Homework7 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //input first side
            System.out.println("input first side");
            Double a = scanner.nextDouble();

            //input first side
            System.out.println("input second side");
            Double b = scanner.nextDouble();

            //input third side
            System.out.println("input second side");
            Double c = scanner.nextDouble();

            sumTwoSides(1d, 2d);

            //check condition of triangle
            if (a > 0
                    && b > 0
                    && c > 0
                    && a > sumTwoSides(b, c)
                    && b > sumTwoSides(a, c)
                    && c > sumTwoSides(b, c)
            ) {
                System.out.println("a, b, c can generate a triangle");
                System.out.println("Perimeter of triangle is: " + (a + b + c));
                System.out.println("Area  of triangle is: " + (a * altitudeTriangle(a, b, c)) / 2);
            }
            else {
                System.out.println("a, b, c can not generate a triangle");
            }

        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }

    }

    //sum of 2 sides
    static double sumTwoSides(double firstSide, double secondSide) {
        return firstSide + secondSide;
    }

    //altitude of a triangle
    static double altitudeTriangle(double firstSide, double secondSide, double thirdSide) {
        double halfPerimeter = (firstSide + secondSide + thirdSide) / 2;
        return 2 / firstSide *
                (Math.sqrt(
                        halfPerimeter * (halfPerimeter - firstSide)
                                * (halfPerimeter - secondSide)
                                * (halfPerimeter - thirdSide)));
    }
}
