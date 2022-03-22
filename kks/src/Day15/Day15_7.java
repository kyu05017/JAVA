package Day15;

import java.awt.Toolkit;

public class Day15_7 {
	
	public static void main(String[] args) {
		/*
		// p. 601 : ������ ����
			// 1. sleep() : �־��� �ð����� �Ͻ�����
				// �ð� ���� : �и��� ( 1000 / 1�� )
				// �Ϲ� ���� �߻� : �Ͻ����� ���¿��� �־��� �ð��� �Ǳ����� ������ [ ���� ] �� �ȴٸ� ó���ڵ带 �̸� �־��
			// 2. yield() : �纸  : �ٸ� �����忡�� ���� �纸 [ ��� ���� ]
			// 3. join() : �ٸ��������� ���Ḧ ��ٸ� 
		
		// p. 602 . Thread.sleep(������) ����
				// �ð� ���� : �и��� ( 1000 / 1�� )
				// �Ϲ� ���� �߻� : �Ͻ����� ���¿��� �־��� �ð��� �Ǳ����� ������ [ ���� ] �� �ȴٸ� ó���ڵ带 �̸� �־��
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10; i++) {
			toolkit.beep();
			System.out.println("����");
			try {Thread.sleep(50);} catch (Exception e) {} // �������� 3�ʰ� ���� 
		}
		
		// p. 604 ~ 606 yield()
		
		// 1. ��ü ���� 
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		// 2. ������ ����
		a.start();
		b.start();
		// 3. �����带 3�ʰ� �Ͻ�����
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		// 4. ������ A�� work�� ����
		a.work = false; // -> Thread.yeild();
		// 5. �����带 3�ʰ� �Ͻ�����
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		// 6. ������ A�� work�� ���� 
		b.work = true; // �ٽ� ����
		// 7. �����带 3�ʰ� �Ͻ�����
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		// 8. �Ѵ� ����
		a.stop = true;
		b.stop = true;
		// 9.  a.stop(); // �������� �ʴ� �޼ҵ� [ �������� �������� ���� ] 
		*/
		// p. 607 join();
		// ��ü ����
		SumThread sumThread = new SumThread();
		// ���� ����
		sumThread.start();
		// ������.join()  = main ������� sum������ join = �ϳ��� ������
		try {
			sumThread.join();
		}
		catch(Exception e) {
			
		}
		System.out.println(" 1~ 100 �� : "+ sumThread.getSum());
		// * main �����尡 join  �������� : 0
			// sumthread�� ���ϱ⸦ ������ ���� main ������ sum ���
		// * main �����尡 join ������ : 5050
	}
}
