package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        int length = a.length();
        if (a.isEmpty() || a.length() > 100 ) return;

        for (int i=0; i < a.length(); i++){
            if (a.charAt(i) != a.charAt(length - 1)) {
                System.out.println(0);
                return;
            }
            if (a.charAt(i) == a.charAt(length - 1)) {
                if (length -1 == i || length - 1 < i ){
                    System.out.println(1);
                    return;
                }
                length --;

            }
        }
    }
}
