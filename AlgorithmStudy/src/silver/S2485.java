package AlgorithmStudy.src.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class S2485 {
    public static void main(String[] args) throws IOException {
        // 간격 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        if (testCases < 2 || testCases > 100000) return;

        int arr[] = new int[testCases];
        int gap[] = new int[testCases];

        for (int i = 0; i < testCases; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < testCases; i++) {
            gap[i] = arr[i] - arr[i-1];
        }

        // 간격 간 최대공약수 구하기
        int gcdNum = getGcdArr(gap);
//        System.out.println(gcdNum);

        int addCnt = getTreeCnt(arr[0], arr[testCases - 1], testCases, gcdNum);

        System.out.println(addCnt);

    }

    public static int getGcdArr(int[] num) {
        int num1 = num[1], num2;
        for (int i = 2; i < num.length; i++) {
            if (num[i] < 1 || num[i] > 1000000000) return -1; // 유효성 검사

            num2 = num[i];

            while (num2 != 0) {
                int temp = num1 % num2;
                num1 = num2;
                num2 = temp;
            }
        }
        return num1;
    }

    public static int getTreeCnt(int num1, int num2, int preCnt, int gcdNum) {
        if (num1 < 1 || num2 < 1 || num1 > 1000000000 || num2 > 1000000000) return -1; // 유효성 검사

        int totalCnt = (num2 - num1) / gcdNum + 1;

        return totalCnt - preCnt;

    }


}
