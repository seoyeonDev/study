package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        if (S.length() > 100) return;
        int j ;
        boolean tf = false;

        for (int i = 97; i < 123; i++) {
            for (j = 0; j < S.length(); j++) {
                char ch = S.charAt(j);
                int num = (int)ch;
                if (i == num) {
                    System.out.print(S.indexOf(ch) + " ");
                    tf = true;
                    break;
                }
            }
            if (!tf){
                System.out.print(-1 + " ");
            }
            tf = false;
        }
    }
}
