package MyPractice04_Beakjoon;

import java.util.Scanner;

public class °ö¼ÀÁøÇà {

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
