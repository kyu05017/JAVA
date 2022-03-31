package Day01_to_Day21.Day09;

public class Car {
	
	//필드
	Tire frontLeftTire = new Tire("앞왼쪽",6);
	Tire frontRightTire = new Tire("앞오른쪽",2);
	Tire backLeftTire = new Tire("뒤윈쪽",3);
	Tire backRightTire = new Tire("뒤오른쪽",4);
	//생성자
	public Car() {//기본생성자
		
	}
	//메소드
	int run() { // 자동차 회전 [ 모든 타이어객체가 1회씩 회전 ] 메소드
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) { 
			// 타이어가 회전을 하는데 결과값이 false면 펑크
			stop(); 
			return 1;
		}
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4; 
		}
		return 0; // 리턴이 0이면 펑크x
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
