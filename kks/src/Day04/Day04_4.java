package Day04;

public class Day04_4 {// c s

	public static void main(String[] args) {// m s
		
		// ������ ���� 1�� => ����
		// �迭 [ Ư��(�ε���) �������� ���� ]
			// 1.index [�ε���] : ����Ǵ� ���� ��ȣ[0�� ����~]
			// 2. [ ] : ���ȣ�� ����Ѵ�
			// 3. ������ �ڷ����� ���� ������ ����
		
		//���� 
			// 1. �ڷ���[] �迭��;			2.�ڷ��� �迭��[];
		//������ ȣ��
			//1. �迭��[�ε�����ȣ] : �ش� �ε�����ȣ�� ������ ȣ��
			
		int[] score = { 83, 90, 87 };
			//1. int[]  :int �� ������ �������� �����Ҽ� �ִ� �迭����
			// 2. score : �迭�̸� [ �ƹ��ų� ]
			// 3. { ������1, ������2, ������3~~~~} : �迭�� ���� �߰�
		//*83, 90, 87 �̶�� int �� ������ 3���� �����ϴ� �迭 ����
			//83 => 0�� �ε����� ����
			//90 => 1�� �ε����� ����
			//87 => 2�� �ε����� ����
		
		//�迭 ���
		System.out.println("score "+ score);//�迭�̸� ȣ�� => �޸� �ּҰ�
		System.out.println("score [0] " + score[0]);
		System.out.println("score [1] " + score[1]);
		System.out.println("scroe [2] " + score[2]);
		
		System.out.println();
		
		//  �ݺ����� �迭�� Ȱ��
		int sum = 0; // �ʱ�ȭ
		for(int i = 0;i<3;i++) {
			//i�� 0���� 2���� ���� 
			System.out.println("score ["+i+"] " + score[i]);
			sum += score[i];// �迭�� [�ε�����ȣ]
		}
		System.out.println();
		System.out.println("���� " + sum);
		double ave = (double) sum / 3;
		System.out.println("��� " + ave);
		
	}// m e

}// c e
