package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3003_new {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] chess = new int[6];
        int[] set = new int[]{1, 1, 2, 2, 2, 8};

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            chess[i] = Integer.parseInt(st.nextToken());
        }

        for (int piece : chess) {
            if (piece < 0 || piece > 10) {
                return;
            }
        }

        for (int i = 0; i < 6; i++) {
            if (chess[i] != set[i]) {
                System.out.print(set[i] - chess[i] + " ");
            } else {
                System.out.print(0 + " ");
            }
        }

    }
}
