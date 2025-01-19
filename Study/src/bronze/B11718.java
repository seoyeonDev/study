package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 100; i++){
            String a = br.readLine();
            if (a == null) return;
            if (a.length()>100) return;
            if (!a.matches("^[a-zA-Z0-9 ]*$")) return;
            System.out.println(a);
        }
    }
}
