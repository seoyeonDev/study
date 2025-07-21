package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int rslt = binomial(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        System.out.println(rslt);
    }
    public static int binomial (int n, int k) {
        int a = 1, b = 1, c = 1;
        int num = n;
        while (num > 0) {
            a = a * num;
            num --;
        }
        int knum = k;
        while (knum > 0) {
            b = b * knum;
            knum --;
        }
        int nknum = n - k;
        if (nknum > 0) {
            while (nknum > 0) {
                c = c * nknum;
                nknum --;
            }
        }
        return a / (b * c);
    }
}
