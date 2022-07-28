package lab06.part2;

import java.util.Scanner;

public class Homework8And9And10 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào độ dài mảng");
            int n = scanner.nextInt();

            int array[] = new int[n];
            System.out.println("Nhập vào giá trị " + n + " phần tử của mảng");

            for (int i = 0; i < array.length; i++) {
                System.out.print("Giá trị thứ " + (i + 1) + " là: ");
                int inputArray = scanner.nextInt();
                array[i] = inputArray;
            }
            //output
//            System.out.println("Sắp xếp mảng tăng dần bằng thuật toán Chọn trực tiếp");
//            selectionSort(array);

//            System.out.println("Sắp xếp mảng tăng dần bằng thuật toán sắp xếp nổi bọt");
//            bubbleSort(array);

            System.out.println("Sắp xếp mảng tăng dần bằng thuật toán sắp xếp chèn");
            insertionSort(array);

            System.out.println("hiển thị mảng đã sắp xếp ra màn hình");
            display(array);

        } catch (Exception e) {
            System.out.println("Error!!, Please contact CMC GLOBAL for more information");
            System.out.println("Dev message: " + e);
        }
    }

    /**
     * Thuật toán sắp xếp lựa chọn trực tiếp
     *
     * @param arr: mảng cần sắp xếp
     */
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx]) min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Thuật toán nổi bọt
     *
     * @param arr: mảng cần được sắp xếp
     */
    public static void bubbleSort(int arr[]) {
        int temp;
        int i, j;

        boolean swapped = false;

        // lap qua tat ca cac so
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;

            // vong lap thu hai
            for (j = 0; j < arr.length - 1 - i; j++) {
                // kiem xa xem so ke tiep co nho hon so hien tai hay khong
                // trao doi cac so.
                // (Muc dich: lam noi bot (bubble) so lon nhat)
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                } else {
                }
            }

            // neu khong can trao doi nua, tuc la
            // mang da duoc sap xep va thoat khoi vong lap.
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * thuật toán Chèn
     * @param arr: mảng cần sắp xếp
     */
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /**
     * Hiển thị mảng dữ liệu các số nguyên
     * @param arr: mảng cần hiển thị
     */
    public static void display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
