package Day01_to_Day21.Day14;

public class DogSound extends Thread{

	
	// ¿Á¡§¿«
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("∏€" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
