package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int cnt =a.length();
        if (a.length() > 100) return;

        for (int i=0; i< a.length(); i++){
            if (a.charAt(i)=='=' || a.charAt(i)=='-'){
                if (i > 1){
                    if (a.charAt(i-1) == 'z' && a.charAt(i-2) == 'd'){
                        cnt --;
                    }
                }
                cnt --;
            }
            if (a.charAt(i)=='j'){
                if (i > 0){
                    if (a.charAt(i-1) == 'l' || a.charAt(i-1) == 'n'){
                        cnt --;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
