package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] result = new int[1000];
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int A = Integer.parseInt(br.readLine());
            if (A > 1000 || A < 0) return;
            result[A % 42] ++;
        }

        for (int i =0; i < 1000 ; i++){
            if (result[i] > 0){
                cnt ++;
            }
        }
        System.out.println(cnt);

    }
}
