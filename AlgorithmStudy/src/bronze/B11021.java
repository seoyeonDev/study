package AlgorithmStudy.src.bronze;

import java.util.Scanner;

public class B11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i<T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            if( 0 >= A || B >= 10){
                return;
            }

            System.out.println("Case #" + (i+1) + ": " + (A+B));
        }
    }
}
