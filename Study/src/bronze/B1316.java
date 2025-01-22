package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class B1316 {

    private static boolean Chk(String a) {
        boolean[] booleans = new boolean[26];
        boolean rtn = true;

        for (int i=0; i<a.length(); i++){
            boolean aBoolean = booleans[a.charAt(i) - 'a'];
            // 이미 기존 값이 true && 이전 글자와 다를 경우
            if (aBoolean && a.charAt(i -1) != a.charAt(i)){
                rtn = false;
            }
            booleans[a.charAt(i) - 'a'] = true;

        }
        return rtn;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N > 100 || 1 > N) return;
        int cnt =0;

        for (int i = 0; i < N; i++) {
            String a = br.readLine();
            if (a.length() > 100 || a.isEmpty()) return ;
            if (Chk(a)){
                cnt ++;
            }
        }
        if (cnt > N) return;

        System.out.println(cnt);

    }
}
