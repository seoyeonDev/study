package bronze;

import java.util.Scanner;

public class B1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if (-10000 <= a && a <= 10000 && -10000 <= b && b <= 10000) {
			if (a > b) {
				System.out.println(">");
			} else if (a < b) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}
		}
	}
}
