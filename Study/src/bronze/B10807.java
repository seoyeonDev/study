package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = 0;

        // 총 N 개의 정수
        int n = Integer.parseInt(br.readLine());

        String a = br.readLine();
        int v = Integer.parseInt(br.readLine());

        if (v < -100 || v > 100 ) return;

        st = new StringTokenizer(a);

        for (int i = 0; i < n; i++) {
            int b = Integer.parseInt(st.nextToken());

            if (b < -100 || b > 100 ) return;

            if (b == v){
                cnt ++;
            }
        }
        System.out.println(cnt);

    }
}
