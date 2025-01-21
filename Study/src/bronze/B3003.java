package Study.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int look = Integer.parseInt(st.nextToken());
        int bs = Integer.parseInt(st.nextToken());
        int knight = Integer.parseInt(st.nextToken());
        int pone = Integer.parseInt(st.nextToken());

        if (king < 0 || king > 10 ||
                queen < 0 || queen > 10 ||
                look < 0 || look > 10 ||
                bs < 0 || bs > 10 ||
                knight < 0 || knight > 10 ||
                pone < 0 || pone > 10) {
            // 조건을 만족하지 않을 때의 처리
            return; // 또는 원하는 다른 처리를 수행
        }

        if (king != 1) {
            System.out.print(1 - king);
            System.out.print(" ");
        } else {
            System.out.print(0 + " ");
        }
        if (queen != 1) {
            System.out.print(1 - queen);
            System.out.print(" ");
        } else {
            System.out.print(0 + " ");
        }
        if (look != 2) {
            System.out.print(2 - look);
            System.out.print(" ");
        } else {
            System.out.print(0 + " ");
        }
        if (bs != 2) {
            System.out.print(2 - bs);
            System.out.print(" ");
        } else {
            System.out.print(0 + " ");
        }
        if (knight != 2) {
            System.out.print(2 - knight);
            System.out.print(" ");
        } else {
            System.out.print(0 + " ");
        }
        if (pone != 8) {
            System.out.print(8 - pone);
            System.out.print(" ");
        } else {
            System.out.print(0 + " ");
        }

    }
}
