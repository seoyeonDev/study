package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());

        long gcdNum = getGCD(num1, num2);
        long rslt = num1 * num2 / gcdNum;
        System.out.println(rslt);
        
    }


    // 최대공약수
    public static long getGCD(long num1, long num2) {
        while (num2 != 0) {
            long temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }

}
