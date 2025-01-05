package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tmp;

        String b = br.readLine();
        st = new StringTokenizer(b);

        int n = Integer.parseInt(st.nextToken());
        int[] N = new int[n];
        int M = Integer.parseInt(st.nextToken());

        if (n < 1 || n > 100 || M < 1 || M > 100 ) return;

        for (int e = 1; e < N.length + 1; e++){
            N[e - 1] = e;
        }

        for (int d = 0; d < M; d++) {
            String c = br.readLine();
            st = new StringTokenizer(c);

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            if ( 1 > i || i > j || j > n) return;

            tmp = N[i - 1];
            N[i - 1] = N[j - 1];
            N[j - 1] = tmp;
        }

        for (int k : N){
            System.out.print(k + " ");

        }
    }
}
