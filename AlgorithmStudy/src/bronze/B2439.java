package AlgorithmStudy.src.bronze;

import java.util.Scanner;

public class B2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i,j,k;
		for (i = a; i > 0; i--) {
			for (k = i-1; k > 0 ; k--) {
				System.out.print(" ");
			}
			for (j = 0; j < a-i+1; j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}

}
