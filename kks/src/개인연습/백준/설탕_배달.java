package ���ο���.����;

import java.util.Scanner;

public class ����_��� {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int weight = scanner.nextInt();
		
		scanner.close();
		
		int result = 0;
		
		if (weight == 4 || weight == 7) {
			result = -1;
		}
		else if (weight % 5 == 0) {
			result = weight / 5;
		}
		else if (weight % 5 == 1 || weight % 5 == 3) {
			result = (weight / 5) + 1;
		}
		else if (weight % 5 == 2 || weight % 5 == 4) {
			result = (weight / 5) + 2;
		}
		
		System.out.println(result);
	}
}
