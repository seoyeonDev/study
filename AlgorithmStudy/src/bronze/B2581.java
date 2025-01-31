package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        if (N > 10000 || M > N) return;
        int min = N, sum = 0;


        for (int i = M; i <= N; i++) {  // M ~ N 까지의 수
            for (int j = 2; j <= N; j++) {  // 약수 구하기
                if (i % j == 0 && i != j) { // 약수가 아닐경우 넘기기
                    break;
                } else if (i % j == 0 && i == j) {  // 약수일 경우
                    sum += i;   // sum 추가
                    if (min > i) {  // min 이 i 보다 클 경우
                        min = i;    // i 로 min 설정.
                    }
                }
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
