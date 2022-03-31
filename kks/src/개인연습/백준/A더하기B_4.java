package 개인연습.백준;

import java.util.Scanner;

public class A더하기B_4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		
		
		for(int i = 1;i <= x;i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println("Case #"+i+": " + a +" + "+ b +" = "+(a+b) );
		}

	}

}
