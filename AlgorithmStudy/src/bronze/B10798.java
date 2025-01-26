package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] ch = new char[5][15];
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {
            String a = br.readLine();
            if (a.length() > 15 || a.isEmpty()) return;
            st = new StringTokenizer(a);
            for (int j = 0; j < a.length(); j++) {
                ch[i][j] = a.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j< 5; j++) {
                if (ch[j][i] != 0) System.out.print(ch[j][i]);
            }
        }
    }
}
