package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String a = A.toUpperCase();
        if (a.length() > 1000000) return;

        int[] chk = new int[26];
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < a.length(); i++) {
            chk[a.charAt(i) - 'A']++;
        }
        for (int i = 0; i < chk.length; i++) {
            if (max < chk[i]) {
                max = chk[i];
                maxIndex = i;
            } else if (max == chk[i]) {
                maxIndex = -2;
            }
        }
        System.out.printf("%s", Character.toString(maxIndex + 'A'));
    }
}
