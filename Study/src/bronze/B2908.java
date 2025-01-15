package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer st ;

        st = new StringTokenizer(a);
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (b/1000 > 0 || c/1000 > 0 || a.length() != 7 ) return;
        int newb = ((b%10) * 100) + ((b/10)%10) * 10 + b/100 ;
        int newc = ((c%10) * 100) + ((c/10)%10) * 10 + c/100 ;


        int rslt = Math.max(newb,newc);

        System.out.println(rslt);

    }
}
