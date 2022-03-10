package Day07;

public class Calculator2 {
	
	// 1. 필드
	
	// 2. 생성자
	
	// 3. 메소드
		// 1. 실행
	void execute() {//인수x 반환o
		double result = avg(7,10); // 내부에서 메소드 호출
		System.out.println("실행결과 : " + result);
	}	
		// 2. 평균 메소드
	double avg(int x, int y) {//인수o 반환o
		double sum = plus(x,y);
		double result = sum/ 2;
		return result;
	}
		// 3. 더하기 메소드
	int plus(int x,int y) {//인수o 반환o
		int result  = x+y;
		return result;
	}
		// 4. 결과출력 메소드
	
	void println(String message) {//인수o 반환X
		System.out.println(message);
	}
	
}
