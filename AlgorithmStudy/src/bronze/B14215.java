package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (1 > a || 1 > b || 1 > c || a > 1000 || b > 1000 || c > 1000) return;

        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;
        int maxMsum = sum - max;

        if (!(max < maxMsum)) {
            max = maxMsum - 1;
            System.out.println(max + maxMsum);
        } else {
            System.out.println(sum);
        }
    }
}
