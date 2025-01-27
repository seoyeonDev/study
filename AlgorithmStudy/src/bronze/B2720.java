package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a < 1 || a > 500) return;
            int Q = (a / 25);
            int D = (a % 25) / 10;
            int N = ((a % 25) % 10) / 5;
            int P = (((a % 25) % 10) % 5);
            System.out.println(Q + " " + D + " " + N + " " + P);
        }
    }
}
