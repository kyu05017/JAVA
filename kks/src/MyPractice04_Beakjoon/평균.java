package MyPractice04_Beakjoon;

import java.util.Scanner;

public class ЦђБе {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		
		for(int i = 0; i < count; i ++) {
			int total = (scanner.nextInt() + scanner.nextInt() + scanner.nextInt());
			
			int avg = total/count;
		}
	}

}
