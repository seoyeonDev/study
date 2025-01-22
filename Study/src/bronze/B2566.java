package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[9][9];
        int max = 0;
        int maxX = 0, maxY = 0;

        // 배열 세팅
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int a = Integer.parseInt(st.nextToken());
                if (a > 100 || 0 > a) return;
                arr[i][j] = a;
            }
        }

        // 최댓값 찾는 로직
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    maxX = i;
                    maxY = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((maxX + 1) + " " + (maxY + 1));

    }
}
