package Day01_to_Day21.Day15;

public class ThreadA extends Thread{
	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("Thread A �۾�����");
			}
			else {
				Thread.yield();
			}
		}
		System.out.println("Thread A ����");
	}
	
	
	

}
