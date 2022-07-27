package lab05.part2.vietnam;

import lab05.part2.product.Product;

import java.util.Scanner;

public class VietNamImportPrice extends Product {
    public Scanner scanner = new Scanner(System.in);
    private float taxImported;

    public VietNamImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
    }

    public VietNamImportPrice(float taxImported) {
        this.taxImported = taxImported;
    }

    public VietNamImportPrice() {
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    @Override
    public float calculateSalePrice() {
        double sale_price = 0d;
        double imported_price = 0d;
        double tax_price = 0d;

        sale_price = imported_price + taxImported * imported_price + 0.1 * (imported_price + taxImported * imported_price) + taxImported + 0.05 * (imported_price + tax_price);
        return (float) sale_price;
    }

    @Override
    public void input() {
        System.out.println("Nhập vào thuế nhập khẩu Việt Nam");
        taxImported = scanner.nextFloat();
    }

    @Override
    public void display() {
        System.out.println("VietNamImportPrice{" +
                "scanner=" + scanner +
                ", taxImported=" + taxImported +
                ", scanner=" + scanner +
                '}');
    }

    @Override
    public String toString() {
        return "VietNamImportPrice{" +
                "scanner=" + scanner +
                ", taxImported=" + taxImported +
                ", scanner=" + scanner +
                '}';
    }
}
