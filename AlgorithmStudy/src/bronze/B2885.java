package AlgorithmStudy.src.bronze;

import java.util.Scanner;

public class B2885 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();

		int a = M - 45;

		if (a < 0) {
			H--;
			M = 60 + a;
		} else {
			M = a;
		}
		
		if (H < 0) {
			H = 24 + H;
		}
		System.out.println(H + " "+ M);

	}
}
