package Day01_to_Day21.Day14;

public class CalcThread extends Thread {
	
	public CalcThread(String name) {
		// 인수로 받은 데이터로 스레드 이름 정하기
		setName(name); 
	}

	// 멀티스레드 구현
	@Override
	public void run() {
		for(int i = 0; i < 200000000; i++) {
			
		}
		System.out.println(getName());
	}

}
