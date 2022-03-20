package MyPractice04_Beakjoon;

import java.util.Scanner;

public class »çºÐ¸é {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if((x != 0 && x >= -1000 && x <= 1000) && (y != 0 && y >= -1000 && y <= 1000)) {
			if(x > 0 && y > 0) {
				System.out.println(1);
			}
			else if(x > 0 && y < 0) {
				System.out.println(4);
			}
			else if(x < 0 && y < 0) {
				System.out.println(3);
			}
			else if(x < 0 && y > 0) {
				System.out.println(2);
			}
		}

	}

}
