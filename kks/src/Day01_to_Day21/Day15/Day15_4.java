package Day01_to_Day21.Day15;

public class Day15_4 {
	
	
	public static void main(String[] args) {
		 
		// 12��  : ������ : �ڵ带 �о��ִ� ����
			// �ڵ� -> ���� -> ���μ��� [ ���α׷� ]
			// ���� : ����ó��
				// main�޼ҵ忡 main ������ ����
		
		// ����� 
			// 1. Thread Ŭ����
			// 2 .Runnalbe Ŭ����
		// run �޼ҵ� : ��Ƽ�������� �����ڵ�
		
		// �� 1 ) ThreadŬ������ ��ӹ޾� ����� ���
		
		Thread mi = new Music();
		
		mi.start(); // run  �޼ҵ� ����
		
		// �� 2 ) Runnable �� ����� ���
		Chatting c1 = new Chatting();
		Thread r1 = new Thread(c1);
		
		r1.start();
		
		
		while(true) { // main �޼ҵ� ������
			System.out.println("���α׷� �۵���");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		// p 591 ����ȭ
			// ��Ƽ ������ ���� ����ȭ ����
		
		
	}
}
