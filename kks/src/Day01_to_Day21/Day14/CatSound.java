package Day01_to_Day21.Day14;

public class CatSound extends Thread{
	
	// ¿Á¡§¿«
		@Override
		public void run() {
			for(int i = 0; i < 5; i++) {
				System.out.println("æﬂøÀ" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		}
}
