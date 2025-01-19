package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908_new {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        System.out.println(Math.max(num1,num2));
    }
}
