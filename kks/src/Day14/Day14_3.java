package Day14;

public class Day14_3 {
	
	public static void main(String[] args) {
		
		// 메소드 = 함수
			
			// 메소드 호출 방법 [ 1. 객체 2. static ] 
		
		// 1. 객체
		controller controller = new controller();
		controller.carIn1("1234");
		// 2. static 
		controller.carIn2("1234");
			// 인수 : 메소드 안으로 들어가는 데이터 [ 메소드가 동일한 자료형으로 받음 ]
			// 반환 : 베소드 밖으로 나가는 데이터 [ 메소드 호출후 반환 받음 ] 
		
		// 1. 인수 o 반환 o
		
		boolean result = controller.carIn2("1234");
			// 메소드에 1234문자를 인수로 보내고 반환값을 boolean true 로 받음
		
		// 2. 인수 o 반환 x
		controller.carOut("1234");
			// 메소드에 1234문자를 인수로 보내고 반환이 없다
		
		// 3. 인수 x 반환 o
		String result2 =  controller.saleList();
			// 메소드에 인수가 없고 메소드결과를 저장
		
		// 4. 인수 x 반환 x 
		controller.carlist();
			// 메소드에 인수 없이 보내고 메소드의 반환값도 없다.
		
		// *@Override
			// 동일한 메소드명 동일한 인수 의 메소드가
			// 슈퍼클래스 or 인터페이스에 존재할 경우 재정의
			// 상속 : 메소드를 물려받았는데 > 메소드 재구현 [ extends ]
			// 인터페이스 : 추상메소드에 구현하기 -> 동일한 메소드에 구현 [ implements ] 
		// *추상메소드
			// 선언부만 존재 구현부는 없음 [ { } 중괄호가 없다 ]
		// *static / final
	}
}
