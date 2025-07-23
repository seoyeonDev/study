package AlgorithmStudy.src.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class S10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cardCnt = Integer.parseInt(br.readLine());

        HashSet<Integer> list = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cardCnt; i++) {
            list.add(Integer.valueOf(st.nextToken()));

        }

        int aCnt = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < aCnt; i++) {
            if (list.contains(Integer.valueOf(st2.nextToken()))) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }


    }


}
