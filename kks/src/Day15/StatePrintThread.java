package Day15;

public class StatePrintThread extends Thread{
	
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); // �� ������ ���� ȣ��
			System.out.println("Ÿ�� ������ ���� : " + state);
			
			if(state == Thread.State.NEW) { // new : ������ �������� ��.
				targetThread .start();
			}
			
			if(state == Thread.State.TERMINATED) { // TERMINATED : ������ ������� ��
				break;
			}
			try {Thread.sleep(500);}catch (InterruptedException e) {}
		}
	}
}
