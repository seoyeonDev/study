package AlgorithmStudy.src.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class B1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String word = br.readLine();
            if (word.equals("0")) break;

            String rslt = chkWord(word);
            System.out.println(rslt);
        }

    }

    public static String chkWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return "no";
            }
        }
        return "yes";
    }
}
