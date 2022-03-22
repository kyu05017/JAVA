package Day15;

public class Chatting implements Runnable{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("Ã¤ÆÃ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
