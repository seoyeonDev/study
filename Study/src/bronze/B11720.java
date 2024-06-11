package Study.src.bronze;

import java.util.Scanner;

public class B11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        String num = null;
        String[] ch = new String[N];
        num = sc.next();

        ch = num.split("");
        for (int i = 0; i<N ; i++){
            sum += Integer.parseInt(ch[i]);
        }

        System.out.println(sum);
    }
}
