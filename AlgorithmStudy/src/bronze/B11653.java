package AlgorithmStudy.src.bronze;

import java.io.*;

public class B11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        if (1 > N || N > 10000000) return;

        while (N > 1) { // N 이 1 이상일때까지 반복
            for (int i = 2; i <= N; i++) {  // 소인수분해 할 숫자 찾기
                if (N % i == 0) {   // 소인수분해 될 경우
                    N = N / i;      // 소인수분해 후
                    bw.write(Integer.toString(i) + "\n");   // 소인수분해 한 숫자 출력
                    break;  // 반복문 탈출
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
