package augustW1;

import java.util.Scanner;

public class B2442 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			for (int k = i; k > 0; k--) {
				System.out.print("a");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
