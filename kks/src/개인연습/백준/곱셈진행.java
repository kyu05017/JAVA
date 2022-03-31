package 개인연습.백준;

import java.util.Scanner;

public class 곱셈진행 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		
		
		System.out.println((b%100%10)*a);
		System.out.println((b%100/10)*a);
		System.out.println((b/100)*a);
		System.out.println(a*b);

	}

}
