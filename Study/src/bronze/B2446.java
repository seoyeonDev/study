package Study.src.bronze;

import java.util.Scanner;

public class B2446 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k;

		for (int i = 0; i < N; i++) {
			for(k = 0; k <  N ; k++) {
				System.out.print("a");
			}
//			for (int j = 0; j <i - k; j++) {
//				System.out.print("*");
//			}
			System.out.println();
		}
	}

}
