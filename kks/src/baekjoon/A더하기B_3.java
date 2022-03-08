package baekjoon;

import java.util.Scanner;

public class A¥ı«œ±‚B_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int tesk = scanner.nextInt();
		
		
		for(int i = 0; i < tesk; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.printf("Case #%d: %d\n",i,(a+b));
		}
		scanner.close();
	}

}