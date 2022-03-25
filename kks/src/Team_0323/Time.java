package Team_0323;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time extends Thread{

	@Override
	public void run() {
		

		while(true) {
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
