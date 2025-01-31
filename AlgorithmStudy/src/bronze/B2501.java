package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st;
        st = new StringTokenizer(s);

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 0;

        if (N > 10000 || K > N || 1 > N || 1 > K) return;

        for (int i = 1; i < N + 1; i++) {
            if (N % i == 0) {
                cnt++;
                if (cnt == K) {
                    System.out.println(i);
                    break;
                }
            }
        }
        if (cnt < K) {
            System.out.println(0);
        }
    }
}
