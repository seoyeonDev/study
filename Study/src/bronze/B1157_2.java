package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class B1157_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String a = A.toUpperCase();
        if (a.length() > 1000000) return;

        // 알파벳 개수
        int[] chk = new int[26];
        int max = 0;
        int maxIndex = 0;

        // 각 알파벳이 사용된 횟수 기록
        for (int i = 0; i < a.length(); i++) {
            chk[a.charAt(i) - 'A']++;
        }

        // 기록된 횟수로 max 값 구하기
        for (int i = 0; i < chk.length; i++) {
            if (max < chk[i]) {
                max = chk[i];
                maxIndex = i;
            } else if (max == chk[i]) { // max 값과 동일한 값이 있을 경우 확인
                maxIndex = -2;  // ? 출력
            }
        }
        System.out.println(Character.toString(maxIndex + 'A'));
    }
}
