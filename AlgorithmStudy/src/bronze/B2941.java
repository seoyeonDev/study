package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String a = br.readLine();
        st = new StringTokenizer(a);

        int len = a.length();
        if (len > 100) return;
        int cnt = 0;

        for (int i = 0; i < len; i++) {
            if (a.charAt(i) == 'c') {
                if (a.charAt(i + 1) == '=' || a.charAt(i + 1) == '-') {
                    i++;
                    cnt++;
                } else {
                    cnt++;
                }
            } else if (a.charAt(i) == 'd') {
                if (i != len - 1) {
                    if (a.charAt(i + 1) == 'z' && a.charAt(i + 2) == '=') {
                        i++;
                        i++;
                        cnt++;
                    } else if (a.charAt(i + 1) == '-') {
                        i++;
                        cnt++;
                    } else {
                        cnt++;
                    }
                } else {
                    cnt++;
                }
            } else if (a.charAt(i) == 'l' && a.charAt(i + 1) == 'j') {
                i++;
                cnt++;
            } else if (a.charAt(i) == 'n' && a.charAt(i + 1) == 'j') {
                i++;
                cnt++;
            } else if ((a.charAt(i) == 's' || a.charAt(i) == 'z') && a.charAt(i + 1) == '=') {
                i++;
                cnt++;
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
