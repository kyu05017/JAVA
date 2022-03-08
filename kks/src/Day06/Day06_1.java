package Day06;

public class Day06_1 {

	public static void main(String[] args) {
		
		//클래스
			// 1. 클래스 : 설계도
			// 2. 객체(인스턴스) : 설계도 기반으로 메모리 할당받은 변수
			
				//예1) 붕어빵 틀 = 클래스
					// 밀가루 ,물, 팢, 슈크림 => 필드 [ 속성 = 상태 ]
					// 굽기, 뒤집기, 판매 = > 메소드 [ 행동 ]
					// 붕어빵 틀로부터 여러개 붕어빵 생성
						//서로다른 붕어빵이 생성됨 [ 붕어빵1...붕어빵2...]
				
				//예2) 회원 = 클래스
					// 아이디, 비밀번호, 생년월일, 성별, 이메일, 전화번호 = > 필드
					// 회원가입, 아이디찾기, 비밀번호찾기, 탈퇴, 로그인 => 메소드
						// 서로다른 회원이 생성이 된다. [ 회원1~~회원2~~~]
		
		//예1) p.195
	
		Student student1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student student2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

	}

}