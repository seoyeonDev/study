package AlgorithmStudy.src.bronze;

import java.util.Scanner;

public class B2857 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a = new String[5];
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next();
//			System.out.println(i+" "+a[i]);
		}
		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
			if (a[i].contains("FBI")) {
				System.out.print((i + 1) + " ");
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("HE GOT AWAY!");
		}

	}

}
