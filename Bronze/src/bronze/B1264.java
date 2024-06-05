package bronze;

import java.util.Scanner;

public class B1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = "";
        int cnt = 0;
        char ch;
        char[] end = {'.', ',','!','?'};
        String chkStr = ".,`,`,!,?";
        String chkM = "a,e,i,o,u";


        while(true){
            line = sc.next();

            for (int i = 0; i<line.length(); i++){
                ch = line.charAt(i);
                if (chkM.contains(line)){
                    cnt ++ ;
                }

                if (chkStr.contains(line)){
                    System.out.println(cnt);
                } else if (ch == '#'){
                    break;
                }

            }


        }
    }
}
