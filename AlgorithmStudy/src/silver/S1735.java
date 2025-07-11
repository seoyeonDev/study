package AlgorithmStudy.src.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class S1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4]; // 0 1 2 3
        int cnt = 0;
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[cnt] = Integer.parseInt(st.nextToken());
            arr[cnt+1] = Integer.parseInt(st.nextToken());

            if (arr[cnt] > 30000 || arr[cnt +1] > 30000) return;
            if (arr[cnt] < 1 || arr[cnt+1] < 1) return;

            cnt += 2;
        }
        int top = (arr[0] * arr[3]) + (arr[1] * arr[2]);
        int btm = arr[1] * arr[3];
        int gcdNum = getGcd(top, btm);
        System.out.print(top / gcdNum + " ");
        System.out.println(btm / gcdNum);
    }

    public static int getGcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }
}
