package baekjoon;

import java.util.Scanner;

public class 더하기싸이클 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int init = scanner.nextInt();
		int N = init;
		int count = 0;
		 
		while(true) {
			// N에 대해 반복하므로 연산된 값도 N으로 덮어써준다.
			N = (N % 10) * 10 + ((N / 10) + (N % 10)) % 10;
			
			count++;	// 사이클 수 증가
			
			if(N == init) {	// 초기값과 같아진다면 break;
				break;
			}
		}
		System.out.println(count);
	}
}