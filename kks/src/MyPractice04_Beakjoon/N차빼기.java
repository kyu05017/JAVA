package MyPractice04_Beakjoon;

import java.util.Scanner;

public class N차빼기 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int tesk = scanner.nextInt();
		for(int i = tesk; i > 0;i--) {
			//i가 0일때 0부터 1씩 5이하까지 증가하면서
			//
			//tesk = tesk - i;
			System.out.println(i);
			
		}
		
	}

}
