package Day15;

public class Music extends Thread{

	@Override
	public void run() {
		
		// ����ó�� ����
		while(true) { // ����Ŭ���� �� �����尡 ������
			System.out.println("���� �����");
			
			try {
				Thread.sleep(500); // 0.5�ʰ� �Ͻ�����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
