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
				// 1. Thread Ŭ���� [ ��� 1 �� ]
					// 1. ���� Ŭ���� extends Thread 
					// 2. run() �޼ҵ� �������̵� [ ������ ]
					// 3. ��ü ����
					// 4. ��ü .start();
					// * start() �޼ҵ� ȣ��� run �޼ҵ� ����
				// 2. Runnalbe �������̽� 
					// 1. ���� Ŭ������ implements  Runnalbe
					// 2. ���̶�� �޼ҵ带 ���� @overrride
					// 3. �ܺο��� ���� ��ü�� �����Ѵ�
					// 4. thread ��� ��ü ������ �����ڿ� ������ü�� �־��ش�
					// 5. thread Ŭ���� ��ü �� start() �޼ҵ� ���� 
					// * start �޼ҵ�� run �޼ҵ尡 ��Ƽ ������� �۵� �ȴ�.
					// run() ���� �޼ҵ�� main �޼ҵ带 ���ܻ� ���ο� ������ �����
				// 3. �͸�ü [ �������̽��� ���� ���� [ 
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

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		System.out.println("���� ������-------------------------");

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
		
		System.out.println("��Ƽ������ �������̽�-------------------------");
			// p. 852 ����2 
				// * ��Ƽ ������ ( main  ������, beeptesk ��ü )
		// 1. �������̽��� ���� ��ü
		Runnable beepTesk = new BeepTesk();
		// 2. Thread Ŭ���� ��ü ������ �����ڿ� ������ü �ֱ�
		Thread thread = new Thread(beepTesk);
		// thread ��ü �� start() �޼ҵ� ȣ��
		thread.start();
		
		// ����
		for(int i = 0; i < 5 ;i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
		System.out.println("��Ƽ������ ���-------------------------");
		// p. 854 ����3
			// 1. ������ ��ü ���� 
		Thread thread2 = new BeepThread();
		// ����Ŭ���� = ����Ŭ������ ������ [ ������ ]
				//�θ� <== �ڽ� [ �ڵ� ����ȯ ]
				//�θ� ==> �ڽ� [ ���� ����ȯ ]
		
		// 2. ���ص� ��ü�� start 
			 // run �޼ҵ� ȣ�� ���� [ ��Ƽ������ ���� ]
		thread2.start();
		
		// ���
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
		System.out.println("��Ƽ������ �͸�ü-------------------------");
		
			// �������̽��� �����
				// 1. Ŭ�������� implements�� �� �Ŀ� ����  ===> ���� ��ü
				// 2. �������̽��� new �����ڸ� ���� �߻�޼ҵ� ���� ==> �͸� ��ü [ Ŭ���� ���� x ]
		
			// * �͸� ������ ��ü
			Runnable runnable = new Runnable() {
							// �������̽��� new( �޸� �Ҵ� )
							// * �޸� �Ҵ��ϱ� ���ؼ� �߻�޼ҵ带 ���� ����!!!!!
							// * �߻�޼ҵ带 ���� ���ҽÿ� �͸�ü ���� �Ұ� !!
				
				
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++ ) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

					}
				}
			}
		}; 
		
		Thread thread3 = new Thread(runnable);
		thread3.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

		System.out.println("�� �������� �̸�--------------------------------");
		
		System.out.println("main �޼ҵ� �ȿ� �ִ� ������ �̸� " + Thread.currentThread().getName()); //  Ŀ��Ʈ ������� ���� ������;
												// Thread.currentThread() : �� �ڵ带 �о��ִ� ������ ȣ��
												//.getName() : ������ �̸� ȣ�� 
												//.setNmae() : ������ �̸� ����
		System.out.println("������1 �̸� "+thread.getName());
		System.out.println("������1 �̸� "+thread2.getName());
		System.out.println("������1 �̸� "+thread3.getName());
		
		System.out.println("�������� �켱����--------------------------------");
		
		// p. 590
		
		for(int i = 1; i <= 10; i++) {
						// 10ȸ �ݺ�ó��
			// i�� 1�϶� ������� ������ ��ü ���� = thread 4
			//  * ���� �����Ǿ ��ȯ�Ҵ� [ �ü�� => �����ٸ� ] 
			// �̹Ƿ� ���� ���� ���� x
			Thread thread4 = new CalcThread("thread" +i);
			
			// �켱����
			if(i != 10) { // 10 �� �ƴϸ� �켱������ ����
				thread4.setPriority(Thread.MIN_PRIORITY);
			}
			else { // �ƴ϶�� �켱 ������ ����
				thread4.setPriority(Thread.MAX_PRIORITY);
			}
			thread4.start();
		}
	}
	
}
