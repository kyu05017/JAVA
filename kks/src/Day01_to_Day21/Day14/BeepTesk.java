package Day01_to_Day21.Day14;

import java.awt.Toolkit;

public class BeepTesk implements Runnable{
	@Override
	public void run() { //Runnable �������̽��� ���޼ҵ� ����
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i =0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); // �Ϲݿ��� ������ ����
			}
			catch (Exception e) {

			}
		}
		

	}
}
