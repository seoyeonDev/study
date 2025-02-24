package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (3 > N || N > 100 || 10 > M || M > 300000) return;

        st = new StringTokenizer(br.readLine());
        int[] card = new int[N];

        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
            if (card[i] > 100000) return;
        }
        int sum = 0;
        int chk = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int k = i + 1; k < N - 1; k++) {
                for (int q = k + 1; q < N; q++) {
                    chk = card[i] + card[k] + card[q];
                    if (chk > sum && chk <= M) sum = chk;
                }
            }
        }

        System.out.println(sum);
    }
}
