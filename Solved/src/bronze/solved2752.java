package bronze;

import java.util.Scanner;

public class solved2752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k;

		int[] arr = { a, b, c };

		for (int i = 0; i < arr.length-1; i++) {
			
			if (arr[i] > arr[i + 1]) {
				k = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = k;
			}
		}
		for(int i = 0; i<arr.length;i++) {
			System.out.print("i:"+i);
		}
	}
}
