package Day09;

import java.util.Scanner;

public class Day09_1 {// c s
	
	
		
		// p.277 ~ 
			// 1) 3 [ 하나의 클래스로 여러개 객체 생성 가능 ]
			// 2) 4 [ 로컬변수 {} 내에서 선언 (지역변수) ]
			// 3) 4 [ 반드시x ]
			// 4) 3 [ 클래스의 맴버 선언 순서는 상관없다. ]
			// 5) 1 
				// 1. 객ㅊ체는 생성자x 인스턴스 생성자o
				// 2. this.필드명
				//	  this.메소드명
				//    this() : 빈 생성자 호출
				//    this( 데이터, 데이터 ) : 생성자
	
			// 6) void : 메소드가 종료되면서 반환값이 없다.
				// 4. override : 동일한 메소드를 재정의
			// 7) 2
	

			// 8) 2
					//static : 정적 맴버 [ 생성자에서는 static ]
					// 객체없이 클래스를 통해 접근 가능  <------> new 연산자 객체로 접근
			
			// 9) 2 : 생성자에서 초기화 불가능!
					//final : 상수 [ 수정불가 ] 
					// 상수는 관례적으로 대문자를 쓴다.
	
			// 10) 4 [ 단 이클리습, 인텔리제이 같은 에디터는 자동변경 ]
	
			// 11) 3 / default : 해당패키지 / private : 해당클래스
	
			// 12) (1)필드, (2)생성자, (3)메소드
				// {} 있으면 생성자 혹은 메소드
				// 클래스명과 이름이 동일하면 생성자
				// 클래스명과 이름이 동일하지 않으면 메소드
	
			// 13)
			/*
			 * 1) String name;
			 * 2) String id;
			 * 3) String password;
			 * 4) integer age;
			 */
	
			// 14)
			/*
			 * 생성자 선언시 : 클래스 이름 동일
			 * Member(String name, String id) {
			 * 		this.name = name;
			 * 		this.id = id;
			 * }
			 */
	
			// 15)
			/*	
			 *  매개변수 : 인수 : 메소드 호출시 메소드로 들어오는 데이터
			 * 로그인 메소드
			 * boolean login(String id, String password) {
			 * 	if(id.equals("hong") && password.equals("12345")) {
			 * 		//아이디가 hong 이면서 패스워드가 12345면 true 반환
			 * 		return true;
			 * 	}
			 * 	return false;
			 * }
			 * 로그아웃 메소드 [ 반환타입 메소드명( 인수1, 인수2) {...} ]
			 * void logout(String id){
			 * 	System.out.println("로그아웃 되었습니다");
			 * }
			 */
	
			// 16) [ new ] [ 단기 ]
			/*	객체를 통한 메소드 호출
			 * [ 동일한 이름으로 메소드 선언이 가능하고 [ 단 서로 다른 인수[매개변수] 사용 ]]
			 * void println( int x){ // 외부로 부터 int형 변수를 인수로 받아 출력
			 * 		System.out.println(x);
			 * }
			 * void println( boolean x){ // 외부로 부터 boolean형 변수를 인수로 받아 출력
			 * 		System.out.println(x);
			 * }
			 * void println( double x){ // 외부로 부터 double형 변수를 인수로 받아 출력
			 * 		System.out.println(x);
			 * }
			 * void println( String x){ // 외부로 부터 String형 변수를 인수로 받아 출력
			 * 		System.out.println(x);
			 * }
			 */
	
			//17) [ static ] [ 장기 ]
			/*
			 *  객체를 생성하지 않고 메소드를 호출하는 방법
			 * static void println( int x){ // 외부로 부터 int형 변수를 인수로 받아 출력
			 * 		System.out.println(x);
			 * }
			 * static void println( boolean x){ // 외부로 부터 boolean형 변수를 인수로 받아 출력
			 * 		System.out.println(x);
			 * }
			 * static void println( double x){ // 외부로 부터 double형 변수를 인수로 받아 출력
			 * 		System.out.println(x);
			 * }
			 * static void println( String x){ // 외부로 부터 String형 변수를 인수로 받아 출력
			 * 		System.out.println(x);
			 * }
			 */
	
			//18) pass
	
			//19) 모바일 뱅크로 대체
		
			//20) 
	
	
	
	public static void main(String[] args) {// m s	
		Scanner scanner; //객체
		Scanner scanner2 = new Scanner(System.in); // 인스턴스화

	}// m e

	int method() {
	//반환타입
		//반환타입의 리턴이 없으면 에러가 뜸. 반드시 존재해야함
		return 1;
	}
	void method2() {
	//반환타입이 void면 리턴이 없어도 된다.
		return; 
	}
	
	
	

}// c e
