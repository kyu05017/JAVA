package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5 {

	public static void main(String[] args) {
		
		// �ζ� �Ǻ���
			//1. ����ڰ� 6�� �� �Է¹ޱ� => �迭����
				// 1. 1~45 ���� ���� �Է� �ޱ� �ƴϸ� ���Է�
				// 2. �ߺ��̸� ���Է�
			//2. ��÷��ȣ : ��ǻ�� ���� 6�� �߻� => ���� 
				//1. 1~ 45 ����
				//2. �ߺ� x
			//3����� ��÷��ȣ�� �Ĥ�ǻ�� ��÷��ȣ ���� ���� ����
		
		Scanner scanner = new Scanner(System.in);
		
		//�غ�
		int[] myNumber = new int[6];	//����ڰ� ������ ��ȣ ���
		int[] lottoNumber = new int[6]; //��ǻ���� ���� ��ȣ ���
		
		for(int i = 0; i < 6; i++) {
			//i �� 01nxj 6�̸����� 1�� �����ϸ鼭 6�� �ݺ�
			System.out.println("1~45 ���� ���� �Է� : ");
			int inputNumber = scanner.nextInt();
			
			boolean pass = true; //����Ǵ� ���� ���� 
			
			//��ȿ�� �˻�
			if(inputNumber < 1 || inputNumber > 45) { 
				//�ζ� ��ȣ�� 1���� 45�� 
				//���� �� ���ڰ� 1���� �۰ų� || 45���� ũ��
				//if ���ǹ� ����
				System.out.println("����Ҽ� ���� �����Դϴ�.");
				i--; // �ݺ�Ƚ�� �ʱ�ȭ;
				pass = false; // ��������� �������� ����
			}
			//�ߺ��˻�
			for(int j = 0 ; j < 6; j++) {
				if(inputNumber == myNumber[j]) {
					System.out.println("�ߺ��� ���� �Դϴ�.");
					i--;
					pass = false;
				}
			}
			if( pass == true) myNumber[i] = inputNumber;
			
		}
		

	}

}
