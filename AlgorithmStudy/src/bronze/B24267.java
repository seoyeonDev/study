package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.Buffer;

public class B24267 {
    public static void main(String[] args) throws IOException {
        /*
        n = 7
        i = 1/ j 2/ 3, 4, 5, 6, 7   /5
               j 3/ 4, 5, 6, 7  /4
               j 4/ 5, 6, 7     /3
               j 5/ 6, 7        /2
               j 6/ 7           /1

        i = 2/ j 3/ 4, 5, 6, 7  /4
               j 4/ 5, 6, 7     /3
               j 5/ 6, 7        /2
               j 6/ 7           /1

        i = 3/ j 4/ 5, 6, 7     /3
               j 5/ 6, 7        /2
               j 6/ 7           /1

        i = 4/ j 5/ 6, 7
               j 6/ 7

        i = 5/ j 6/ 7
         */
        // n* (n-1) * (n-2) /6

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = BigInteger.valueOf(Integer.parseInt(br.readLine()));

        System.out.println(n.multiply(n.subtract(BigInteger.valueOf(1))).multiply(n.subtract(BigInteger.valueOf(2))).divide(BigInteger.valueOf(6)));
        System.out.println(3);

    }
}
