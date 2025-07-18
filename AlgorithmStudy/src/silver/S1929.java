package AlgorithmStudy.src.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        getPrime(m, n);
    }

    public static void getPrime(int m, int n) {
        boolean[] list = new boolean[n + 1];

        list[0] = true; // 소수가 아님
        list[1] = true;

        // 소수 찾기, 배수 체크
        for (int j = 2; j * j <= n ; j++) {  // 최대값의 제곱근까지 돌며 아직 지워지지 않은 소수 찾기.
            if (!list[j]) { // j 값일 때 다른 수의 배수로서 지워지지 않았다면 j는 소수.
                for (int i = j * j; i <= n; i += j) {   // j의 배수 삭제 (j 배수 부터 시작, i 에 j를 더해가면서 배수 삭제)
                    list[i] = true;
                }
            }
        }

        // 결과 출력
        for (int i = m ; i <= n ; i++) {
            if (!list[i]) {
                System.out.println(i);
            }
        }
    }
}
