package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B5622 {
    public static boolean isBetween(int x, int min, int max) {
        return x >= min && x <= max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int time = 0;

        if (a.length() <2 || a.length() >15) return;

        for (int i = 0; i < a.length(); i++) {
            int value = a.charAt(i);
            if (isBetween(value, 65, 67)) { // ABC 2
                time += 3;
            } else if (isBetween(value, 68, 70)) { // DEF 3
                time += 4;
            } else if (isBetween(value, 71, 73)) { // GHI 4
                time += 5;
            } else if (isBetween(value, 74, 76)) { // JKL 6
                time += 6;
            } else if (isBetween(value, 77, 79)) { // MNO 7
                time += 7;
            } else if (isBetween(value, 80, 83)) { // PQRS 8
                time += 8;
            } else if (isBetween(value, 84, 86)) { // TUV 9
                time += 9;
            } else if (isBetween(value, 87, 90)) { // WXYZ 10
                time += 10;
            }
        }
        System.out.println(time);
    }
}
