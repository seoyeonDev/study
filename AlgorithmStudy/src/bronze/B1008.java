package AlgorithmStudy.src.bronze;

import java.util.Scanner;

public class B1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		double c = Math.round(a/b * 1e9) / 1e9;
		System.out.println(c);
	}

}
