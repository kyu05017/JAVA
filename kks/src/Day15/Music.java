package Day15;

public class Music extends Thread{

	@Override
	public void run() {
		
		// 병열처리 실행
		while(true) { // 음악클래스 내 스레드가 실행중
			System.out.println("음악 재생중");
			
			try {
				Thread.sleep(500); // 0.5초가 일시정지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
