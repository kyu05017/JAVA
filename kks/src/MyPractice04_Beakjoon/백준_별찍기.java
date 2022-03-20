package MyPractice04_Beakjoon;

import java.util.Scanner;

public class 백준_별찍기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		for(int i = 1; i <= a; i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
