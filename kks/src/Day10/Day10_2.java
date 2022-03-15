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
		Searchable rc3;
		//인터페이스명 객체명
			// 2. 인터페이스에 텔레비전 클래스 메모리 할당
		rc = new Television();
		rc3 = new Television();
		// 3. 인터페이스 실행
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.setMute(false);
		rc3.search("naver");
		rc.turnOff();
		RemoteControl.changeBettery();
		System.out.println();
		
		// 4. 인터페이스내 클래스 메모리 할당
		rc = new Audio();
		// 5. 인터페이스 실행
		rc.turnOn();
		rc.setVolume(8);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		RemoteControl.changeBettery();
		
		System.out.println();
		rc = new Television();
		rc.turnOff();
		System.out.println();
		// 익명 구현 객체
		
		RemoteControl rc2 = new RemoteControl() {
		//인터페이스명 객체명 = new 인터페이스명 
			
			@Override
			public void turnOn() {
				System.out.println("리모컨을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("리모컨을 끕니다");
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("현재 오디오 볼륨 : "+volume);
			}
		};
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(156465135);
		
		// 디폴트 메소드 호출
		rc2.setMute(true); // 인터페이스에서 이미 구현이 되어있다. 일반 메소드와 차이가 없다
		RemoteControl.changeBettery(); //객체없이 사용 가능
		//메모리 할당 받는 방법
			//회부 클래스/ 내부클래스 내 필드(저장기능), 메소드(저장가능), 저장  사용시
		//1. new 연산자 
		//2. static 연산자
		
	}

}
