package Study.src.bronze;

import java.util.Scanner;

public class B6749 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int M = sc.nextInt();
        int O = 0;

        if ( 0 > Y || Y > 50 ||  0 > M || M > 50){
            return;
        }

        if (Y <= M){
            O = M + (M - Y);
        }else{
            return;
        }


        System.out.println(O);
    }
}
