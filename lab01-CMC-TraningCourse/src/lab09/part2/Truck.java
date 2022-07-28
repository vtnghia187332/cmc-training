package lab09.part2;

public class Truck extends Vehicles {
    private int truckload;

    public Truck(String maker, String model, double price, int truckload) {
        super(maker, model, price);
        this.truckload = truckload;
    }

    public Truck(int truckload) {
        this.truckload = truckload;
    }
    public Truck() {
    }

    public int getTruckload() {
        return truckload;
    }

    public void setTruckload(int truckload) {
        this.truckload = truckload;
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
