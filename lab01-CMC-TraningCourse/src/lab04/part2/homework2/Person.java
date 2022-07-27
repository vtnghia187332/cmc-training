package lab04.part2.homework2;

import java.util.Scanner;

public class Person {
    public Scanner scanner = new Scanner(System.in);

    private String name;

    private String address;

    private double salary;

    public Person(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Person() {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void input() {
        System.out.println("Nhập vào Tên");
        name = scanner.nextLine();

        System.out.println("Nhập vào Địa chỉ");
        address = scanner.nextLine();

        //        clear buffer
        scanner = new Scanner(System.in);

        System.out.println("Nhập vào Lương");
        salary = scanner.nextDouble();
    }

    public void display() {
        System.out.println("Person{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", salary=" + salary + '}');
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", salary=" + salary + '}';
    }
}
