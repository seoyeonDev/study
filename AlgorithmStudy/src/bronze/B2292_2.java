package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2292_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (1 > n || n > 1000000000) return;
        int N = 6;  // 1층부터 방 개수 계산
        int cnt = 1;    // 중앙방 포함하여 시작

        if (n == 1) {
            System.out.println(1);
            return;
        }

        // 6 12 18 24 30
        while (n > 1) {
            n -= N;     // 층이 높아질수록 들어가는 방 개수 제외
            N += 6;     // 층이 높아질수록 방 개수 6배씩 증가
            cnt++;      // 층
        }

        System.out.println(cnt);
    }
}
