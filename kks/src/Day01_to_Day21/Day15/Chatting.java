package Day01_to_Day21.Day15;

public class Chatting implements Runnable{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("ä��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
