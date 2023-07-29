package julyW5;

import java.util.Scanner;

public class B2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a:시 b:분 c:요리하는데 필요한 시간
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (0 <= a && a < 24 && 0 <= b && b < 60) {
		// d:a에 더함 e:b에 더함
		int d = a + Math.round(c / 60);
		int e = b + c % 60;

		System.out.println(a + " " + b + " "+ " "+ c + " "+ d + " "+ e);
			if (e > 59) {
				d += 1;
				e = e % 60;

			}
			if (d > 23) {
				d = d%24;
				e = e % 60;
			}
			System.out.print(d + " " + e);
		}
	}

}
