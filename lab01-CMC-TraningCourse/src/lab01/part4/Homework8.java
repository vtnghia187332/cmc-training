package lab01.part4;

import java.util.Scanner;

public class Homework8 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            //input first integer number
            System.out.println("Input first integer number");
            int firstNumber = scanner.nextInt();

            //input second integer number
            System.out.println("Input second integer number");
            int secondNumber = scanner.nextInt();

            //input third integer number
            System.out.println("Input second integer number");
            int thirdNumber = scanner.nextInt();

            //define integer number
            InputNumber<Integer> numbers = new InputNumber<>(firstNumber, secondNumber, thirdNumber);



            //return maximum integer number
            int checkNumber = (numbers.getFirstNumber() > numbers.secondNumber) ? numbers.getFirstNumber() : numbers.getSecondNumber();
            int maximumNumber = (numbers.getThirdNumber() > checkNumber) ? numbers.getThirdNumber(): checkNumber;


            System.out.println("maximum number is: " + maximumNumber);
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
        T thirdNumber;

        public InputNumber(T firstNumber, T secondNumber, T thirdNumber) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
            this.thirdNumber = thirdNumber;
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

        public T getThirdNumber() {
            return thirdNumber;
        }

        public void setThirdNumber(T thirdNumber) {
            this.thirdNumber = thirdNumber;
        }
    }
}
