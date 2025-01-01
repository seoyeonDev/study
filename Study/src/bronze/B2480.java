package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));

        String line = bw.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int value = 0;
        boolean tf = true;

        if (a > 6 || b > 6 || c > 6) return;
        if (a < 1 || b < 1 || c < 1) return;

        boolean ab = (a == b);
        boolean bc = (b == c);
        boolean ac = (a == c);

        if (ab) {
            cnt++;
            value = a;
        }
        if (bc) {
            cnt++;
            value = b;
        }
        if (ac) {
            cnt++;
            value = c;
        }

        if (cnt == 3) {
            System.out.println(10000 + (a * 1000));
        } else if (cnt > 0 && cnt < 3) {
            System.out.println(1000 + value * 100);
        } else if (cnt == 0) {
            System.out.println(Math.max(a, Math.max(b, c)) * 100);
        }
    }
}
