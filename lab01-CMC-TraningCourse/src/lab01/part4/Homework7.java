package lab01.part4;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Homework7 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //input first integer number
            System.out.println("Input first integer number");
            int firstNumber = scanner.nextInt();

            //input second integer number
            System.out.println("Input second integer number");
            int secondNumber = scanner.nextInt();


            //define integer number
            InputNumber<Integer> numbers = new InputNumber<>(firstNumber, secondNumber);


            int maximumNumber;
            int minumumNumber;

            //check max and min number
            if (numbers.getFirstNumber() > numbers.getSecondNumber()) {
                maximumNumber = numbers.getFirstNumber();
                minumumNumber = numbers.getSecondNumber();
            } else {
                minumumNumber = numbers.getFirstNumber();
                maximumNumber = numbers.getSecondNumber();
            }

            //output
            System.out.println("Maximum number is: "+maximumNumber);
            System.out.println("Mininum number is: "+minumumNumber);


        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }

    /**
     * define numbers
     *
     * @param <T>
     */
    static class InputNumber<T extends Number> {
        T firstNumber;
        T secondNumber;

        public InputNumber(T firstNumber, T secondNumber) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }


        public T getFirstNumber() {
            return firstNumber;
        }

        public void setFirstNumber(T firstNumber) {
            this.firstNumber = firstNumber;
        }

        public T getSecondNumber() {
            return secondNumber;
        }

        public void setSecondNumber(T secondNumber) {
            this.secondNumber = secondNumber;
        }
    }
}
