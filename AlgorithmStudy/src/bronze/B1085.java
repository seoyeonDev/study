package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        if (1 > w || 1 > h || h > 1000 || w > 1000 || 1 > x || x > w - 1 || 1 > y || y > h - 1) return;

        int xline = Math.min(Math.abs(x - w), Math.abs(x));
        int yline = Math.min(Math.abs(y - h), Math.abs(y));

        System.out.println(Math.min(xline, yline));

    }
}
