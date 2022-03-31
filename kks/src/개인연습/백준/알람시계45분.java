package 개인연습.백준;

import java.util.Scanner;

public class 알람시계45분 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		
		if(m < 45) {
			//입력된 m이 45미만일 경우
			h--;
			//입력된 시간은 감소
			m= 60 - (45 - m);
			//
			if(h < 0) {
				h = 23;
			}
			System.out.println(h + " " + m);
		}
		else {
			System.out.println(h + " " + (m - 45));
		}
		
		
	}
}
