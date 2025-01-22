package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Integer> cnt = new ArrayList<Integer>();

        String a = br.readLine();
        st = new StringTokenizer(a);

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        String b = br.readLine();
        st = new StringTokenizer(b);

        for (int i = 0; i < N; i++) {
            int c = Integer.parseInt(st.nextToken());
            if (c < 1 || c > 10000) return;
            if (c < X) {
                cnt.add(c);
//                System.out.print(X);
            }
        }
        if (cnt.isEmpty()) return;

        for (int i = 0; i < cnt.size(); i++) {
            System.out.print(cnt.get(i) + " ");
        }


    }
}
