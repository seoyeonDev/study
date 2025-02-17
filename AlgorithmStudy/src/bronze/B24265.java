package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = BigInteger.valueOf(Integer.parseInt(br.readLine()));

        BigInteger a = n.subtract(BigInteger.valueOf(1));

        // n-1) *
        System.out.println(n.multiply(a).divide(BigInteger.valueOf(2)));
        System.out.println(2);



        /*
        n == 7
        i = 1/ 2, 3, 4, 5, 6, 7,/ 6
        i = 2/ 3, 4, 5, 6, 7/ 5
        i = 3/ 4, 5, 6, 7/ 4
        i = 4/ 5, 6, 7/ 3
        i = 5/ 6, 7/ 2
        i = 6/ 7/ 1
         */
    }
}
