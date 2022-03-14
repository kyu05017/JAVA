package Day09;

public class DmbCallPhone extends Callphone {
	// 서브클래스가 슈퍼클래스 선택 => extends 슈퍼클래스
		// 서브클래스가 슈퍼클래스 맴버 사용가능
	
	//필드
	int channel;
	
	//생성자
	public DmbCallPhone(String model, String color, int channel) {
		super();
		this.model = model;		//this.필드명
		this.color = color;		//this.필드명
		// * 현재 클래스의 없는 필드 임으로 슈퍼클래스내 맴버 호출
		
		this.channel = channel; //this.필드명
	}
	//메소드
	//반환값이 없고 인수값을 받지 않는다.
	void turnOnDmb(){
		System.out.println("채널 "+channel + "번 DMB방송 수신을 시작힙니다.");
	}
	// 반환값이 없고 인스 channel을 받는다.
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 "+channel+"번으로 변경합니다.");
	}
	//반환값이 없고 인수값을 받지 않는다.
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
}
