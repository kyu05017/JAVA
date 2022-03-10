package Day07;

public class Calculator {// c s
	
	//클래스 선언
	
	// 1.필드
	
	// 2. 생성자
		//만약에 생성자 선언이 1개도 없으면
		//기본생성자를 자동 추가 됨!! ( 깡통 생성자 )
		//기본생성자 : 매개변수[인수]가 없다.
	
	// 3. 메소드
	void powerOn() { // 인수X=() 반환X=void
		System.out.println("전원을 켭니다.");
		return; // 함수 종료의 의미를 가짐
	}
	// 1. void : 리턴타입 
		// void : 함수가 종료되면서 나가는 데이터가 없다.
			// void 사용시 [return] 생략가능 
			//[ 단 실행부 중간에 사용시 함수종료 ]
	// 2. powerOn : 메소드 이름 [ 아무거나 ]
	// 3. (매게변수[인수]) : 함수로 들어오는 데이터들
	// 4. { 실행코드 } : 함수 실행부
	
	int plus(int x , int y) {//인수O = (x ,y) 반환O = (result)
			// x = 5 , y = 6
		int result = x+y;
		return result;//함수를 호출했던 곳으로 이동 
	}
	// 1. int : 리턴타입[ 함수가 종료되ㅕㄴ서 int형 데이터가 반환 ]
		// 5. return : 반환값;
			// 리턴타입이 int이기 때문에 무조건 int형 데이터
	// 2. plus : 메소드이름 [ 아무거나 ]
	// 3. (int x , int y ) :
		//함수호출시 함수로 들어오는 x와 y 는 int형으로 받기
	// 4. { 실행문 }
	
	double divide(int x, int y) { //인수 o 반환 o
	//리턴타입 메소드명 (인수1, 인수2) 선언문 { 실행코드 return 실수데이터 }
		double result = (double)x/(double)y;
						// (자료명) 변수명 : 강제형변환
							//int형 변수 => double로 변경
								//왜??? 나누기후에 소수점 있을수 있기 때문에
		return result; // 결과값 => 메소드 호출했던 곳으로
	}
	
	void powerOff() { // 인수 x 반환 x
	//리턴타입 메소드명 () {}
		System.out.println("전원을 끕니다.");
		return;
	}
 	
}//c e
