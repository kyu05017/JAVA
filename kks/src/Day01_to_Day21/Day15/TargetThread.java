package Day01_to_Day21.Day15;

public class TargetThread extends Thread{
	
	// 병열처리 
	@Override
	public void run() { // 스레드 상태 : NEW : 객체 생성된고 멀티스레드 실행전 
		for(long i = 0; i <= 1000000000; i++) {} // 스레드 상테 RUNNABLE
		
		try { // 1.5초 대기 밀리초
			Thread.sleep(1500);
		} catch (Exception e) { // 스헤드 상태  : WAITTING : 멀티 스레드 일시정지
		}
		
		for(long i = 0; i <= 1000000000; i++) {}
	}// 런이 끝나구 스레드 상태 : TERMINATED

}
