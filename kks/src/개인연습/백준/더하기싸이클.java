package ���ο���.����;

import java.util.Scanner;

public class ���ϱ����Ŭ {

	public static void main(String[] args) {
		
		//�Է°�ü
		Scanner scanner = new Scanner(System.in);
		//�Է¹޴� ����
		int init = scanner.nextInt();
		//�Է¹޴� ������ N�� �����Ѵ�
		int N = init;
		//ī��Ʈ Ƚ���� �ʱ�ȭ
		int count = 0;
		 
		while(true) {
			// N�� 26�ϰ�� 
			// 26 ������10�� 6�� ���ϱ� 10�� �ϸ� 60�� �ǰ�
			// 26 ������ 10�� 2�� 26�� 10�������� 6�� ���� 8�� ���ϰ� 10�̻��� ��� 10�� �������� ���Ͽ�
			// 1�� �ڸ��� ����� �ش�.
			//��� �������� ���� 86�� ����� if���� N == init���̶� ���� �ʱ⿡ �������� �ʰ�
			//count�� �������� �ݺ�ȸ���� �Է��Ѵ�
			//cont ������� �ݺ�Ƚ���� ���
			N = (N % 10) * 10 + ((N / 10) + (N % 10)) % 10;
			
			count++;	// ����Ŭ �� ����
			
			if(N == init) {	// �ʱⰪ�� �������ٸ� break;
				break;
			}
		}
		System.out.println(count);
	}
}