package baekjoon;

import java.util.Scanner;

public class N�������� {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
