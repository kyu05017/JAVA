package MyPractice04_Beakjoon;

import java.util.Scanner;

public class 오븐시계 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
		int min  = scanner.nextInt();
		int min2 = scanner.nextInt();
		
		hour += min2/60;
			//80나누기60
		min  += min2%60;
			//80나머지60
		if(min >= 60){
			hour += 1;
		    min -= 60;
		}
		if(hour >= 24){
			hour -= 24;
		}
		    
		System.out.printf("%d %d", hour, min);
				
	}

}
