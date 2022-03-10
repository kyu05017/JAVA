package Day07;

public class Car2 { // 설계
	// 1. 필드
	int speed;
	// 2. 생성자
	
	// 3. 메소드
		// 1. 현재 필드값을 반환해주는 클래스
	int getSpeed() { //인수x 반환o
		return speed;
	}
		// 2. 출력 메소드
	void keyTurnon() {//인수 x 반환 x
		System.out.println("키를 돌립니다.");
	}
		// 3. 스피드 증가 메소드 [ 최대 50 ]
	void run() { // 인수 x  반환 x
		for(int i = 10; i <= 50; i+=10) {	
			// i 는 10 부터 50 까지 10씩 증가함 > 5회
			speed = i; // i 를 speed 에 대입
			System.out.println("달립니다. (시속: " + speed + "km/h )");
		}
	}
}
