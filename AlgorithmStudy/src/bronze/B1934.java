package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        if (1 > testCases || testCases > 1000) return;

        for (int i = 0; i < testCases; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (1 > a || 1 > b || a > 45000 || b > 45000) return;

            int gcdNum = getGcd(a, b);

            int rslt = a * b / gcdNum;
            System.out.println(rslt);
        }

    }

    public static int getGcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1; // num2 가 0일때 while 문 멈춤
    }
}
