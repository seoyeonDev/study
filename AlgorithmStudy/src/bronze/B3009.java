package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] point = new int[3][2];
        StringTokenizer st;

        for (int i = 0; i < 3; i++) {
            String a = br.readLine();
            st = new StringTokenizer(a);
            for (int j = 0; j < 2; j++) {
                int n = Integer.parseInt(st.nextToken());
                point[i][j] = n;
                if (1 > point[i][j] || point[i][j] > 1000) return;
            }
        }

        for (int i = 0; i < 2; i++) {

            int b = 0, c = 0, d = 0;

//            for (int j = 0; j < 3; j++) {
            b = point[0][i];
            c = point[1][i];
            d = point[2][i];

            if (b == c) {
                System.out.print(d + " ");
            } else if (c == d) {
                System.out.print(b + " ");
            } else if (b == d) {
                System.out.print(c + " ");
            }
//            }
        }


    }
}
