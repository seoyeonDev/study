package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (0 > a || a > 180 || 0 > b || b > 180 || 0 > c || c > 180) return;
        int add = a + b + c;

        if (a == b && b == c && a == 60) {
            System.out.println("Equilateral");
        } else if (add == 180) {
            if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
