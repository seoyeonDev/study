package AlgorithmStudy.src.bronze;

import java.util.Scanner;

public class B3047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String abc = sc.next();
        int a,b,c;

        if (A > 100 || B > 100 || C > 100 ){
            return;
        }
        // A < B
        // B < C
        while (true) {
            int tmp = 0;
            if (A > B) {
                tmp = B;
                B = A;
                A = tmp;
            } else if (B > C) {
                tmp = C;
                C = B;
                B = tmp;
            } else if (A < B && B < C){
//                System.out.println(A + " " + B + " " + C);
                for(int i = 0; i <abc.length(); i++) {
                    char n = abc.charAt(i);
                    if (n == 'A'){
                        System.out.print(A+ " ");
                    } else if (n == 'B'){
                        System.out.print(B+ " ");
                    } else if (n == 'C'){
                        System.out.print(C + " ");
                    }
                }
                return;
            }
        }



    }
}
