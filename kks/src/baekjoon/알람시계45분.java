package baekjoon;

import java.util.Scanner;

public class �˶��ð�45�� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		
		if(m < 45) {
			h--;		// ��(hour) 1 ����
			m= 60 - (45 - m); 	// ��(min) ����
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
