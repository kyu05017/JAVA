package Day10;

public interface RemoteControl { //인터페이스 선언
	
	// 맴버 
		// 1. 상수필드		: 고정된 데이터
	public int MAX_VOLUME = 10; // 리모콘의 최대소음
	public int MIN_VOLUME = 0; 	// 리모콘의 최소소음
	
		// 2. 추상메소드**	: 선언o 구현x
			// abstracts : 추상 [ 인터페이스 구현 생략]
	public void turnOn();				// : { } : 중략 [ 구현 x ]
	public void turnOff();				// : 구현 x
	public void setVolume(int volume);	// : 구현 x
	
		// 3. 디폴트메소드	: 선언o 구현o
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		}
		else {
			System.out.println("무음 해제");
		}
	}
	
		// 4. 정적메소드	: 선언o 구현o [  객체없이 사용 가능 ]
	static void changeBettery() {
		System.out.println("리모콘 건전지를 교체합니다.");
	}
}
