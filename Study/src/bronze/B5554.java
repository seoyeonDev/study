package Study.src.bronze;

import java.util.Scanner;

public class B5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] time = new int[4];
        int alltime = 0;
        int x;
        int y;

        for(int i = 0 ; i < 4 ; i++){
            time[i] = sc.nextInt();

            alltime += time[i];
        }

        x = alltime / 60;
        y = alltime % 60;

        System.out.println(x);
        System.out.println(y);
    }
}
