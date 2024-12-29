package Study.src.bronze;

import java.util.Scanner;

public class B2446 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k, j, a, b;

        for (int i = 0; i < N; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (a = 2 * N - 1 - 2 * i ; a > 0 ; a -- ){
                System.out.print("*");
            }


            System.out.println();
        }
        for (int i = 2; i < N + 1; i++) {
            for (k = 0; k < N - i; k++) {
                System.out.print(" ");
            }
            for (a = 2 ; a < 2 * i + 1 ; a ++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
