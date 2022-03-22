package Day15;

public class StatePrintThread extends Thread{
	
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); // 현 스레드 상태 호출
			System.out.println("타겟 스레드 상태 : " + state);
			
			if(state == Thread.State.NEW) { // new : 스레드 생성상태 뜻.
				targetThread .start();
			}
			
			if(state == Thread.State.TERMINATED) { // TERMINATED : 스레드 종료상태 뜻
				break;
			}
			try {Thread.sleep(500);}catch (InterruptedException e) {}
		}
	}
}
