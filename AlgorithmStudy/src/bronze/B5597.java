package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] submit = new int[28];
        int[] all = new int[30];

        for (int i = 0; i < all.length; i++) {
            all[i] = i + 1;
        }

        for (int j = 0; j < 28; j++) {
            int n = Integer.parseInt(br.readLine());
            if (n < 1 || n > 30) return;
            submit[j] = n;
        }

        Arrays.sort(submit);
        Arrays.sort(all);

        for (int i = 1; i < 31; i++){
            int cnt = 0;
            for (int j = 0; j < submit.length; j ++){
                int w = submit[j];
                if (i == w){
                    cnt ++;
                }
            }
            if (cnt == 0){
                System.out.println(i);
            }
        }
    }
}
