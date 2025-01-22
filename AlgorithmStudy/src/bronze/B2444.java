package AlgorithmStudy.src.bronze;

import java.util.Scanner;

public class B2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (1 > N || N > 100) return;

        for (int i = 1; i < N; i++) {
            int k;
            int j;
            for (k = N - i ; k > 0; k --){
                System.out.print(" ");
            }
            for (j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        for (int i = 1; i < 2 * N; i++){
//            System.out.print("*");
//        }
//        System.out.println();
        for (int i = N ; i > 0; i--) {
            int k;
            int j;
            for (k = 0 ; k < N - i ; k ++){
                System.out.print(" ");
            }
            for (j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
//            for (k = N - i ; k > 0; k --){
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}
