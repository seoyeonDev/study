package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2903_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Integer.parseInt(br.readLine());
        if (1 > n || n > 15) return;

        double a = Math.pow(2,n) + 1;   // 2의 n 제곱 + 1
        // 2, 3, 5, 9
        //  1,  2, 4,
        System.out.println((int)(Math.pow(a,2)));

    }
}
