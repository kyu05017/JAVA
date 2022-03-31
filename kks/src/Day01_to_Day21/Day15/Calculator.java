package Day01_to_Day21.Day15;

public class Calculator {
	
	
	private int memory;
	
	//메소드
	public int getMemory() {
		return memory;
	}
	// 메소드 
		// 문제점 : 스렌드1이 100 넣고 ( 스레드2가 50을 넣어서 [ 값 변경 ]  )  50 출력
		// 문제 해결 [ synchronized : 동기화 ]
			// 스레드1이 100 넣고 ( 스레드 2이 대기중 ) 100 출력
			// 스레드2가 스레드 1이 메소드 종료 까지 대기상태
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		System.out.println(Thread.currentThread().getName() + " :  " + this.memory);
	}
	
	
}
