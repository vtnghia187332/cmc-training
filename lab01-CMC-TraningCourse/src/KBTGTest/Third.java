package KBTGTest;

import java.util.ArrayList;
import java.util.List;

public class Third {
    public static void main(String[] args) {
        int[] R = {2, 1, 0, 2};
        int[] C = {0, 2, 1, 2};
        solution(3, R, C);
    }

    public static void solution(int N, int[] R, int[] C) {
        // create matrix N*N
        int matrix = N * N;
        int x = 0;
        int y = 0;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < matrix; i++) {
            //ma trận N*N
            boolean check = false;
            //check tọa độ đang kiểm tra có phải là bomp hay không?
            for (int j = 0; j < R.length; j++) {
                if (R[j] == x && C[j] == y) {
                    result.add("B");
                    check = true;
                }
            }
            //check tọa độ không phải là bomp -> count bomp xung quanh(8 vị trí xung quanh) - loại bỏ vị trí hiện tại đang xét
            if (check == false) {
                int count = 0;
                for (int j = 0; j < R.length; j++) {
                    if (R[j] == x - 1 && C[j] == y - 1) {
                        count++;
                    }
                    if (R[j] == x - 1 && C[j] == y) {
                        count++;
                    }
                    if (R[j] == x - 1 && C[j] == y + 1) {
                        count++;
                    }
                    if (R[j] == x && C[j] == y - 1) {
                        count++;
                    }
                    if (R[j] == x && C[j] == y + 1) {
                        count++;
                    }
                    if (R[j] == x + 1 && C[j] == y - 1) {
                        count++;
                    }
                    if (R[j] == x + 1 && C[j] == y) {
                        count++;
                    }
                    if (R[j] == x + 1 && C[j] == y + 1) {
                        count++;
                    }
                }
                result.add(count + "");
            }
            y++;
            //Xét các tọa độ tiếp theo theo trục tung và hoành
            if (i > 0 && i % N == (N - 1)) {
                y = 0;
                x++;
            }
        }
        for (int i = 0; i < N * N; i++) {
            System.out.print(result.get(i));
            if (i > 0 && i % N == (N - 1)) {
                System.out.println("");
            }
        }
    }


}

