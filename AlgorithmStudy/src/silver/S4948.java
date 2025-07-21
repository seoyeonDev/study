package AlgorithmStudy.src.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1;
        while (n != 0) {
            n = Integer.parseInt(br.readLine());
            if (n != 0) {
                isPrime(n);
            }
        }
    }

    public static void isPrime(int n) {
        boolean[] list = new boolean[2 * n + 1];
        int cnt = 0;

        list[0] = true;     // 소수 아님
        list[1] = true;

        for (int i = 2; i * i<= 2 * n; i++) {
            if (!list[i]) {
                for (int j = i * i; j <= 2 * n; j += i) {
                    list[j] = true;
                }
            }
        }

        for (int i = n + 1; i <= 2 * n; i++) {
            if (!list[i]) {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
