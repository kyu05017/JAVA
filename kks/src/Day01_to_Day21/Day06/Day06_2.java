package Day01_to_Day21.Day06;

public class Day06_2 {

	public static void main(String[] args) {
		
		// 1. 클래스 생성후 -> 객체 생성
		Car myCar = new Car();
			// 1. Car   : 클래스 명
			// 2. myCar : 객체이름 [ 아무거나 ]
			// 3. new   : 메모리 할당 연산자
			// 4. Car() : 생성자???????????
		
		// 2. 객체 내 필드를 호출	
		//객체이름.맴버이름
		System.out.println("제작회사 :" + myCar.company);//myCar 객체내 필드 접근
		System.out.println("모델명  :" + myCar.model);//myCar.model : model 필드 호출
		System.out.println("색깔   :" + myCar.color);//myCar.color : color 필드 호출
		System.out.println("최고속도:" + myCar.maxSpeed);//myCar.maxSpeed : maxSpeed 호출
		System.out.println("현재속도:" + myCar.speed);//myCar.speed : speed 호출
		
		
		// 3. 객체내 필드 값 변경
		myCar.speed = 60;
			//myCar 객체네 speed 필드 호출해서 60이라는 데이터 대입
		System.out.println("수정된 속도 : " + myCar.speed);
		
		// 새로운 자동차 객체 생성 [ 독립적으로 움직임 ]
		Car yourcar = new Car();
		yourcar.maxSpeed = 1000;
		System.out.println("2번째 자동차 :" + yourcar.maxSpeed);
	}

}
