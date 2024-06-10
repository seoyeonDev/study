package bronze;

import java.util.Scanner;

public class B1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch;
        char[] array = {'a','e','i','o','u'};
        int sum = 0;

        while(true){
            String line = sc.nextLine();
            int cnt = 0;

            if (line.equals("#")){
                break;
            }


            for (int i = 0; i<line.length(); i++){
                line = line.toLowerCase();
                ch = line.charAt(i);


                for(char element : array){
                    if(element == ch){
                        cnt ++;
                    }
                }
            }
            System.out.println(cnt);


        }
    }
}
