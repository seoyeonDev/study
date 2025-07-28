package AlgorithmStudy.src.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.file.Watchable;
import java.util.Objects;
import java.util.StringTokenizer;

public class S1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // row
        int M = Integer.parseInt(st.nextToken()); // column

        boolean[][] chess = new boolean[8][8];
        boolean[][] list = new boolean[N][M];

        // 입력된 체스판
        for (int i = 0; i < N; i++) {   // row
            String line = br.readLine();
            for (int j = 0; j < M; j++) {   // column
                char ch = line.charAt(j);
                if (ch == 'W') {
                    list[i][j] = true;
                }
            }
        }

        // 체스판 8*8 자르기 경우의 수
        int min = Integer.MAX_VALUE;
        int value = 0;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                // 나타날 수 있는 체스판
                value = chkChessBoard(list, i, j);
                if (min > value) min = value;
            }
        }

        System.out.println(min);


    }

    // 8 * 8 칸 안에서 몇개 칠해야 하는지 확인하는 메서드
    public static int chkChessBoard(boolean[][] list, int m, int n) {
        boolean[][] answer1 = answerChessBoard(list[0][0]);
        boolean[][] answer2 = answerChessBoard(!list[0][0]);
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (answer1[i][j] != list[m + i][n + j]) cnt1++;
                if (answer2[i][j] != list[m + i][n + j]) cnt2++;
            }
        }
        if (cnt1 > cnt2) {
            return cnt2;
        } else {
            return cnt1;
        }


    }

    // 정답 체스판
    public static boolean[][] answerChessBoard(boolean bl) {
        boolean[][] answer = new boolean[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) { // 짝수일 때 입력된 bl
                    answer[i][j] = bl;
                } else {
                    answer[i][j] = !bl;
                }
            }
        }

        return answer;
    }
}
