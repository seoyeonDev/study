package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = BigInteger.valueOf(Integer.parseInt(br.readLine()));

//        if (1>n ) return;

        BigInteger result = n.add(n.multiply(BigInteger.valueOf(3)));
        System.out.println(result);

    }
}
