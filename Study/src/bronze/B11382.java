package Study.src.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class B11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String a = br.readLine();
        st = new StringTokenizer(a);

        String R = (Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken()) + "\n");
        bw.write(R);

        bw.flush();
        bw.close();

    }
}
