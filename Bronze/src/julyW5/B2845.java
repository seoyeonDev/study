package julyW5;

import java.util.Scanner;

public class B2845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// l:1m2당 사람의 수 p:파티가 열렸던 곳의 넓이
		int l;
		int p;
		int a, b, c, d, e;
		Scanner sc = new Scanner(System.in);
		l = sc.nextInt();
		p = sc.nextInt();

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		int mul = l * p;

		System.out.print(a - mul + " ");
		System.out.print(b - mul + " ");
		System.out.print(c - mul + " ");
		System.out.print(d - mul + " ");
		System.out.print(e - mul + " ");

	}

}
