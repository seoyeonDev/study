package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class B5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            String a = br.readLine();
            st = new StringTokenizer(a);
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if (d == 0 && b == 0 && c == 0) {
                break;
            }
            if (b > 1000 || c > 1000 || d > 1000) return;

            int sum = b + c + d;
            int max = Math.max(Math.max(b, c), d);

            if (!(max < (sum - max))) {
                System.out.println("Invalid");
            } else {
                if (b == c && d == c) {
                    System.out.println("Equilateral");
                } else if (b == c || d == c || b == d) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }

        }
    }
}
