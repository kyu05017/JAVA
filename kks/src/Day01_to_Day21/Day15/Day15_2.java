package Day01_to_Day21.Day15;

public class Day15_2 {
	
	public static void main(String[] args) {
		
		// �������̽� 
			// * ������ ������ ���� ( ���� �ٸ� ) ��ü�� ���� ����
			// 1. �������̽� �ɹ�
				// 1. ��� �ʵ� 2. �߻� �޼ҵ� 3. default 4. ����
			// 2. ��� ���
				// public class Ŭ������ implements �������̽���
				// �ʼ�! : �߻�޼ҵ� ����
			// 3. ������ü ����
				// * Ŭ������ ���� �޸𸮸� �Ҵ� ������ 
			// 4. �͸�ü ����
				// �������̽����� ���� ����
				
		// �� 1) ���� ��ü ����� 	
		GamePad pad1 = new Game();
		// �������̽��� ��ü�� = new ������Ŭ������();
		GamePad pad3 = new Game();
		
		// �� 2) �͸� ��ü �����
		GamePad pad2 = new GamePad() {
			@Override
			public void A_bottom() {System.out.println("����");}
			@Override
			public void B_bottom() {System.out.println("���");}
			@Override
			public void C_bottom() {System.out.println("��ų");}
		}; // ���� ��
		
		GamePad pad4 = new GamePad() {
			@Override
			public void C_bottom() {}
			@Override
			public void B_bottom() {}
			@Override
			public void A_bottom() {}
		};// ���� ��
		/////////////////////////////////////////////////////////////////////
		// * �������̽��� ������ü ��ü
			// ���ӱ�ü
		pad1 = new Game2();
		
		Game3 g3 = new Game3();
		g3 = new Game();
		g3 = new Game2();
		//////////////////////////////////////
		//  ���		: ��� [ extends ]	VS	�������̽� [ implements ] 
		// �����		:			1		VS	����[ ������ ]
		// override : ������ [ ���� ]		VS	���h [ ���� ]
		// ������ 	: �θ� <  -   �ڽ�		VS	�θ�  <- �ڽ�
		// ���� 		: 	���� [ �������� ] 	VS	������ ������ ���δٸ� Ŭ������ ����
		//								VS  �߻�
		
		
	}
}
