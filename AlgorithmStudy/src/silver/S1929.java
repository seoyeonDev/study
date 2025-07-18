package AlgorithmStudy.src.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        getPrime(m, n);
    }

    // 아리스토테네스의 체
    /*
    1. 범위의 값을 boolean 배열로 만듦
    2. 소수 찾으며, 배수를 체크한다.
    이때, 해당 값은 제외하고 배수부터 찾는다. 해당 값이 이전에 지워지지 않았다면 소수라 판단하기 때문.
    해당 값에 해당 값을 더해가며 배수를 삭제한다.
    3. 소수 일때를 찾아 결과를 출력한다.
     */
    public static void getPrime(int m, int n) {
        boolean[] list = new boolean[n + 1];

        list[0] = true; // 소수가 아님
        list[1] = true;

        // 소수 찾기, 배수 체크
        for (int j = 2; j * j <= n ; j++) {  // 최대값의 제곱근까지 돌며 아직 지워지지 않은 소수 찾기.
            if (!list[j]) { // j 값일 때 다른 수의 배수로서 지워지지 않았다면 j는 소수.
                for (int i = j * j; i <= n; i += j) {   // j의 배수 삭제 (j 배수 부터 시작, i 에 j를 더해가면서 배수 삭제)
                    list[i] = true;
                }
            }
        }

        // 결과 출력
        for (int i = m ; i <= n ; i++) {
            if (!list[i]) {
                System.out.println(i);
            }
        }
    }
}
