package Day08;

public class Day08_1 {

	public static void main(String[] args) {

		//p.238
			// 정적변수
			// 공용적인 데이터 = 프로그램 전반적 사용되는 메모리
		
		// 1. 클래스의 필드,메소드 접근방법
			// (스태틱 맴버가 아닐때 )1. 객체를 생성 -> 객체.(도트) 맴버이름
				// 객체가 생성돌때 new 연산자로 객체 메모리(멤버) 메모리 할당 
		Calculator calculator = new Calculator();
		System.out.println("객체를 이용한 맴버 접근 : " + calculator.pi);
		
			//(스태틱 맴버일때) 1. 클래스명 .맴버
				// 클래스 로딩 되고 메소드 영역에 static 변수에 메모리 할당
		System.out.println("객체없이 맴버접근 : " + Calculator.pi);
		
		double result = 10*10*Calculator.pi;
									// 클래스명.정적변수명
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
