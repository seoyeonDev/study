package AlgorithmStudy.src.bronze;

import java.util.Scanner;

public class B6321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		//테스트 케이스 개수
		int n = sc.nextInt(); 
		
		//케이스 개수만큼 문자입력받기
		for (int i = 1; i<= n; i++) {
			String in = sc.next();
			String nt = getNextString(in);
			System.out.println("String #"+ i);
			System.out.println(nt);
			System.out.println();
		}
		
		
	}
	public static String getNextString(String in) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< in.length();i++) {
			char c = in.charAt(i);
			if(c == 'Z') {
				sb.append('A');
			} else {
				sb.append((char)(c+1));
			}
		}
		
		return sb.toString();
		
	}

}
