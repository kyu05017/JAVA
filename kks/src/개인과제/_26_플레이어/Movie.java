package ���ΰ���._26_�÷��̾�;

public class Movie extends Thread{
	
	static boolean stop = true; // ���� ���� ����
	
	public void Moviestop(boolean stop) {
		this.stop= stop;
		if(stop) {
			System.out.println("���� �����");
		}
		else {
			System.out.println("���� ����");
		}
		
	}
	
	@Override
	public void run() {
		
		while(this.stop) {
			System.out.println("���� �����");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
