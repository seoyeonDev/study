package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        if (1 > a || a > 100000) return;

        if (a < 2) {
            System.out.println(0);
            return;
        }

        int[][] point = new int[a][a];
        int maxX = 0, maxY = 0;
        int minX = 100000, minY = 100000;
        int x, y;

        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 2; j++) {
                point[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // x,y
        for (int i = 0; i < a; i++) {
            maxX = Math.max(point[i][0], maxX);
            maxY = Math.max(point[i][1], maxY);

            minX = Math.min(point[i][0], minX);
            minY = Math.min(point[i][1], minY);
        }

        x = maxX - minX;
        y = maxY - minY;

        System.out.println(x * y);


    }
}
