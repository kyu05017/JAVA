package MyPractice04_Beakjoon;

import java.util.Scanner;

public class 백준_별찍기2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		for(int i = 1; i <= a; i++) {
			for(int b = 1; b <= a-i; b++) {
				System.out.print(" ");
			}
			for(int s = 1; s <= i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
