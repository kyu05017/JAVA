package Day01_to_Day21.Day15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Music extends Thread{

	@Override
	public void run() {
		
		
		// ����ó�� ����
		while(true) { // ����Ŭ���� �� �����尡 ������
			Date date = new Date();
			SimpleDateFormat nowdate = new SimpleDateFormat("yyyy - MM - dd HH : mm");
			String nowTime = nowdate.format(date);
			System.out.println(nowTime);
			try {
				Thread.sleep(1000); 
			} 
			catch (InterruptedException e) {
			}
		}
		
	}
}
