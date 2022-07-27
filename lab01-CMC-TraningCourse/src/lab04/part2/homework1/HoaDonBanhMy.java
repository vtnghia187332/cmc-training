package lab04.part2.homework1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HoaDonBanhMy {
    public Scanner scanner = new Scanner(System.in);
    private String InvoiceId;
    private Date StartInvoice;
    private String InvoiceCode;
    private String CustomerName;
    private String CustomerAddress;
    private int QuantityBreadDelivery;
    private Double PriceOneBread;
    private Double PriceAllBreads;
    private Double PromotionalPrice;
    private Double PricePayUp;


    public HoaDonBanhMy() {
    }

    public HoaDonBanhMy(String invoiceId, Date startInvoice, String invoiceCode, String customerName, String customerAddress, int quantityBreadDelivery, Double priceOneBread, Double priceAllBreads, Double promotionalPrice, Double pricePayUp) {
        InvoiceId = invoiceId;
        StartInvoice = startInvoice;
        InvoiceCode = invoiceCode;
        CustomerName = customerName;
        CustomerAddress = customerAddress;
        QuantityBreadDelivery = quantityBreadDelivery;
        PriceOneBread = priceOneBread;
        PriceAllBreads = priceAllBreads;
        PromotionalPrice = promotionalPrice;
        PricePayUp = pricePayUp;
    }

    public void tinhTienKmai() {
        try {
            if (QuantityBreadDelivery >= 10) {
//            Nếu mua >=10 cái : giá mỗi cái bánh sẽ giảm đi 10%
                PriceOneBread *= 0.1;
                System.out.println("Price of one bread is: " + (PriceOneBread *= 0.1));
            } else {
//            Nếu mua >=100 : giá tổng hóa đơn giảm đi 20% (Không giảm giá bánh nữa)
                PriceOneBread *= 1;
                PricePayUp *= 0.2;
                System.out.println("Price pay up of invoice: " + (PricePayUp *= 0.2));
            }
        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }

    public void inputBreadInvoice() throws ParseException {
        System.out.println("Nhập vào Id hóa đơn:");
        InvoiceId = scanner.nextLine();

        System.out.println("Nhập vào mã hóa đơn:");
        InvoiceCode = scanner.nextLine();

        System.out.println("Nhập vào Ngày lập hóa đơn");
        String startDateInvoice = scanner.nextLine();

        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        StartInvoice = DateFor.parse(startDateInvoice);


        System.out.println("Nhập vào Tên Khách hàng:");
        CustomerName = scanner.nextLine();

        System.out.println("Nhập vào Địa chỉ khách (Địa chỉ giao hàng)");
        CustomerAddress = scanner.nextLine();

        //clear buffer
        scanner = new Scanner(System.in);

        System.out.println("Nhập vào Số lượng bánh cần giao");
        QuantityBreadDelivery = scanner.nextInt();

        System.out.println("Nhập vào Giá bán 1 chiếc bánh");
        PriceOneBread = scanner.nextDouble();

        System.out.println("Nhập vào Tổng tiền hàng");
        PriceAllBreads = scanner.nextDouble();

        System.out.println("Nhập vào Tiền khuyến mãi");
        PromotionalPrice = scanner.nextDouble();

        System.out.println("Nhập vào Tổng tiền phải thanh toán");
        PricePayUp = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return "Hóa đơn gồm: \n{" + "Id hóa đơn='" + InvoiceId + '\'' + ", Ngày lập hóa đơn=" + StartInvoice + '\'' + ", Mã hóa đơn='" + InvoiceCode + '\'' + ", Tên Khách hàng='" + CustomerName + '\'' + ", Địa chỉ khách (Địa chỉ giao hàng)='" + CustomerAddress + '\'' + ", Số lượng bánh cần giao=" + QuantityBreadDelivery + ", Giá bán 1 chiếc bánh=" + PriceOneBread + ", Tổng tiền hàng=" + PriceAllBreads + ", Tiền khuyến mãi=" + PromotionalPrice + ", Tổng tiền phải thanh toán=" + PricePayUp + '}';
    }
}
