package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        if (N > 1000) return;
        int[] score = new int[N];
        double[] newScore = new double[N];

        String a = br.readLine();
        double sum = 0;
        st = new StringTokenizer(a);

        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            if (score[i] < 0 || score[i] > 100) return; // 성적은 100보다 작거나 음이 아닌 정수
        }


        // 최댓값 M 구하기
        int M = score[0];
        for (int i = 0; i < N; i++) {
            M = Math.max(M, score[i]);
        }
        if (M == 0) return; // 적어도 하나의 값은 0보다 크다.

        // 점수 조작하기
        for (int i = 0; i < N; i++) {
            newScore[i] = ((double) score[i] / M * 100);
        }

        for (int i = 0; i < N; i++) {
            sum += newScore[i];
        }

        System.out.println(sum / N);

    }
}
