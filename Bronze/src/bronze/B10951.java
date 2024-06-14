package bronze;

import java.util.Scanner;

public class B10951 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if (A < 0 || B < 0 || A > 10 || B > 10) {
				break;
			}
			System.out.println(A + B);
		}
		sc.close();
	}

}
