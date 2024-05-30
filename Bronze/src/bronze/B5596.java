package bronze;

import java.util.Scanner;

public class B5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Min = new int[4];
        int[] Man = new int[4];
        int S = 0;
        int T = 0;

        for (int i=0; i<4; i++){
            Min[i] = sc.nextInt();
            S += Min[i];
        }
        for (int i=0; i<4; i++){
            Man[i] = sc.nextInt();
            T += Man[i];
        }
        System.out.println(Math.max(S, T));


    }
}
