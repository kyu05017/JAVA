package Day05;

import java.util.Scanner;

public class Day05_3 {//c s
	
	//p.181 ����Ǯ��
		// 1. 
		// 2.
		// 3. (2) : ��ü�񱳽� .equals ���
		// 4. (2) : ���̰� ������� ���� �Ұ�
		// 5. (3) : boolean �ʱⰪ�� false
		// 6. 3 , 5
	

	public static void main(String[] args) {//m s
		
		// 7.
	
		
		int max = 0;// �ִ밪�� �����ϴ� ��������
		int[] array = {1, 5, 3, 8, 2};// ����� ���ÿ� �ʱ�ȭ ����
		
		for(int i = 0; i < array.length/* == 5*/; i++) {
			// i�� 0���� array�� ���̱��� 1�� �����ϸ� �ݺ�
			if(max < array[i])max = array[i];
			// ���࿡ max���� i��° �ε����� ���� �� ũ�� �迭�� ���� max�� ����
		}
		System.out.println("max: " + max);
		
		
		// 8.
		int[][] array2= {{85, 86}, {83, 82, 86}, {78, 83, 93, 84, 88},};
		int sum = 0;
		double avg = 0.0;
		int count = 0; //ĭ ���� ����
		
		//2���� �迭 ��� ������ ȣ��
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				sum += array2[i][j]; 
				
			}
			count += array2[i].length; //�� ������ �����հ�
		}
		avg = sum/count;
		System.out.println("sum : " + sum);
		System.out.println("avg : "+ avg);
		
		
		// 9.
		boolean run = true;
		int studentNum = 0; // �л� �� ����
		int[] score = null; // ���� �迭 ���� // �޸��Ҵ� x
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.�л��� 2.�����Է� 3.��������Ʈ 4.�м� 5.����");
			System.out.println("------------------------------------------");
			System.out.println("���� => ");
			
			int select = scanner.nextInt();
			
			if(select==1) {// �л� �� �Է�
				System.out.println();
				System.out.println("�л���");
				studentNum = scanner.nextInt();
				score = new int[studentNum];
				//�Է¹��� �л�����ŭ �迭���̸� ����
				//ȣ��� ������ �򰥸��� ����
			}
			else if(select==2) {// �л� ���� �Է�
				for(int i =0; i < score.length; i++) {
					System.out.println();
					System.out.printf(" scroe[%d] : \n ",i ,score[i]);
					score[i] = scanner.nextInt();
				}
			}
			else if(select==3) { // �л� ���� ���
				for(int i = 0; i < score.length; i++) {
					System.out.printf(" scroe[%d] : %d \n ",i ,score[i]);
				}
			}
			else if(select==4) { // ��� ���ϱ�
				int sum2 = 0; //���հ�
				int max2 = 0; //�ְ� ����
				double avg2 = 0.0; // �������
				for(int i = 0; i < score.length; i++) {
					sum2 += score[i];
					avg2 = sum2/score.length;
					if(max2 < score[i]) max2 = score[i];
				}
				System.out.printf(" �ְ� : %d \n",max2);
				System.out.printf(" ��հ� : %.2f",avg2);
				System.out.println();
			}
			else if(select==5) {
				run = false; //break;
			}
		}//while end
		System.err.println("�˸�) ���α׷� ����");
	}//m e
}//c e
