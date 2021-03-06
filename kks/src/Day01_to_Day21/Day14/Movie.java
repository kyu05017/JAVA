package Day01_to_Day21.Day14;

public class Movie extends Thread{
	
	static boolean stop = true; // 실행 종료 제어
	
	public void Moviestop(boolean stop) {
		this.stop= stop;
		if(stop) {
			System.out.println("영상 재생중");
		}
		else {
			System.out.println("영상 종료");
		}
		
	}
	
	@Override
	public void run() {
		
		while(this.stop) {
			System.out.println("영상 재생중");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
