package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B24262 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(1);  // i는 N을 2로 나눈 수로 항상 1번 수행
        System.out.println(0);  // 상수항만으로 이루어진 다항식의 경우 차수는 항상 0
    }
}
