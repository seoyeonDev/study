package AlgorithmStudy.src.bronze;

import java.io.*;

public class B2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());

        if (year < 0 || year > 4000) return;

        int a = year % 4 ;  // 0
        int b = year % 100; // not 0
        int c = year % 400; // 0

        if (a == 0 && (!(b == 0) || c == 0)){   // 윤년일 때
            bw.write('1');
        } else {
            bw.write('0');
        }

        bw.flush();
        bw.close();

    }
}
