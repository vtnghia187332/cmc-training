package lab05.part2.product;

import java.util.Scanner;

public class Product {
    public Scanner scanner = new Scanner(System.in);

    private String prodId;
    private String prodName;
    private String manufacturer;
    private float producerPrice;

    public Product(String prodId,
                   String prodName,
                   String manufacturer,
                   float producerPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }

    public Product() {
    }

    public void input() {
        System.out.println("Nhập vào Id sản phẩm");
        prodId = scanner.nextLine();

        System.out.println("Nhập vào Tên sản phẩm");
        prodName = scanner.nextLine();

        System.out.println("Nhập vào Nhà cung cấp");
        manufacturer = scanner.nextLine();

        //        clear buffer
        scanner = new Scanner(System.in);

        System.out.println("Nhập vào Lương");
        producerPrice = scanner.nextFloat();
    }

    public void display() {
        System.out.println("Product{" +
                "prodId='" + prodId + '\'' +
                ", prodName='" + prodName + '\'' +
                ", Manufacturer='" + manufacturer + '\'' +
                ", producerPrice=" + producerPrice +
                '}');
    }

    public float calculateSalePrice() {
        double sale_price = 0d;

        sale_price = producerPrice + (0.05 * producerPrice);
        return (float) sale_price;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId='" + prodId + '\'' +
                ", prodName='" + prodName + '\'' +
                ", Manufacturer='" + manufacturer + '\'' +
                ", producerPrice=" + producerPrice +
                '}';
    }
}
