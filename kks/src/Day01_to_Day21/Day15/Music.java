package Day01_to_Day21.Day15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Music extends Thread{

	@Override
	public void run() {
		
		
		// 병열처리 실행
		while(true) { // 음악클래스 내 스레드가 실행중
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
