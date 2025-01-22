package AlgorithmStudy.src.bronze;

import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N ; i++){
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for(int num : array){
            if(num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }
        System.out.println(min + " " + max);
    }
}
