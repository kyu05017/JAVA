package baekjoon;

import java.util.Scanner;

public class NÂ÷»©±â {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int tesk = scanner.nextInt();
		int a = 0;
		for(int i = 1; i <= tesk ;i++) {
			for(int j = 1;j <= tesk - j;j++) {
				a++;
			}
			System.out.println(a);
		}

	}

}
