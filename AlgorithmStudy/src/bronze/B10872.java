package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n < 0 || n > 12) return;
        int multiple = 1;

        while (n > 0) {
            multiple = n * multiple;
            n --;
        }

        System.out.println(multiple);
    }
}
