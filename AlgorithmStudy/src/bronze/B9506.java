package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int a = Integer.parseInt(br.readLine());
            if (a == -1) break;     // -1 을 입력받으면 while 문에서 빠져나온다.
            if (2 >= a || a >= 100000) return;

            int[] chk = new int[a];
            int sum = 0;

            for (int i = 1; i < a + 1; i++) {
                if (a % i == 0 && a != i) {
                    chk[i] = i;
                    sum += i;
                }
            }

            if (sum == a) {
                System.out.print(a + " = ");
                System.out.print(1);    // 1은 모든 수의 약수이므로 출력

                for (int i = 2; i < chk.length; i++) {
                    if (chk[i] != 0) {
                        System.out.print(" + " + i);
                    }
                }
                System.out.println();
            } else {
                System.out.println(a + " is NOT perfect.");
            }
        }


    }
}
