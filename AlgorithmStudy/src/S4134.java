package AlgorithmStudy.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long testCase = Long.parseLong((br.readLine()));
        boolean chk = true;

        // 테스트 케이스 개수 반복
        for (int i = 0; i < testCase; i++) {
            long n = Long.parseLong(br.readLine());

            if (n > 2 && n <= 4000000000L) {
                long rslt = getDemical(n);
                System.out.println(rslt);
            } else if (n == 0 || n == 1 || n == 2) {
                System.out.println(2);
            }
        }
    }

    public static long getDemical(long n) {

        // n 보다 큰 수
        while (true) {
            boolean chk = true;

            // 소수 확인
            for (long j = 2; j <= (long) Math.sqrt(n); j ++) {
                if (n % j == 0) { // 나누어 떨어지면 false
                    chk = false;
                    break;
                }
            }
            if (chk) {
               return n;
            }
            n++;
        }
    }

}

