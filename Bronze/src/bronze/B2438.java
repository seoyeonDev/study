package bronze;

import java.util.Scanner;

public class B2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i < n+1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
