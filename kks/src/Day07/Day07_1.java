package Day07;

import java.util.Scanner;

public class Day07_1 { // c s

	public static void main(String[] args) {
		
		//메소드 호출하는 방법
			// 1.메소드가 존재하는 클래스의 객체가 필요
			// 2. 객체명.메소드명()
				// EX) scanner.nextInt();
					// .(도트) : 접근연산자 ( 필드나 메소드 호출시 )
		
		
			
		// 1.객체 선언
		Calculator myCalc = new Calculator();
		Scanner sc = new Scanner(System.in);
		//클래스명 객체명[이름] = 메모리할당 생성자();
		
		// 2.메소드 호출
		myCalc.powerOn();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 3. 메소드 호출 [ 인수 2개 ]
		int result1 = myCalc.plus(a, b);
			// * plus메소드에 5와 6을 전달후에
			// * 11이라는 결과값을 받아서 result1에 저장
		System.out.println("result1 : " + result1);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		// 4. 메소드 호출
		
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		// 5. 메소드 호출
		myCalc.powerOff();
	}// m e

}// c e
