package bronze;

import java.util.Scanner;

public class B10987 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String W = sc.next();
        String word = W.toLowerCase();
        int cnt = 0;
        char w;
        char[] array = {'a','e','i','o','u'};

        for (int i = 0 ; i < word.length(); i ++){
            w = word.charAt(i);
            for(char element : array){
                if(element == w){
                    cnt ++;
                }
            }
        }
        System.out.println(cnt);
    }
}
