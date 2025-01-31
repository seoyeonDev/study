package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if (a > 100) return;

        String b = br.readLine();
        StringTokenizer st = new StringTokenizer(b);
        int cnt = 0;

        for (int i = 0; i < a; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n > 1000) return;

            for (int j = 2; j < n + 1; j++) {
                if (n % j == 0 && n != j) {
                    break;
                } else if (n % j == 0 && n == j) {
                    cnt++;
                    break;
                }
            }

        }
        System.out.println(cnt);
    }
}
