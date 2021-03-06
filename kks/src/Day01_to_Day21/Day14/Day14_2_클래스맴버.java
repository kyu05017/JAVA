package Day01_to_Day21.Day14;

public class Day14_2_클래스맴버 {
	
	
	// 클래스 맴버
	
	// 필드
		// 1. 접근 제한자
			// * static / final 
		//private			: 현재 클래스에서 사용
			// 목적 : 필드의 직접 접근을 제한 [ 필드에 저장/호출시 데이터 검사 (무결성 유지) ] 
		//public 			: 몸든 클래스에서 사용 가능
		//default (생략시)	: 동일 패키지 내에서 사용 가능
		//protected 		: 동일 패키지 내에서 사용 가능 [ 단 서로다른 패키지의 super 클래스 접근 가능 ] 
		// 2. 자료형 ( 클래스 , 기본자료형 )
			// 1. 기본자료형 [ int , double , boolean 등등]
			// 2. 클래스 [ 사용자가 만든 클래스 ] : 회원클래스, 게시판클래스 제품클래스 등등 
			// 3. 클래스 [ 미리 만들어진 클래스 ] : API : (String Scanner ArrayList 등등)
			// 4. 인터페이스 
			// 5. 배열[] 
		// 3. 변수명 ( 객체명 )
			// * 본인이 원하는대로 하되 중복이름X
			// 1. 클래스 명의 소문자 [ Scanner scanner , Date date ]
	
		// * 변수 객체( new ) , 인터페이스 , 배열  
	
	// 생성자 [ 객체 생성시 초기값 = 처음값 ]
			// 1. 접근제한자
			// 2. 생상자 이름 = 클래스 이름 [ 만일 다를경우 오류 ]
			// 3. 인수 	
				// * 필요에 따른 인수 선택
					// 1. 빈생성자 [  관례적 목적 : 메소드 호출용 ( 메소드 호출시 객체 필요 ) ]
					// 2, 모든 필드를 받는 생성자 [ 풀생성자 ] : 모든 필드 저장 / 호출
					// 3. 특정 필드 생성자 [ 몇가지의 필드만 저장 ] 
						// ** 상황에 따른 객체 생성시 들어가는 필드
						// * this 
	
	
	// 메소드 [ 1. 코드의 묶음 2. 재활용( 재활용 ) ]
		// 1. 접근 제한자 [ private, public, default, protected ] 
		// 2. 반환 자료형 [ void(없다.), int, boolean, double , 인터페이스 , 배열 ]
		// 3. 메소드 이름 [ 아무거나 하되 왠만하면 소문 ] 
		// 4. 인수 [ 매게 변수 ] : 메소드 호출시 메소드 안으로 들어오는 데이터
			// 객체명.메소드( 3 ) -> 메소드 (int 변수명 )
				// * 인수의 자료형을 동일하되 변수명은 자유
								
	
	
}
