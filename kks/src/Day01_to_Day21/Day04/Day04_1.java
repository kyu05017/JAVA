package Day01_to_Day21.Day04;

import java.util.Scanner;

public class Day04_1 { // c s

	public static void main(String[] args) { // m s
		
		// ��� : if , switch
		// �ݺ��� : for , while[���ѷ���]
		
			// 1. �ʱⰪ 2.���ǽ� 3.������ 4.���๮
			//while ����
			//	1.�ʱⰪ;
			//	while(2.���ǽ�) {
			//	
			//	4.���๮
			//	3.�߰���;
		
		// for ��1)
		for(int i = 1; i <= 10; i++) {
			//* i�� 1���� 10���� ���� 1�� �����ϸ鼭 ǥ��������� ����Ѵ�.
			System.out.print(i + " ");
		}//for ��
		
		System.out.println();
		
		// while ��1)
		int i = 1; //1. �ʱⰪ
		while(i <= 10) { //2.���ǽ�
			System.out.print(i + " ");//4.���๮
			 i+=1;//3.������
		}//while ��
		
		System.out.println();
		
		// for ��2)
		int sum = 0;
		for(int j = 1; j <= 100; j++) {
			sum += j;
		}//for ��
		System.out.println("for���� 100������ ��"+sum);
		
		System.out.println();
		
		// while ��2)
		int j = 1; //1.�ʱⰪ
		int sum2 = 0;
		while(j <= 100) {//2. ���ǽ� [ true�̸� ���ष �ƴϸ� �Ұ� ]
			sum2 +=j; // 4.���๮
			j += 1; //3.������
		}// while end : j�� 101�϶� ����
		System.out.println("while ���� 100���� ��"+sum2);
		
		System.out.println();
		
		//while ��3) ���ѷ���
		while(true) { //���ǽ��� true ���� //true ��� => ���ѷ���
			System.out.println("���ѷ���");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if( exit == 3) {
				break;//break �������� ���� ����� �ݺ����� Ż�� [if�� ����]
			}
		} // while�� ����
		
		
		

	} // m e

}// c e
