package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        if (1 > T || T > 1000) return;

        for (int i = 0; i < T; i++) {
            String c = br.readLine();
            st = new StringTokenizer(c);

            int b = Integer.parseInt(st.nextToken());
            if (b < 1 || b > 8) return;
            String S = st.nextToken();
            if (S.length() < 1 || S.length() > 20) return;

            for (int j = 0; j < S.length(); j++) {
                for (int p = 0; p < b; p++) {
                    char a = S.charAt(j);
//                    if (!Character.isDigit(a) && !Character.isAlphabetic(a)) return;
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
