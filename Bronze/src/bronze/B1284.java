package bronze;

import java.util.Scanner;
import java.util.stream.Stream;

public class B1284 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N; // 입력받은 숫자
		int width = 0; // 호수판 경계 각 1cm 여백
		int each = 0; // 배열에서 하나씩 꺼낸
		boolean flag = false;
		Scanner sc = new Scanner(System.in);

		// N 입력받기
		System.out.println("입력");
		
		
		while (true) {
			N = sc.nextInt();
			if(N == 0) {
				return;
			}
			
			if (0 < N && N <= 9999) {
				// N을 공백으로 각 자리로 나누고 값을 배열에 담기
				width += 2;
				int[] digits = Stream.of(String.valueOf(N).split("")).mapToInt(Integer::parseInt).toArray();
				for (int i = 0; i < digits.length; i++) {
					each = digits[i];
					if (each == 1) {
						width += 2;
					} else if (each == 0) {
						width += 4;
					} else {
						width += 3;
					}
					width += 1;
				}
				width -= 1;
				System.out.println(width);
				width = 0;
			}
			
		}
	}

}
