package Day01_to_Day21.Day14;

public class Sound extends Thread{
	
	static boolean stop = true; // ���࿩��
	
	public Sound() {
	
	}
	
	public void soundstop (boolean stop) {
		this.stop = stop;
		if(this.stop) {
			System.out.println("���");
		}
		else {
			System.out.println("�Ͻ�����");
		}
	}
	
	
	@Override
	public void run() {
		
		while(this.stop) {
			System.out.println("�����");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	}
}
