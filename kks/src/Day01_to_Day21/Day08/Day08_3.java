package Day01_to_Day21.Day08; // AB 클래스와 다름

public class Day08_3 {

	public static void main(String[] args) {

		// 패키지 : 폴더 기능 [ 클래스 식별 ] 
			// 하위패키지 : 패키지명.하위패키지명
		
		// import : 현패키지 제외한 다른 패키지내 클래스 호출
			// 클래스파일 상단에 작성
			// * : 모든 클래스	
			// 클래스 자동 완성시  -> 해당 클래스 import가 자동생성
		
		// 접근제한자
			//public : 모든 곳에서 [접근]호출이 가능 
			//private : 현 클래스 내에서만 [접근]호출 가능
			//protected : 동일한 패키지 내에서만 [접근]초풀가능
				// * 자식 클래스 패키지 ---> 부모 클래스 패키지
			//default(생략=기본값) : 동일한 패키지() 내에서만 [접근]호출가능
			
		// 클래스 설계 관례
		// *필드는 private 
		// 생성자는 public / protected
		// 메소드 선택 일반적으로 private / public
		
		
	}

}
