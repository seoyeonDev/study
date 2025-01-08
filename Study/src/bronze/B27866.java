package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        String S = br.readLine();
        st = new StringTokenizer(S);

//        int i = Integer.parseInt(br.readLine());
        int i = br.read();
        if ( 1 > i || i > S.length() || S.length() > 1000) return;

        System.out.println(S.charAt(i - 1));


    }
}
