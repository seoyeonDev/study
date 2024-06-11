package Study.src.bronze;

import java.util.Scanner;

public class B2914 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A:수록된 곡의 개수 I: 평균값, 
		int A, I, All;
		Scanner sc = new Scanner (System.in);
		A = sc.nextInt();
		I = sc.nextInt();
		
		All = A * (I-1)+1;
		System.out.println(All);
				
	}

}
