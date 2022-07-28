package lab10.part2;

public class LuxuryCar extends Car {
    private float specialRate;

    public LuxuryCar(String name, String producer, int year, int seat, float rootPrice, float specialRate) {
        super(name, producer, year, seat, rootPrice);
        this.specialRate = specialRate;
    }

    public LuxuryCar() {
    }

    public LuxuryCar(float specialRate) {
        this.specialRate = specialRate;
    }

    public float getSpecialRate() {
        return specialRate;
    }

    public void setSpecialRate(float specialRate) {
        this.specialRate = specialRate;
    }

    @Override
    public String toString() {
        return "LuxuryCar{" +
                "specialRate=" + specialRate +
                '}';
    }

    @Override
    public float calculatePrice() {
        //RootPrice + thuế + RootPrice * specialRate
        return getRootPrice() + calculateTax() + getRootPrice() * specialRate;
    }

    public float calculatePrice(float transportCost) {
//        Tổng giá = RootPrice + thuế + RootPrice * specialRate + transportCost.
        return getRootPrice() + calculateTax() * specialRate + transportCost;
    }
}
