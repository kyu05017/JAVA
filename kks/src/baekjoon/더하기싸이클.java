package baekjoon;

import java.util.Scanner;

public class ���ϱ����Ŭ {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int init = scanner.nextInt();
		int N = init;
		int count = 0;
		 
		while(true) {
			// N�� ���� �ݺ��ϹǷ� ����� ���� N���� ������ش�.
			N = (N % 10) * 10 + ((N / 10) + (N % 10)) % 10;
			
			count++;	// ����Ŭ �� ����
			
			if(N == init) {	// �ʱⰪ�� �������ٸ� break;
				break;
			}
		}
		System.out.println(count);
	}
}