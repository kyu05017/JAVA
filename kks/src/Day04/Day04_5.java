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
				if(inputNumber == myNumber[j]) { //�Էµȼ��ڰ� ����� ���ڿ� ���� ���
					System.out.println("�ߺ��� ���� �Դϴ�.");
					i--; // �ݺ�Ƚ�� �ʱ�ȭ
					pass = false; // ��������� �������� ����.
				}
			}
			if(pass == true) myNumber[i] = inputNumber; //����
		}
		//�Է��� �������� ������
		System.out.println("����ڰ� �Է��� ��ȣ");
		for(int temp : myNumber) {
			//�ӽú��� ���� : �迭�� ���ڸ�ŭ �ݺ�
			System.out.println(temp+"\t");
		}
		//�ζ� ��ȣ ����
		for(int j = 0; j < 6; j++) {//for2 s
			
			Random random = new Random();
			int lotto = random.nextInt(45)+1;
			
			boolean pass2 = true;
			for(int temp : lottoNumber) {
				if(lotto == temp) {
					j--;
					pass2 = false;
				}
			}
			if(pass2 == true) {
				lottoNumber[j] = lotto;
			}
		}// for2 e
		System.out.print("\n \t��÷��ȣ\t: ");
		// * �迭�� ��� �ε��� ��� 
		for( int temp : lottoNumber ) {
			System.out.print( temp +"\t");
		}
		// 3. �� = �� �迭�� ������ �� ã�� 
		// ����� ��ȣ : 3 5 7 1 10 21
		// ��÷ ��ȣ  : 5 7 1 34 42 40 
			// i = 0 
				// j = 0 1 2 3 4 5
			// i = 1 
				// j = 0 1 2 3 4 5 
			// ~~~~~
			// i = 5
				// j = 0 1 2 3 4 5
		int sameNum = 0;
		
//		// ���1 
//		for( int i = 0 ; i<����ڹ�ȣ.length ; i++ ) {
//			// i �� ������ 
//			for( int j = 0 ; j<��÷��ȣ.length ; j++ ) {
//				// j �� ���
//				if( ����ڹ�ȣ[i] == ��÷��ȣ[j] ){
//					// ����� �迭�� i��° �ε��� �� 
//					// ��ǻ�� �迭�� j��° �ε��� �� �� �� �����ϸ�
//					�����Ѽ�++; 
//				}
//			}
//		}
		
		// ���2 
		for( int �񱳱��� : myNumber ) {
			// ����ڹ�ȣ �迭�� �ϳ��� �񱳱��� ���� 
			for( int �񱳴�� : lottoNumber ) {
				// ��÷��ȣ �迭�� �ϳ��� �񱳴�� ����
				if( �񱳱��� == �񱳴��) sameNum++;
				// ���࿡ �񱳱��ذ� �񱳴���� �����ϸ� �����Ѽ� 1����
			}
		}
		
		System.out.println(" \n������ �� : " + sameNum );
		
	}//m e
}//c e
