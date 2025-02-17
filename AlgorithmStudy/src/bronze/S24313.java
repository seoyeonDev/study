package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class S24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BigInteger n = BigInteger.valueOf(Integer.parseInt(br.readLine()));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if (1 > c || c > 100 || 1 > n || n > 100 ||
                0 > Math.abs(a1) || Math.abs(a1) > 100 || 0> Math.abs(a0) || Math.abs(a0) > 100) return;

        if ((a1 * n + a0) <= (c * n) && a1 <= c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
