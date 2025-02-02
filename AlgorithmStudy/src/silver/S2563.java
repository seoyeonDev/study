package AlgorithmStudy.src.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N > 100 || N < 1) return;
        int[][] paper = new int[100][100];
        StringTokenizer st;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for (int j = a; j < a + 10; j++) {
                if (a + 10 > 100) return;
                for (int k = b; k < b + 10; k++) {
                    if (b + 10 > 100) return;
                    if (paper[j][k] == 0) paper[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) cnt++;
            }
        }

        System.out.println(cnt);


    }
}
