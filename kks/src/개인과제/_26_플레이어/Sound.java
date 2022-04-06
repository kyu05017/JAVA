package 개인과제._26_플레이어;

public class Sound extends Thread{
	
	static boolean stop = true; // 실행여부
	
	public Sound() {
	
	}
	
	public void soundstop (boolean stop) {
		this.stop = stop;
		if(this.stop) {
			System.out.println("재생");
		}
		else {
			System.out.println("일시정지");
		}
	}
	
	
	@Override
	public void run() {
		
		while(this.stop) {
			System.out.println("재생중");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	}
}
