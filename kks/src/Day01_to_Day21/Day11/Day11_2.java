package Day01_to_Day21.Day11;

public class Day11_2 {
	// p. 422
		// 컴퓨터의 하드웨어 문제를 에러 [ 실행불가능 ]
		// 사용자의 잘못된 조작 or 개발자의 잘못된 코딩의 에러는 예외
		// 종류 : 1일반예외 2.실행예외
			// 일반예외 : 컴파일 실행전에 예외검사 [ 개발자에게 강제 예외처리 = 외부처리(실행전) ]
			// 실행예외 : 컴파일 샐행후에 예외검사 [ 개발자의 경험의 판단해서 예외처리 ]
		// 예외처리
			// 목적 : 에러가 발생하면 프로그램은 종료된다. [ 안전성의 문제 ]
			// 만약에 예외가 발생하면 대체 코드가 실행됨 [ 프로그램이 종료되지 않게 ]
	
	public static void main(String[] args) {
		
		String date = null;
		try { //NullPointerException
		System.out.println(date.toString()); // Object클래스 매소드 : toString() : 객체 정보 분석 
				// 실행전에는 에러가 없다.
		// 에러가 발생하는 이유 : null 은 메모리 할당이 없기 때문에 객체 정보출력 불가능
		}
		catch(NullPointerException e) {
			System.out.println("예외방생 :" + e);
		}
		String[] arr = new String[2]; // 문자열 2개 저장하는 배열
		try {//ArrayIndexOutOfBoundsException
			// 예외가 발생할거 같은 코드
			
			arr[0] = "a";
			arr[1] = "b";
			arr[2] = "c";
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//만약에 예외가 발생하면 실행되는 코드
			arr[0] = "a";
			arr[1] = "b";
			System.out.println("예외방생 :" + e);
		}

		try{
			String data1 = "100";
			String data2 = "a100";
			int value1 =Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			//Integer.parseInt(문자열); > 문자열을 숫자로
						// "100" > 100 [o] "a100" > a100[x]
			int result = value1 + value2;
			System.out.println(result);
		}
		catch(NumberFormatException e) {
			System.out.println("예외방생 :" + e);
		}
		
		// p. 429
		
		String 문자열 ="유재석"; // 자바 클래스중 하나
		Object 슈퍼클래스;	//자바 클래스내 최상위 클래스
		슈퍼클래스 = 문자열; // 자식 > 부모 [ 가능 ]
		문자열 = (String)슈퍼클래스; // 부모 > 자식 [ 불가능] [ 직접처리 ]
			//강제형변환
	


	}
}
