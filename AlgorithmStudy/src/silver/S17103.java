package AlgorithmStudy.src.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long testCase = Integer.parseInt(br.readLine());
        if (1 > testCase || testCase > 100) return;

        // 소수 판별 체 만들기
        boolean[] list = isPrime();

        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            if (2 >= n || n > 1000000) return;
            addPrime(n, list);
        }
    }

    // 에라스토테네스의 체
    /*
    1. n 보다 작은 수의 소수 구하기
    2. 소수끼리 합이 n 인 것 구하기
     */
    public static boolean[] isPrime() {
        boolean[] list = new boolean[1000001];

        list[0] = true;
        list[1] = true;

        // 소수 구하기
        for (int i = 2; i * i <= list.length - 1; i++) {
            if (!list[i]) {
                for (int j = i * i; j <= list.length - 1; j += i) {
                    list[j] = true;
                }
            }
        }

        return list;
    }

    public static void addPrime(int n, boolean[] list) {
        int cnt = 0;
        // 소수끼리 합 구하기
        for (int i = 2; i <= n / 2; i++) {
            if (!list[i] && !list[n - i]) {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
