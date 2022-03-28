package MyPractice04_Beakjoon;

import java.util.Scanner;

public class 백준_평균은넘겠지 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr;
		
		int testcase = scanner.nextInt();
		
		for(int i = 0; i < testcase; i++) {
			
			int N = scanner.nextInt();
			arr = new int[N];
			
			double sum = 0.0;
			
			for(int j = 0; j < N ; j++) {
				int val = scanner.nextInt();
				arr[j] = val;
				sum += val;
			}
			
			double mean = ( sum / N);
			double count = 0;
			
			for(int j = 0 ; j < N ; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
		scanner.close();
	}
}
