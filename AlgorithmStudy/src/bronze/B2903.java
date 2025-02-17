package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (1 > N || N > 15) return;

        int cnt = 0;
        cnt = (int) Math.pow((Math.pow(2,N) + 1),2);

        System.out.println(cnt);
    }
}
