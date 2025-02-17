package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        1 5 15 31 53
//        1 4 13 28 49
//        1 2 9  22 41
//          1 2  3  4
//          2 4  6  8
        int N = Integer.parseInt(br.readLine());
        int box = 1;
        int cnt = 1;

        /*
        1
        1 + 6 * 1 = 7
        7 + 6 * 2 = 19
        19 + 6 * 3 = 37
        첫 번째 칸에서는 7까지, 두번째 칸에서는 19까지,, 이런식으로 값을 담고 있음.
        입력받은 숫자가 칸의 값을 넘으면 cnt 를 더이상 하지 않음.
         */
        while (N > box){
            box += 6 * cnt;
            cnt += 1;
        }

        System.out.println(cnt);
    }
}
