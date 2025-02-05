package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9063_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if (1 > a || a > 100000) return;

        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;

        for (int i = 0; i < a; i++) {
            String line = br.readLine();
            String[] tokens = line.split(" ");
            int x = Integer.parseInt(tokens[0]);
            int y = Integer.parseInt(tokens[1]);

            maxX = Math.max(x, maxX);
            maxY = Math.max(y, maxY);
            minX = Math.min(x, minX);
            minY = Math.min(y, minY);
        }

        int width = maxX - minX;
        int height = maxY - minY;

        System.out.println(width * height);
    }
}
