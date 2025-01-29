package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer st;
        st = new StringTokenizer(a);

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        double loc = 0;
        int day = 0;
        if (1 > B || B >= A || A > V || V > 1000000000) return;

        loc = V - A;    // 정상까지의 최소 높이
        day = (int) (Math.ceil (loc / (A - B)) + 1);


//        while (loc < V){
//            day ++;
//            loc += A;
//            if (loc >= V) break;
//            loc -= B;
//        }

        System.out.println(day);
    }
}
