package 개인연습.백준;

import java.util.Scanner;

public class X보다작은수 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n =scanner.nextInt();
		int x =scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int a =scanner.nextInt();
			
			if(a > x) {
				System.out.println(a);
			}
		}

	}

}
