package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] xy = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                xy[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int tmp;
        boolean chg = true;

        //y 정렬
        while (chg) {
            for (int i = 1; i < N; i++) {
                if (xy[i][1] < xy[i - 1][1]) {
                    tmp = xy[i - 1][1];
                    xy[i - 1][1] = xy[i][1];
                    xy[i][1] = tmp;
                }
            }

        }
    }
}
