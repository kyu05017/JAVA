package Day15;

public class TargetThread extends Thread{
	
	// ����ó�� 
	@Override
	public void run() { // ������ ���� : NEW : ��ü �����Ȱ� ��Ƽ������ ������ 
		for(long i = 0; i < 1000000000; i++) {} // ������ ���� RUNNABLE
		
		try { // 1.5�� ��� �и���
			Thread.sleep(1500);
		} catch (InterruptedException e) {
		}
		
		for(long i = 0; i < 1000000000; i++) {}
	}

}
