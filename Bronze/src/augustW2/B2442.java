package augustW2;

import java.util.Scanner;

public class B2442 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k;
		for (int i = 1; i < N + 1; i++) {
			for (k = 0; k < N - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();

		}
	}

}
