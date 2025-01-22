package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String a = br.readLine();
        st = new StringTokenizer(a);
        int n = Integer.parseInt(st.nextToken());
        int[] N = new int[n];
        int M = Integer.parseInt(st.nextToken());

        if (n < 1 || n > 100 || M < 1 || M > 100) return;

        for (int c = 0; c < M; c++) {
            String b = br.readLine();
            st = new StringTokenizer(b);
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if (1 > i || i > j || j > n || 1 > k || k > n) return;

            for (int d = i; d < j + 1; d++){
                N[d - 1] = k;
            }

        }
        for (int i : N) {
            System.out.print(i + " ");
        }

    }

}
