package Day01_to_Day21.Day15;

public class Day15_2 {
	
	public static void main(String[] args) {
		
		// 인터페이스 
			// * 동일한 목적의 여러 ( 서로 다른 ) 객체를 조작 위함
			// 1. 인터페이스 맴버
				// 1. 상수 필드 2. 추상 메소드 3. default 4. 정적
			// 2. 사용 방법
				// public class 클래스명 implements 인터페이스명
				// 필수! : 추상메소드 구현
			// 3. 구현객체 생성
				// * 클래스로 부터 메모리를 할당 받으면 
			// 4. 익명객체 생성
				// 인터페이스에서 직접 구현
				
		// 예 1) 구현 객체 만들기 	
		GamePad pad1 = new Game();
		// 인터페이스명 개체명 = new 구현할클래스명();
		GamePad pad3 = new Game();
		
		// 예 2) 익명 객체 만들기
		GamePad pad2 = new GamePad() {
			@Override
			public void A_bottom() {System.out.println("공격");}
			@Override
			public void B_bottom() {System.out.println("방어");}
			@Override
			public void C_bottom() {System.out.println("스킬");}
		}; // 구현 끝
		
		GamePad pad4 = new GamePad() {
			@Override
			public void C_bottom() {}
			@Override
			public void B_bottom() {}
			@Override
			public void A_bottom() {}
		};// 구현 끝
		/////////////////////////////////////////////////////////////////////
		// * 인터페이스내 구현객체 교체
			// 게임교체
		pad1 = new Game2();
		
		Game3 g3 = new Game3();
		g3 = new Game();
		g3 = new Game2();
		//////////////////////////////////////
		//  상속		: 상속 [ extends ]	VS	인터페이스 [ implements ] 
		// 연결수		:			1		VS	다중[ 여러개 ]
		// override : 재정의 [ 수정 ]		VS	구햔 [ 정의 ]
		// 다형성 	: 부모 <  -   자식		VS	부모  <- 자식
		// 목적 		: 	연장 [ 빠른설계 ] 	VS	동일한 목적의 서로다른 클래스를 조작
		//								VS  추상
		
		
	}
}
