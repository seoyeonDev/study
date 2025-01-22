package AlgorithmStudy.src.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class B10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        // 1 2, 3 4 의 방식으로 한 줄로 불러옴
        String a = br.readLine();
        // 불러온 한줄을 쪼개 담기
        st = new StringTokenizer(a);

        // 쪼개 담은 토큰끼리 계산
        String c = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()) + "\n";
        bw.write(c);


        bw.flush();
        bw.close();
    }
}
