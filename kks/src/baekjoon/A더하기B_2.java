package baekjoon;

import java.util.Scanner;

public class A¥ı«œ±‚B_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int tesk = scanner.nextInt();
		
		int a;
		int b;
		
		for(int i = 0; i <= tesk; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.printf("%d\n",(a+b));
		}
		scanner.close();
	}

}
