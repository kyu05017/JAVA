package Day01_to_Day21.Day13;

import java.util.Random;

public class Day13_1 {
	
	public static void main(String[] args) {
		
		// p.534 : Math 클래스 (java.lang패키지)  [ 수학관련 메소드 ] 객체없이 사용가능 static 
		
		System.out.println("절대값 : "+ Math.abs(-5));
		System.out.println("절대값 : "+ Math.abs(-3.14));
		

		System.out.println("올림값 = " +  Math.ceil(5.3)); // 소수점 첫째자리에서 올림
		System.out.println("올림값 = " + Math.ceil(-5.3));

		System.out.println("버림값 = " + Math.floor(5.3)); // 내림값
		System.out.println("버림값 = " + Math.floor(-5.3));
		
		System.out.println("최대값 = " + Math.max(5, 9));	// 두개 밖에 안됌
		System.out.println("최대값 = " + Math.max(5.3, 2.5));
		
		System.out.println("최소값 = " + Math.min(5, 9)); 
		System.out.println("최소값 = " + Math.min(5.3, 2.5));

		System.out.println("랜던값 = " + Math.random()); // 0 부터 1 사이에 Double형 난수 발생
		// vs
		Random random = new Random();
		System.out.println("랜덤 클래스 랜던값 = " + random.nextInt());
		
		System.out.println("가까운 정수의 실수값 = " + Math.rint(5.3)); // 반올림 [ 5 이상 올림 ] 실수값
		System.out.println("가까운 정수의 실수값 = " + Math.rint(5.7));		
		
		System.out.println("가까운 정수의 정수값 = " + Math.round(5.3)); // 반올림 [ 5 이상 올림 ] 정수값
		System.out.println("가까운 정수의 정수값 = " + Math.round(5.7));
		
		// 8. 특정 소수점에서 반올림
		double value = 12.3456;
		double temp1 = value*100;
		long temp2 = Math.round(temp1);
		double value2 = temp2/100.0; // 100이라고 쓰면 Int 값이기 때문에 안된다. [ 일반적으로 숫자만 입력하면 기본적으로 Int형으로 익식한다 ] 
		System.out.println("계산할 값 " + value);
		System.out.println("100을 곱한 값 "+ temp1);
		System.out.println("반올림 한 값 "+ temp2);
		System.out.println("소수 3째자리 반올림 = " +value2);
		
		// 10. p536 : 주사위
		System.out.println("0~1 사이 실수형 = " + Math.random() ); // 0~1
		int num = (int)(Math.random() * 6)+1; // 0~0.999999999999 * 6 > 0~6 +1 > 1~7
			// (기본자료형) 값/변수 = 강제형변환 ( 큰상자 > 작은상자 : 데이터 손실 )
			// double > int : 강제형 변환시 소수점이 짤림
		System.out.println("주사위의 눈 = " + num);
		System.out.println("주사위의 눈 = " +((int)(Math.random() * 6)+1));
		
		int num2 = (random.nextInt(6) + 1); // 0~5 +1 > 1~6 
		// 형변환이 필요 없다.
		System.out.println("주사위의 눈 = " + num2);
		System.out.println("주사위의 눈 = " + (random.nextInt(6) + 1));
		
		
	}	
	
}
