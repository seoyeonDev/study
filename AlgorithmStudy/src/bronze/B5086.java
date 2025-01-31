package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            String N = br.readLine();
            st = new StringTokenizer(N);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) break;
            if (a > 10000 || a < 1 || b < 1 ||  b > 10000) return;

            if (a % b == 0) {
                System.out.println("multiple");
            } else if (b % a == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
    }
}
