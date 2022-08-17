package kpmg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        int[] A = {1, 3, 6, 1, 6, 6, 9, 9};
        int[] B = {5, 1, 4, 3,5};
        int[] C = {2,2,2,3,2,3};
        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
    }

    public static int solution(int[] A) {
        int[] B = null;
        ArrayList<Integer> resultOfSumArray = new ArrayList<>();
        int sum = 0;
        //Liệt kê hết tất cả các subarray có 2 phần tử đầu và phần tử cuối trùng nhau
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    //tìm ra mảng phần tử đầu cuối trùng nhau
                    B = Arrays.copyOfRange(A, i, (j + 1));
                    //tính tổng mảng đó
                    for (int k = 0; k < B.length; k++) {
                        sum += B[k];
                    }
                    //Thêm vào mảng các giá trị của tổng từng subarray
                    resultOfSumArray.add(sum);
                    //reset value
                    sum = 0;
                    B = null;
                }
            }
        }
        //Nếu mảng rỗng, return -1
        if (A.length <= 0) {
            return -1;
        } else {
            //tìm max của mảng các tổng của từng subarray - có phần từ đầu-cuối trùng nhau
            return Collections.max(resultOfSumArray);
        }
    }
}
