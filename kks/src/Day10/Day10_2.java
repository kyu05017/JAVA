package Day10;

public class Day10_2 {
	
	public static void main(String[] args) {
		
		
		// 인터페이스
			// 목적 : 동일한 목적하에 동일한 기능을 수행
				// 서로 다른 클래스간의 객체들은 동일한 목적으로 조작
			// 추상메소드 : 선언[o], 정의[x]
				//인터페이스에서 선언하고 각 클래스들이 구현한다. [ 다형성 ]
			// 예) 인터페이스 : 방향키, A버튼, B버튼 
			//		철권게임 클래스
					// A버튼 : 공격
					// B버튼 : 방어
			//		축구게임 클래스
					// A버튼 : 슈팅	
					// B버튼 : 방어
		
		// 1.인터페이스 객체 선언 
		RemoteControl rc;
		//인터페이스명 객체명
			// 2. 인터페이스에 텔레비전 클래스 메모리 할당
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.turnOff();
		RemoteControl.changeBettery();
	}
}
