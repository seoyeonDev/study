package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String a = A.toLowerCase();
        if (a.length() > 1000000) return;
        int[] chk = new int[26];
        int max= chk[0];
        int maxIndex = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            int index = ch - 'a';
            chk[index]++;
        }
        for (int i = 0; i < chk.length; i++) {
            if (max <= chk[i]){
                max = chk[i];
                maxIndex = i;
            }
            if (max == chk[i]){
                if (maxIndex == 0) continue;
                System.out.println("?");
                return;
            }
        }
        maxIndex = maxIndex + (int)'a';
        char value = (char) maxIndex;
        char upperValue = Character.toUpperCase(value);

        System.out.println(upperValue);
       
        
    }
}
