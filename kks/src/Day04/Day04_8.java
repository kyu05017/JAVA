package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_8 {

	public static void main(String[] args) {
		
		
		int[] myNum = new int[6];
		int[] lottoNum = new int[6];
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//����ڿ��� ��ȣ �Է¹ޱ�
		for(int i = 0; i < 6; i++) {
			int inputNum = scanner.nextInt();
			boolean pass = true;
			System.out.println((i+1)+"° ��ȣ �Էµ�");
			//�Է������� ������ش�
			if(inputNum < 1 || inputNum > 45) {
				System.out.println("��밡���� ��ȣ�� 1 ~ 45 ���� �Դϴ�.");
				i--;
				pass = false;
			}
			//�ߺ�üũ
			for(int j = 0; j < myNum.length; j++) {
				if(inputNum == myNum[j]) {
					System.out.println("���� ��ȣ�� �Է��Ҽ� �����ϴ�.");
					i--;
					pass = false;
				}
			}
			if(pass = true) {//���� �׸��� ����Ͽ� ������
				myNum[i] = inputNum;//myNum�� inputNum�� �����Ѵ�.
			}
		}
		System.out.println("----�Է��� ����----");
		//����� �� ����غ���
		for(int temp : myNum) {
			System.out.print(temp + " ");
		}
		
	}//m e
}//c e