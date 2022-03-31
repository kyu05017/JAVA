package Day01_to_Day21.Day14;

import java.awt.Toolkit;

public class BeepTesk implements Runnable{
	@Override
	public void run() { //Runnable 인터페이스ㄴ 런메소드 구형
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i =0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); // 일반예외 무조건 벌생
			}
			catch (Exception e) {

			}
		}
		

	}
}
