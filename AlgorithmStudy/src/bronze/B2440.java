package AlgorithmStudy.src.bronze;

import java.util.Scanner;

public class B2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
//        for(int i = 1; i < N + 1 ; i++){
//            for(int j=0; j < i ; j ++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i = N ; i > 0; i --){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
