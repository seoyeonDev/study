package Study.src.bronze;

import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int maxNum = 0;
        int indexNum = 0;

        for (int i = 0; i < 9; i++) {
            num[i] = sc.nextInt();
            if (num[i] >= 100) {
                return;
            }
        }
        for (int j = 0; j < 9; j++) {
            if (num[j] > maxNum) {
                maxNum = num[j];
                indexNum = j;
            }
        }
        System.out.println(maxNum);
        System.out.println(indexNum + 1);

    }
}

