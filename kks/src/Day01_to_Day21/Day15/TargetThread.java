package Day01_to_Day21.Day15;

public class TargetThread extends Thread{
	
	// ����ó�� 
	@Override
	public void run() { // ������ ���� : NEW : ��ü �����Ȱ� ��Ƽ������ ������ 
		for(long i = 0; i <= 1000000000; i++) {} // ������ ���� RUNNABLE
		
		try { // 1.5�� ��� �и���
			Thread.sleep(1500);
		} catch (Exception e) { // ����� ����  : WAITTING : ��Ƽ ������ �Ͻ�����
		}
		
		for(long i = 0; i <= 1000000000; i++) {}
	}// ���� ������ ������ ���� : TERMINATED

}
