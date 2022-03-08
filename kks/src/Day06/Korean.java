package Day06;

public class Korean {
	// * Korean 클라스 선언
	
	//1.필드
	String nation = "한국"; // 국가 변수에 미리 대한민국을 대입
	String name; // 이름 변수에는 초기화 x 디폴트 값은 [ null ]
	String ssn; // 주민등록변호 변수에는 초기화 x 디폴트 값은 [ null ]
	
	// 2. 생성자
		//  조건1) 생성자 이름 == 클래스이름 동일
		//  조건2) 외부로부터 들어오는 매개값[인수] 선언
	
	// 1. 빈생성자
	Korean() {
		
	}
	
	// 2. 필드 2개를 가지는 생성자
	Korean( String n, String s) {
		name = n;
		ssn = s;
	}
	
	
}
