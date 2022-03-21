package Day14;

public class TigerSound extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("¾îÈï" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
