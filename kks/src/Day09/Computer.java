package Day09;

public final class Computer extends Calculator{ // final 클래스는 수정이 안됌
			// 서브클래스 extends 슈퍼클래스
	
	//필드
	
	//생성자
	
	//메소드
		// * override 슈퍼클래스의 메소드를 재정의
	//Ctrl + 스페이스바	
	@Override  // 상속준 슈퍼클래스가 가지고있는 메소드 호출
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
}
