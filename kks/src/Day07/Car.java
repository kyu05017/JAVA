package Day07;

public class Car {
	//클래스 선언
	
	// 1.필드 
	int gas;
	// 2.생성자
	
	// 3.메소드	
		// 1. gas를 외부로 부터 입력받아서내부로 저장하는 메소드 역할
	void setGas(int gas) {//인수 o 반환 x
	//리턴 x 메소드명 (인수1) { 내부변수 = 외부변수 }
		this.gas = gas;
	// 내부변수와 외부변수가 동일할때 구별하는 방법!!
			//this.필드명 : 내부{현재 클래스파일} 뱐수
	}
	
		//2. 내부변수 gas에 데이터 확인 [ 0 = 가스없다] [1이상=가스있다]
	boolean isLeftGas() {//인수x 반환 o
	//논리반환 메소드명() {실행문 반환값(참/거짓) }
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
		// 3. gas 0일때까지 실행하는데 실행할때마다 가스1씩 감소
			// gas 0 면 종료
	void run() {//인수 x 반환 x
		while(true) { // 무한루프 [ 종료 : 1. break; 2.return(메소드를 종료 무한루프가 꺼짐) 3.스위치변수
			if(gas > 0) {
				System.out.println("달립니다. (gas잘량 : "+gas+")");
				gas--; // gas 변수 1씩 차감
			}
			else {
				System.out.println("멈춥니다. (gas잔량 : "+gas +")");
				//break; // 반복문 탈출 [종료]
				return; // 함수 탈출
			}
		}
	}
}
