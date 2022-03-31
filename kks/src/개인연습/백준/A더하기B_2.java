package 개인연습.백준;

import java.util.Scanner;

public class A더하기B_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int tesk = scanner.nextInt();
		
		
		for(int i = 0; i < tesk; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.printf("%d\n",(a+b));
		}
		scanner.close();
	}

}
