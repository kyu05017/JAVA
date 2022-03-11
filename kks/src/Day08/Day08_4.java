package Day08;

public class Day08_4 {
	
	//p. 267 ~ 268 : Setter , Getter 메소드
		// 필드 private 로 사용되는 경우가 많다
		// 외부에서 필드에 접근할수 없다.
		// 목적 : 외부에서 필드에 직접접근 제한하고 메소드를 통한 필드 접근 [ 간점 접근 ] 
		//Setter 메소드 : 필드 데이터 변경
		//Getter 메소드 : 필드 데이터 호출
	
	
	
	
	
	public static void main(String[] args) {
		
		// 1. 객체호출
		Car myCar = new Car();
		// 2. 객체 메소드 호출 
		myCar.setSpeed(-50);
		// 3. 객체네 메소드 호출
		System.out.println("현재속도 :" + myCar.getSpeed());

		
		myCar.setSpeed(60);
		
		System.out.println("현재속도 :" + myCar.getSpeed());
		
		if(!myCar.isStop()) { //정지상태가 아니면
			// ! 부정연산자 [ true > false ] [ false > true ]
			myCar.setStop(true);
		}
		System.out.println("현재속도 :" + myCar.getSpeed());
	}

}
