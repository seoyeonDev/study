package julyW5;

import java.math.BigInteger;
import java.util.Scanner;

public class B1271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger n,m;
		Scanner sc = new Scanner(System.in);
		//n: 가진 돈 m: 생명체 수
		n = sc.nextBigInteger();
		m = sc.nextBigInteger();
		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
				
		
	}

}
