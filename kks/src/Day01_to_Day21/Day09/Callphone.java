package Day01_to_Day21.Day09;

public class Callphone { // 클래스 선언
	
	//필드
	String model;
	String color;
/////////////////////////////////////////////////////////////////////////////////////////////////////
	//생성자
	public Callphone() {
		
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////
	//메소드 [ void만 return 생략 가능하다 ]
	//받는 인수도 없고 반환하는 타입도 없다
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전월을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	// 반환 타입은 없지만 인수를 받음
	void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	void receveVoice(String message) {
		System.out.println("상대방 : "+ message);
	}
	
	//받는 인수도 없고 반환하는 타입도 없다
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}
