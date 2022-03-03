package Day3;

public class Day03_1 { // c s

	public static void main(String[] args) { //ms
		
		// 1일차 : 출력 , 입력
		// 2일차 : 저장(변수) , 계산(연산)
		//제어문
			// 컴퓨터의 판단력! -> 경우의 수	
			//조건식이 true 이면 실행문 처리
			//형태 
				// 1. IF( 조건[true/false] ) 실행문;
				// 2. IF (조건 ) 실행[참];
					 //ELSE 실행[]거짓;
				// 3. 실행문이 2줄 이상 ( ; 2이상이 이면 { } 로 묶음)
				// 4. 경우의 수가 다수일뗴 [ 조건이 다수일떄 ]
				//	  IF ( 조건 ) { 실행문 참[참1]; }
				//	  ELSE IF ( 조건2 ) { 실행문 [참2]; }
				//	  ELSE IF ( 조건3 ) { 실행문 [참3]; }
				//	  ELSE IF ( 조건4 ) { 실행문 [참4]; }
				//	  ELSE { 실행문 [거짓]; }
				// 5. if  중첩 
				// 	if ( 조건 ) {
				//		if ( 조건 ) { 실행문 [ 참 ]; 
				//	}	else {
				//	else {
				//		if ( 조건 ) { 실행문 [ 참 ]; }
				//		else { 실행문 [ 거짓 ]; }
				//  }
				
		//예제1
		if( 3 > 1 ) System.out.println("예1)  3이 1보다 크다.");
			//만약에 3이 1보다 크면 출력 아니라면 출력을 안한다.	
			//true 면 실행
		
		//예제2
		if ( 3 > 5 ) System.out.println("예2) 3이 5보다 크다.");
			//만약에 3이 5보다 크면 출력 아니라면 출력을 안한다.
		
		//예제3
		if ( 3 > 1 ) System.out.println("예3_1)3이 1보다 크다");
			else System.out.println("예3_2) 3이 1보다 작다");
				//만약에 3이 1보다 크면 에3_1출력 아니라면 예3_2 출력
		
		//예제4
		if ( 3 > 2 ){ //ture 실행문 시작 [ 실행문이 (;) 2개 이상일때 ]
			System.out.println("true"); 
			System.out.println("3이 2보다 크다."); 
			//범위를 중괄호로 묶어야 한다. 실행문이 여러게 있을때.
		} // true 실행문 끝 
		else { //false 의 실행문
			System.out.println("True");
			System.out.println("3이 2보다 작다.");
		}//false 실행뭄 끝
		
		
		//예제5
		if( 3 > 5 ) { // 하나로 취급 결과도 하나 { 묶음 처리 }
			System.out.println("예제1)3이 5보다 크다"); //실행 x
		}
		else if (3 > 4) {
			System.out.println("예제2)3이 4보다 크다"); // 실행 x
		}
		else if (3 > 3) {
			System.out.println("예제3)3이 3보다 크다"); // 실행 x
		}
		else if (3 > 2) {
			System.out.println("예제4)3이 2보다 크다"); // 실행 
		}
		else {
			System.out.println("예제5)ture는 없다."); // 실행 x
		} 
		//
		if( 3 > 5 ) { // 조건이 전부 개별처리 { 결과가 다수 나올수 있다}
			System.out.println("예제1)3이 5보다 크다"); //실행 x
		}
		if (3 > 4) {
			System.out.println("예제2)3이 4보다 크다"); // 실행 x
		}
		if (3 > 3) {
			System.out.println("예제3)3이 3보다 크다"); // 실행 x
		}
		if (3 > 2) {
			System.out.println("예제4)3이 2보다 크다"); // 실행 
		}
		else {
			System.out.println("예제5)ture는 없다."); // 실행 x
		} 
		
		//else if 는 if 문 부터 else 로 끝날때 까지 패키지로 묶여서 하나라도 True 가 나오면 끝나지만
		//if로 계속 나워 쓰면 컴퓨토의 효울이 줄어든다. 
		//다만 결과가 여러개일 경우는 if로 나눠쓰면 된다.
	} //m e
}//ce
