package Study.src.bronze;

import java.io.*;

public class B18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String y = String.valueOf(Integer.parseInt(br.readLine()) - 543);

        bw.write(y);

        bw.flush();
        bw.close();

    }
}
