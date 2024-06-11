package Study.src.bronze;

import java.util.Scanner;

public class B11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		String a = sc.next();
		char[] b = a.toCharArray();
			for(int i = 0; i<b.length; i++) {
				System.out.print(b[i]);
				if(i%10 == 9) {
					System.out.println();
				}
			}
		
	}

}
