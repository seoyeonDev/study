package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        if (1 > T || T > 10) return;

        for (int i = 0; i<T; i++){
            String a = br.readLine();
            if (a.length() > 1000) return;
            System.out.print(a.charAt(0));
            System.out.print(a.charAt(a.length() - 1));
            System.out.println();
        }
    }
}
