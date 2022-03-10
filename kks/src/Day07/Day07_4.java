package Day07;

public class Day07_4 {
	
	//p.229
	public static void main(String[] args) {
		
		// 1. 객체선언
		Car2 myCar = new Car2();
		
		// 2. 자동차 시동 메소드 호출
		myCar.keyTurnon();//인수x반환x
		
		// 3. 자동차 전진 메소드 호출
		myCar.run();//인수x 반환x
		
		// 4. 현재 스피드 확인 메소드 호풀
		int speed = myCar.getSpeed(); // 인수x 반환o
		System.out.println("현재속도" + speed + "km/h");
	}

}
