package AlgorithmStudy.src.bronze;

import java.util.Scanner;

public class B2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        String answer = "";

        for(int i = 0 ; i < w.length(); i++) {
            char b = w.charAt(i);
            if(Character.isUpperCase(b)){
                answer += Character.toLowerCase(b);
            } else if (Character.isLowerCase(b)) {
                answer += Character.toUpperCase(b);
            }
        }
        System.out.println(answer);

    }
}
