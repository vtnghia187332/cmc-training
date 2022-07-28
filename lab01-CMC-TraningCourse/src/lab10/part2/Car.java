package lab10.part2;

public class Car implements Icar {
    private String name;

    private String producer;

    private int year;

    private int seat;

    private float rootPrice;

    public Car(String name, String producer, int year, int seat, float rootPrice) {
        this.name = name;
        this.producer = producer;
        this.year = year;
        this.seat = seat;
        this.rootPrice = rootPrice;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public float getRootPrice() {
        return rootPrice;
    }

    public void setRootPrice(float rootPrice) {
        this.rootPrice = rootPrice;
    }

    @Override
    public float calculateTax() {
        if (seat <= 7) {
            return (float) (rootPrice * 0.6);
        } else {
            return (float) (rootPrice * 0.7);
        }
    }

    @Override
    public float calculatePrice() {
        return rootPrice + calculateTax();
    }

    @Override
    public void getInfor() {
        System.out.println("Xe " + name +
                " được sản xuất bởi " + producer +
                " vào năm " + year + " có " + seat +
                " ghế với tổng giá là " + rootPrice + "$. " +
                "Các phần " + calculateTax() + " tương ứng với các thông số ở trên (Ví dụ: Xe Ford được sản xuất bởi Ford vào năm 1997 có 4 ghế với tổng giá là 20000 $).");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                ", seat=" + seat +
                ", rootPrice=" + rootPrice +
                '}';
    }
}
