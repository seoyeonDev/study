package AlgorithmStudy.src.bronze;

import java.util.Scanner;
import java.util.stream.Stream;

public class B2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int[] len = Stream.of(String.valueOf(b).split("")).mapToInt(Integer::parseInt).toArray();
//		System.out.println(Arrays.toString(len));

		int num3 = len[2] * a;
		int num4 = len[1] * a;
		int num5 = len[0] * a;
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);

		System.out.println(num3 + (num4*10) + (num5*100));
	}

}
