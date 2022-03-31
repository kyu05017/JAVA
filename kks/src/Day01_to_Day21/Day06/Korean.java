package Day01_to_Day21.Day06;

public class Korean {
	// * Korean 클라스 선언
	
	//1.필드
	String nation = "한국"; // 국가 변수에 미리 대한민국을 대입
	String name; // 이름 변수에는 초기화 x 디폴트 값은 [ null ]
	String ssn; // 주민등록변호 변수에는 초기화 x 디폴트 값은 [ null ]
	
	
	// 중요한 변수 [ 돈, 개인정보 ] 은 은닉화가 필요함
	
	// 2. 생성자
		//  조건1) 생성자 이름 == 클래스이름 동일
		//  조건2) 외부로부터 들어오는 매개값[인수] 선언
		//  조건3) 동알한 생성자 이름을 가질수 있다
			//오버로딩 : 동일한 이름일경우 재정의[실행]
	
	// 1. 빈생성자 [ 보안이 낮고 실무에서는 안쓴다 ]
	Korean() {
		
	}
	
	// 2. 필드 한개를 가지는 생성자
	Korean(String name) {
		this.name = name;
	}
	
	// 3. 필드 2개를 가지는 생성자
	Korean( String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	// 4. 필드 3개를 가지는 생성자
	Korean ( String nation,String name, String ssn){
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
		// 내부변수 ( 현재 클래수내 변수 )
		// 매게변수 ( 외부로 부터 들어온 변수 )
		// 내부변수 == 매개변수 이름이 동일하면 충돌
		// 네부변수 푯; 빙밥
			//this : 현재 클래스내 필드호출!
		
	}
	
}
