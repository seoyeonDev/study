package AlgorithmStudy.src.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

//        boolean[] list = ocWindow(n);
//        int chk = chkWindow(n, list);

        int chk = chkNum(n);

        System.out.println(chk);

    }

    /*
    1. 마지막에는 홀수 번 토글된 창문만 열려있음
    2. 토글 횟수 = 약수의 개수
    3. 약수의 개수가 홀수인 숫자는 총 몇개?
    - n 의 제곱근을 구하고, 정수 부분만 갖기
    k * k ≤ N 이라는 수식의 양변에 루트를 씌우면 k ≤ √N
     */

    public static int chkNum(int n) {
        return (int) Math.sqrt(n);
    }

}
