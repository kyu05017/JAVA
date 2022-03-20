package MyPractice04_Beakjoon;

import java.util.Scanner;

public class 최소_최대 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int[] num = new int[N];
		
		
		for(int i = 0; i < N; i++ ) {
			int N2 = scanner.nextInt();	
			num[i] = N2;
		}
		
		int max = num[0];
		int min = num[0];
		
		for(int i = 1; i < N; i++) {
			
			
			if(min > num[i]) {
				min = num[i];
			}
			if(max < num[i]) {
				max  = num[i];
			}
		}
		System.out.println(min + " " + max);

	}

}
