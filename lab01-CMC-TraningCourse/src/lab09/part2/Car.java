package lab09.part2;

public class Car extends Vehicles {
    private String color;

    public Car(String maker, String model, double price, String color) {
        super(maker, model, price);
        this.color = color;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void input() {
        super.input();
    }

    @Override
    public void display() {
        super.display();
    }
}
