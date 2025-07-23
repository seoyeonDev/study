package AlgorithmStudy.src.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class S1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger n = BigInteger.valueOf(Long.parseLong(st.nextToken()));
            BigInteger m = BigInteger.valueOf(Long.parseLong(st.nextToken()));

            BigInteger a = m.subtract(n);
            BigInteger result = factorial(m).divide(factorial(n).multiply(factorial(a)));
            System.out.println(result);
        }

    }

    public static BigInteger factorial(BigInteger a) {
        if (a.compareTo(BigInteger.ONE) <= 0) {
            return BigInteger.ONE;
        }
        return a.multiply(factorial(a.subtract(BigInteger.ONE)));

    }
}
