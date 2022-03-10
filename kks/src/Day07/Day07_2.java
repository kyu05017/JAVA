package Day07;

import java.util.Scanner;

public class Day07_2 {

	public static void main(String[] args) {
		// p.223 ~ 224 : 리턴값이 없는 메소드[ void ]
		
		// 1.객체 선언
		Scanner sc = new Scanner(System.in);
		Car myCar = new Car();
		int input = sc.nextInt();
		
		// 2. 메소드 선언
		myCar.setGas(input);
		//	 myCar.gas = 5;
		
		// 3.메소드 호출 [ 인수x 반환 = 참 또는 거짓 ]
		if (myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			// 4. 메소드 호출 [ 인수 x ]
			myCar.run();
		}
		/*
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		*/
		// 3.메소드 호출 [ 인수x 반환 = 참 또는 거짓 ]
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}
		else {
			System.out.println("gas를 주입하세요");
		}
	}

}
