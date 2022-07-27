package lab05.part2.thailand;

import lab05.part2.product.Product;

public class ThaiLandImportPrice extends Product {
    private float taxImported;
    private float importPriceSupport;

    public ThaiLandImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported, float importPriceSupport) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    public ThaiLandImportPrice(float taxImported, float importPriceSupport) {
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    public ThaiLandImportPrice() {

    }

    @Override
    public float calculateSalePrice() {
        double sale_price = 0d;
        double imported_price = 0d;


        sale_price = imported_price
                + taxImported * imported_price
                - importPriceSupport * imported_price
                + 0.1 * (imported_price + taxImported * imported_price - importPriceSupport * imported_price);
        return (float) sale_price;
    }

    @Override
    public void input() {
        System.out.println("Nhập vào thuế nhập khẩu Thái Lan");
        taxImported = scanner.nextFloat();

        System.out.println("Nhập vào giá hỗ trợ nhập khẩu");
        importPriceSupport = scanner.nextFloat();
    }

    @Override
    public void display() {
        System.out.println("\"ThaiLandImportPrice{\" +\n" +
                "                \"taxImported=\" + taxImported +\n" +
                "                \", importPriceSupport=\" + importPriceSupport +\n" +
                "                \", scanner=\" + scanner +\n" +
                "                '}'");
    }


    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    public float getImportPriceSupport() {
        return importPriceSupport;
    }

    public void setImportPriceSupport(float importPriceSupport) {
        this.importPriceSupport = importPriceSupport;
    }

    @Override
    public String toString() {
        return "ThaiLandImportPrice{" +
                "taxImported=" + taxImported +
                ", importPriceSupport=" + importPriceSupport +
                ", scanner=" + scanner +
                '}';
    }
}
