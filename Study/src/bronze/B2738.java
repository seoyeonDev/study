package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (N > 100 || M > 100) return;

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];
        int[][] rslt = new int[N][M];

        makeArr(br, N, M, arr1);
        makeArr(br, N, M, arr2);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                rslt[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(rslt[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void makeArr(BufferedReader br, int n, int m, int[][] arr) throws IOException {
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            String b = br.readLine();
            st = new StringTokenizer(b);
            for (int j = 0; j < m; j++) {
                int value = Integer.parseInt(st.nextToken());
                if (value > 100) return;
                arr[i][j] = value;
            }
        }
    }
}
