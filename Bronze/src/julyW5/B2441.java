package julyW5;

import java.util.Scanner;

public class B2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m,j;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N ; i++) {
			
			for (m = 0; m < i; m++) {
				System.out.print(" ");
			}
			for (j = 0; j < N-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
