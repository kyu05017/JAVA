package 개인연습.백준;

import java.util.Scanner;

public class 최대값 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[9];
		int max = num[0];
		int count = 0;
	
		for(int i = 1; i <= 9; i++) {
			int N = scanner.nextInt();
			num[i] = N;
			if(max < num[i]) {
				max  = num[i];
				count = i;
			}
			
			
		}
		System.out.println(max + " " + count);
	}

}
