package lab05.part2.vietnam;

import lab05.part2.thailand.ThaiLandImportPrice;

import java.util.*;

public class GeneralManager {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<VietNamImportPrice> vietNamImportPrices = new ArrayList<>();
        List<ThaiLandImportPrice> thaiLandImportPrices = new ArrayList<>();
        int choose;
        Scanner nhap = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("\n======================= MENU =======================\n");
            System.out.println("1. Nhập thông tin cho n sản phẩm được nhập khẩu vào VietNam");
            System.out.println("2. Nhập thông tin cho n sản phẩm được nhập khẩu vào ThaiLand");
            System.out.println("3. Hiển thị tất cả thông tin các sản phẩm ở Việt Nam cũng như ở Thái Lan");
            System.out.println("4. Sắp xếp các sản phẩm tăng dần theo tên sản phẩm và hiển thị danh sách sau khi sắp xếp");
            System.out.println("5. Tính toán giá bán sản phẩm ở Việt Nam và ở Thái Lan sau đó hiển thị danh sách sản phẩm với thông tin và cả giá bán");
            System.out.println("6. Tìm kiếm sản phẩm theo giá bán và hiển thị kết quả tìm kiếm");
            System.out.println("7. Thoát");
            System.out.println("=========== Mời nhập từ 1 --> 7:===========");
            choose = nhap.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("====== Nhập thông tin cho n sản phẩm được nhập khẩu vào VietNam ======== ");
                    quantityProductsImportVietNam(vietNamImportPrices);
                    break;
                case 2:
                    System.out.println("====== Nhập thông tin cho n sản phẩm được nhập khẩu vào ThaiLand ======== ");
                    quantityProductsImportThaiLan(thaiLandImportPrices);
                    break;
                case 3:
                    System.out.println("====== Hiển thị tất cả thông tin các sản phẩm ở Việt Nam cũng như ở Thái Lan ======== ");
                    displayThaiLanAndVietNamProducts(vietNamImportPrices, thaiLandImportPrices);
                    break;
                case 4:
                    System.out.println("====== Sắp xếp các sản phẩm tăng dần theo tên sản phẩm và hiển thị danh sách sau khi sắp xếp ========");
                    sortProductsASC(vietNamImportPrices);
                    break;
                case 5:
                    System.out.println("========== Tính toán giá bán sản phẩm ở Việt Nam và ở Thái Lan sau đó hiển thị danh sách sản phẩm với thông tin và cả giá bán ========");
                    break;
                case 6:
                    System.out.println("========== Tìm kiếm sản phẩm theo giá bán và hiển thị kết quả tìm kiếm ========");
//                    findProductByPrice();
                    break;
                case 7:
                    System.out.println("Goodbye");
                    System.exit(0);
                default:
                    System.out.println("Con lạy thánh, đừng trêu như vậy nữa");
            }
        }
    }

    public static void quantityProductsImportVietNam(List<VietNamImportPrice> vietNamImportPrices) {
        int quantityProduct;
        VietNamImportPrice vietNamImportPrice = new VietNamImportPrice();

        System.out.println("Nhập vào số lượng sản phẩm nhập khẩu vào Việt Nam");
        quantityProduct = scanner.nextInt();
        for (int i = 0; i <= quantityProduct; i++) {
            System.out.println("Lần thứ " + i);
            vietNamImportPrice.input();
        }
    }

    public static void quantityProductsImportThaiLan(List<ThaiLandImportPrice> thaiLandImportPrices) {
        int quantityProduct;
        ThaiLandImportPrice thaiLandImportPrice = new ThaiLandImportPrice();

        System.out.println("Nhập vào số lượng sản phẩm nhập khẩu vào Thái Lan");
        quantityProduct = scanner.nextInt();
        for (int i = 0; i < quantityProduct; i++) {
            thaiLandImportPrice.input();
        }
    }

    public static void displayThaiLanAndVietNamProducts(List<VietNamImportPrice> vietNamImportPrices,
                                                        List<ThaiLandImportPrice> thaiLandImportPrices) {
        for (VietNamImportPrice vietNamImportPrice : vietNamImportPrices
        ) {
            vietNamImportPrice.display();
        }

        for (ThaiLandImportPrice thaiLandImportPrice : thaiLandImportPrices
        ) {
            thaiLandImportPrice.display();
        }
    }

    public static List<VietNamImportPrice> sortProductsASC(List<VietNamImportPrice> vietNamImportPrices) {
        List<String> nameProducts = new ArrayList<>();
        List<VietNamImportPrice> vietNamImportPricesForSort = new ArrayList<>();

        for (VietNamImportPrice vietNamImportPrice : vietNamImportPrices
        ) {
            nameProducts.add(vietNamImportPrice.getProdName());
        }
        //sort
        Collections.sort(nameProducts);

        //duyệt từng phần tử
        Iterator itr = nameProducts.iterator();
        while (itr.hasNext()) {
            //tìm name trong sách
            //add vào danh sách sau khi sắp xếp
            vietNamImportPricesForSort.add(findProductByName(itr.next().toString(), vietNamImportPrices));
        }
        return vietNamImportPricesForSort;
    }

    public static void calPriceProducts(List<VietNamImportPrice> vietNamImportPrices,
                                        List<ThaiLandImportPrice> thaiLandImportPrices) {
        for (VietNamImportPrice vietNamImportPrice : vietNamImportPrices
        ) {
            vietNamImportPrice.calculateSalePrice();
        }

        for (ThaiLandImportPrice thaiLandImportPrice : thaiLandImportPrices
        ) {
            thaiLandImportPrice.calculateSalePrice();
        }

    }

    //find Vietnam product by Price
    public static VietNamImportPrice findProductByPrice(float priceToFind,
                                                        List<VietNamImportPrice> vietNamImportPrices) {
        VietNamImportPrice vietNamImportPriceToGet = new VietNamImportPrice();
        for (VietNamImportPrice vietNamImportPrice : vietNamImportPrices
        ) {
            if (vietNamImportPrice.getProducerPrice() == priceToFind) {
                vietNamImportPriceToGet = vietNamImportPrice;
            }
        }
        return vietNamImportPriceToGet;
    }

    //find Vietnam product by Name
    public static VietNamImportPrice findProductByName(String name,
                                                       List<VietNamImportPrice> vietNamImportPrices) {
        VietNamImportPrice vietNamImportPriceToGet = new VietNamImportPrice();
        for (VietNamImportPrice vietNamImportPrice : vietNamImportPrices
        ) {
            if (vietNamImportPrice.getProdName() == name) {
                vietNamImportPriceToGet = vietNamImportPrice;
            }
        }
        return vietNamImportPriceToGet;
    }

}
