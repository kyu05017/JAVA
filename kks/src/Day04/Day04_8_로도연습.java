package Day04;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Day04_8_�ε����� {//c s

	public static void main(String[] args) {//m s
		
		// �ζ� �Ǻ���
		//1. ����ڰ� 6�� �� �Է¹ޱ� => �迭����
			// 1. 1~45 ���� ���� �Է� �ޱ� �ƴϸ� ���Է�
			// 2. �ߺ��̸� ���Է�
		//2. ��÷��ȣ : ��ǻ�� ���� 6�� �߻� => ���� 
			//1. 1~ 45 ����
			//2. �ߺ� x
		//3����� ��÷��ȣ�� �Ĥ�ǻ�� ��÷��ȣ ���� ���� ����
		
		//���� �غ�
		int[] choiceMyNum = new int[6];//����ڿ��� �Է¹��� 6���� ���� 0~5 [����]
		int[] lottoNum    = new int[6];//��ǻ�Ͱ� ������ ���� 6�� 0~5[����] 
		
		Scanner scanner = new Scanner(System.in); // �Է� ��ü
		Random random = new Random(); //���� ��ü
		
		System.out.println("�ζ� �Ǻ��� 1 ~ 45 ���� ���� �Է�");
		
		//����ڿ��� ���� �Է¹ޱ�
		for(int i = 0; i < 6; i++) {
			//i�� 1�� �����ϸ� 6�̸����� �ݺ��Ѵ�.
			System.out.println((i+1) + "��° ���� �Է�");
			int putMyNum = scanner.nextInt();//����ڿ��� �Է¹޴� ����
			boolean pass = true; // true �� false�� �ּ� ���忩�θ� ����
			
			//�Էµ� ������ ������ ������
			if(putMyNum < 1 || putMyNum > 45) {
				System.out.println("�����Ҽ� �ִ¼��ڰ� �ƴմϴ�.");
				i--;
				pass = false;
			}
			
			//�ߺ����� ����
			for(int j = 0; j < 6; j++) {
				if(putMyNum == choiceMyNum[j]) {
					System.out.println("�̹� �Է��� ���� �Դϴ�.");
					i--; //���� �ݺ������� ��ȯ��
					pass = false; //false�� �ּ� �������� �ʰ���
				}
			}

			//���� ������ ��� ������ ��� choiceMyNum�� putMyNum�� ����
			if(pass == true) {
				choiceMyNum[i] = putMyNum; 
			}
		}//�Է� �ݺ��� ����
		
		
		System.out.println();
		System.out.println("-----�Էµ� ��÷��ȣ-----");
		if(choiceMyNum[0] > choiceMyNum[1]) {
			int min = choiceMyNum[0];
			choiceMyNum[0] = choiceMyNum[1];
			choiceMyNum[1] = min;
		}
		if(choiceMyNum[0] > choiceMyNum[2]) {
			int min = choiceMyNum[0];
			choiceMyNum[0] = choiceMyNum[2];
			choiceMyNum[2] = min;
		}
		if(choiceMyNum[0] > choiceMyNum[3]) {
			int min = choiceMyNum[0];
			choiceMyNum[0] = choiceMyNum[3];
			choiceMyNum[3] = min;
		}
		if(choiceMyNum[0] > choiceMyNum[4]) {
			int min = choiceMyNum[0];
			choiceMyNum[0] = choiceMyNum[4];
			choiceMyNum[4] = min;
		}
		if(choiceMyNum[0] > choiceMyNum[5]) {
			int min = choiceMyNum[0];
			choiceMyNum[0] = choiceMyNum[5];
			choiceMyNum[5] = min;
		}
		if(choiceMyNum[1] >choiceMyNum[2]) {
			int min = choiceMyNum[1];
			choiceMyNum[1] = choiceMyNum[2];
			choiceMyNum[2] = min;
		}
		if(choiceMyNum[1] > choiceMyNum[3]) {
			int min = choiceMyNum[1];
			choiceMyNum[1] = choiceMyNum[3];
			choiceMyNum[3] = min;
		}
		if(choiceMyNum[1] > choiceMyNum[4]) {
			int min = choiceMyNum[1];
			choiceMyNum[1] = choiceMyNum[4];
			choiceMyNum[4] = min;
		}
		if(choiceMyNum[1] > choiceMyNum[5]) {
			int min = choiceMyNum[1];
			choiceMyNum[1] = choiceMyNum[5];
			choiceMyNum[5] = min;
		}
		if(choiceMyNum[2] > choiceMyNum[3]) {
			int min = choiceMyNum[2];
			choiceMyNum[2] = choiceMyNum[3];
			choiceMyNum[3] = min;
		}
		if(choiceMyNum[2] > choiceMyNum[4]) {
			int min = choiceMyNum[2];
			choiceMyNum[2] = choiceMyNum[4];
			choiceMyNum[4] = min;
		}
		if(choiceMyNum[2] > choiceMyNum[5]) {
			int min = choiceMyNum[2];
			choiceMyNum[2] = choiceMyNum[5];
			choiceMyNum[5] = min;
		}
		if(choiceMyNum[3] > choiceMyNum[4]) {
			int min = choiceMyNum[3];
			choiceMyNum[3] = choiceMyNum[4];
			choiceMyNum[4] = min;
		}
		if(choiceMyNum[3] > choiceMyNum[5]) {
			int min = choiceMyNum[3];
			choiceMyNum[3] = choiceMyNum[5];
			choiceMyNum[5] = min;
		}
		if(choiceMyNum[4] > choiceMyNum[5]) {
			int min = choiceMyNum[4];
			choiceMyNum[4] = choiceMyNum[5];
			choiceMyNum[5] = min;
		}
		System.out.print(choiceMyNum[0]+" "+choiceMyNum[1]+" "+choiceMyNum[2]+" "+choiceMyNum[3]+" "+choiceMyNum[4]+" "+choiceMyNum[5]);
		
		//��ǻ�Ͱ� ���� �����ϱ�
		
		for(int i = 0; i < 6; i++) {
			int randomLottoNum = random.nextInt(45)+1; //�ڿ� ������ �� ���ڸ��� ���� �����Ѵٴ°��� �ǹ� �Ѵ�
			boolean pass2 = true;
			
			//�ߺ����ΰ���
			for(int j = 0; j < 6; j++) {
				if(randomLottoNum == lottoNum[j]) {
					i--;
					pass2 = false;
				}
			}
			
			if(pass2 == true) {
				//���࿡ pass2�� ���ϰ�� lottoNum[]�� ������ randomLottoNum�� �����Ѵ�
				lottoNum[i] = randomLottoNum;
			}
		}//�ζ� ���� ���� ����
		
		System.out.println();
		System.out.println("-----�̹�ȸ�� ��÷��ȣ-----");

		if(lottoNum[0] > lottoNum[1]) {
			int min = lottoNum[0];
			lottoNum[0] = lottoNum[1];
			lottoNum[1] = min;
		}
		if(lottoNum[0] > lottoNum[2]) {
			int min = lottoNum[0];
			lottoNum[0] = lottoNum[2];
			lottoNum[2] = min;
		}
		if(lottoNum[0] > lottoNum[3]) {
			int min = lottoNum[0];
			lottoNum[0] = lottoNum[3];
			lottoNum[3] = min;
		}
		if(lottoNum[0] > lottoNum[4]) {
			int min = lottoNum[0];
			lottoNum[0] = lottoNum[4];
			lottoNum[4] = min;
		}
		if(lottoNum[0] > lottoNum[5]) {
			int min = lottoNum[0];
			lottoNum[0] = lottoNum[5];
			lottoNum[5] = min;
		}
		if(lottoNum[1] > lottoNum[2]) {
			int min = lottoNum[1];
			lottoNum[1] = lottoNum[2];
			lottoNum[2] = min;
		}
		if(lottoNum[1] > lottoNum[3]) {
			int min = lottoNum[1];
			lottoNum[1] = lottoNum[3];
			lottoNum[3] = min;
		}
		if(lottoNum[1] > lottoNum[4]) {
			int min = lottoNum[1];
			lottoNum[1] = lottoNum[4];
			lottoNum[4] = min;
		}
		if(lottoNum[1] > lottoNum[5]) {
			int min = lottoNum[1];
			lottoNum[1] = lottoNum[5];
			lottoNum[5] = min;
		}
		if(lottoNum[2] > lottoNum[3]) {
			int min = lottoNum[2];
			lottoNum[2] = lottoNum[3];
			lottoNum[3] = min;
		}
		if(lottoNum[2] > lottoNum[4]) {
			int min = lottoNum[2];
			lottoNum[2] = lottoNum[4];
			lottoNum[4] = min;
		}
		if(lottoNum[2] > lottoNum[5]) {
			int min = lottoNum[2];
			lottoNum[2] = lottoNum[5];
			lottoNum[5] = min;
		}
		if(lottoNum[3] > lottoNum[4]) {
			int min = lottoNum[3];
			lottoNum[3] = lottoNum[4];
			lottoNum[4] = min;
		}
		if(lottoNum[3] > lottoNum[5]) {
			int min = lottoNum[3];
			lottoNum[3] = lottoNum[5];
			lottoNum[5] = min;
		}
		if(lottoNum[4] > lottoNum[5]) {
			int min = lottoNum[4];
			lottoNum[4] = lottoNum[5];
			lottoNum[5] = min;
		}
		System.out.print(lottoNum[0]+" "+lottoNum[1]+" "+lottoNum[2]+" "+lottoNum[3]+" "+lottoNum[4]+" "+lottoNum[5]);
		
		int sameNum = 0;
		
		for(int i = 0; i < choiceMyNum.length; i++) {
			for(int j = 0; j < lottoNum.length; j++) {
				if(choiceMyNum[i] == lottoNum[j]) {
					sameNum++;
				}
			}
		}
		System.out.println();
		System.out.println("������ ������ �� " + sameNum);
		
	}// m e
}// c e
