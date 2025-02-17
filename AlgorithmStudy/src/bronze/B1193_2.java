package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int floor = 1;
        int up = 1, down = 1;
        // 1 2 3 4 5
        /*
            1/1                     홀
            1/2 2/1                 짝 1 시작,
            3/1 2/2 1/3             홀 층 시작,
            1/4 2/3 3/2 4/1         짝 1 시작,
            5/1 4/2 3/3 2/4 1/5     홀 층 시작,
         */

        // 층 찾기
        while (N > floor) {
            N -= floor;
            floor++;
        }

        //
        // 짝수 층일 경우
//        while (N > -1) {
        if (floor % 2 == 0) {
            up = N;
            down = floor - N + 1;

        } else if (floor % 2 == 1) {
            up = floor - N + 1;
            down = N;
        }
//        }

        System.out.println(up + "/" + down);


    }
}
