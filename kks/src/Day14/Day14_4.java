package Day14;

import java.awt.*;

public class Day14_4 {
	
	public static void main(String[] args) {
		
		// p .576
			// ���μ��� : �ü�������� ���� ���� �ϳ��� ���ø����̼� 
			// �ü���� ���μ��� �ʿ��� �޸� �Ҵ� [ �ڹ� �޸� ����x �ü���� ����]
		
			// �̱� ������ : �ڵ��� �о��ִ� �帧�� 1�� [ ���� �޼ҵ� ] 
			// ��Ƽ ������ : �ڵ带 �о��ִ� �帧 ������ = [ ���θ޼ҵ� �� ������ ]
		
			// ���� : ����� �帧������ / �����尡 �ϳ��� ������( �ü���� �Ҵ�) ó��
				// ������� : �ڵ� 1 -> �ڵ�2 -> �ڵ�3 -> �ڵ�4 -> �ڵ�5
			//Thread Ŭ���� ( ���ο� ������ ) VS Main �޼ҵ� ( ���� �����尡 ���� )
		/*
		 *		�ڵ�1
		 * 		>		
		 * 		�ڵ�2		�ڵ�3	
		 * 
		 * 		�ڵ�4 	�ڵ�5
		 * 
		 */
		// p. 581 ����1)
			// �̱۽�����
			// 0.5�� �������� �Ҹ� ����
			// 0.5 �� �������� �� ���
		
		Toolkit toolkit = new Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5; i++) {
			toolkit.beep();//�Ҹ� �޼ҵ�
			try { 
				Thread.sleep(500);
			}
			catch (Exception e) {
			}
		}
		for(int i = 0; i<5; i ++) {
			System.out.println("��");
		}
		try {
			Thread.sleep(500);
		}
		catch(Exception e){
			
		}
		
	}
	
}
