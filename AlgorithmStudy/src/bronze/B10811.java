package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String first = br.readLine();
        st = new StringTokenizer(first);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if ( 1 > N || N > 100 || 1 > M || M > 100) return;
        int[] a = new int[N];

        // 바구니 초기화
        for (int i = 0; i < N ; i++) {
            a[i] = i + 1;
        }

        for (int k = 0; k < M; k++){
            String b = br.readLine();
            st = new StringTokenizer(b);

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int tmp;

            if (1 > i || i > j || j > N) return;

            // i ~ j 까지 돌기
            for (int q = i ; q <= j; q++){
                if ( i > j) return;
                tmp = a[i - 1];
                a[i - 1] = a[j - 1];
                a[j - 1] = tmp;
                j --;
                i ++;

            }
//
//            tmp = a[j];
//            a[j] = a[i];
//            a[--j] = a[i++];
//
//
//
//            for (int t = j; ){
//
//            }
//            tmp = a[i];
//            a[i] = a[j];
        }

        for (int i=0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
