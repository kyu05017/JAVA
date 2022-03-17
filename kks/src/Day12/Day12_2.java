package Day12;

public class Day12_2 {
	
	public static void main(String[] args) {
		
		// p. 499 String method
		
		// charAt()
		
		String ssn = "012345-223456";
		
		char sex = ssn.charAt(7); // 7번 인덱스의 문자를 추출
		
		switch(sex) { // switch 제어문 [ switch(검사대상) ]
			case '1' :	// sex 변수의 값이 문자 1일 경우
			case '3' :	// 2일경우
				System.out.println("남자 입니다."); // 메세지를 띄움
				break; // 멈춤
			case '2' : // sex 변수의 값이 문자 2일경우
			case '4' : // 4일경우
				System.out.println("여자 입니다"); // 메세지를 띄움
				break; // 더이상의 조건이 없음으로 브레이크는 빼도 된다.
		}
		// 자바 메모리 [ JVM ]
			// 스택 메모리		: 지역변수 (new 연산자를 사용하면 new는 힙에 저장되지만 스택은 힙메모리의 메모리 주소를 저장함 ] 
			// 힙 메모리		: 객체
			// 메소드 메모리	: 
		
		// p.501  equals() : 문자열 비교
			// 기본자료형 사용하는 변수는 연산자 사용가능 [ == ]
			// 문자열(String)을 비교하는 경우는 equals 를 사용해야함 [ equals ]
		// 1.문자열 선언하는 방식 두가지
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";// 객체는 new 연산자가 필수 이지만 String만 new 연산자를 빼도됨 자동으로 생성
		// 2. 문자열 비교
		
		if(strVar1 == strVar2) { // 문자열의 주소값을 비교 [ == 힙주소를 비교]
			System.out.println("같은 String 객체를 참조");
		}
		else {
			System.out.println("다른 String 객체를 참조");
		}
		// 3.문자열 비교
		if(strVar1.equals(strVar2)) { // [문자열으 비교함 [ 힙주소 안에 있는 실질적인 정보를 비교 ]
			System.out.println("같은 문자열을 가짐");
		}
		else {
			System.out.println("다른 문자열을 가짐");
		}
		
		// p. 502
			// getBytes();
				// 문자열을 바이트열로 변환시켜줌
		
		String str = "안녕하세요";// 영문은 1 바이트 한글은 2바이트 총 5글자로 10바이트다.
		
		byte[] bytes1 = str.getBytes(); // 문자열 > 바이트열로 변환
		
		System.out.println(bytes1.length); // 배열명.length > 배열의 길이 필드
		System.out.println(bytes1); // 메모리의 주소값
		
		String str1 = new String(bytes1);// 바이트열을 문자열로 변환
		
		System.out.println(str);
	
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		try {
			// 1. 인코디타입 [ 인코딩/ 디코딩] : 변환 방식
			
			// 1. EUC_KR [ 한글 / 영문 : 한글 2바이트 ]
			byte[] bytes2 = str.getBytes("EUC_KR"); // 일반 예외 발생
			System.out.println("EUC_KR 길이: "+bytes2.length);
			String str2 = new String(bytes2,"EUC_KR");
			System.out.println("바이트열 -> 문자열: "+str2);
			
			// 2. UFT-8 [ 전세계 용어 : 한글 3바이트 ]
			byte[] bytes3 = str.getBytes("UTF8"); // 일반 예외 발생
			System.out.println("UTF8 길이: "+bytes3.length);
			String str3 = new String(bytes3,"UTF8");
			System.out.println("바이트열 -> 문자열 : "+str3);
			
		} catch (Exception e) {

		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		// p. 504
		// .indexOf
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		
		if(subject.indexOf("자바") != -1) { // 인덱스는 0번부터 시작 [ -1 인덱스가 없다 ]
			System.out.println("자바와 관련된 책입니다.");
		}
		else {
			System.out.println("자바와 관련 없다.");
		}
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println();
		// p.505 
		// length() : 문자열의 길이
		// 길이의 수를 구해서 길이가 맞는지 틀리지 판단함 예) 비밀번호 길이 유효성 검사
		String ssn2 = "7306241230123"; //문자열
		int length = ssn2.length(); // 문자열의 길이를 정수형으로 가지고옴
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		}
		else {
			System.out.println("주민번호 자리가 틀립니다.");
		}
		
		System.out.println("-------------------------------------------------------------");
		
		// p.506
			// 문자열 대치 replace()
			// replace("기존문자","새로운문자") : 문자를 변경
		String oldstr = "자바는 객체지향언어 입력입니다.";
		String newstr = oldstr.replace("자바", "Java");
							// 문자열.replace("기존문자","새로운문자");
		System.out.println(oldstr);
		System.out.println(newstr);
		// 언어를 불러왔을시 변경이 필요할경우 사용
				
		System.out.println("-------------------------------------------------------------");
		
		// p.507
			// 문자열 잘라내기 substring() vs split()
			//
		String ssn3 = "880815-1234567";
		//substring()
		String firstnum = ssn3.substring(0,6); // 시작 인댁스 ~ 끝인덱스
		System.out.println(firstnum);
		String num2 = ssn3.substring(7); // 인덱스 붙처~ 끝까지
		System.out.println(num2);
		
		//slpit
			//"880815-1234567" "-" 기준으로 자르기 2조각 -> 매열반환
			// [0] : 880815 [1]: 1234567
		System.out.println("앞부분 "+ ssn3.split("-")[0]);
		System.out.println("뒷부분 "+ ssn3.split("-")[1]);
		
		System.out.println("-------------------------------------------------------------");
		// p. 508
			// 문자열.toLowerCase() > 영문 [ 소문자로 변환 ]
			// 문자열.toUpperCase() > 영문 [ 대문자로 변환 ]
		
		// p. 509
			// 문자열.trim() : 앞뒤 공백제거 [띄어쓰기는 안된다]
			// 외부로 부터 데이터를 받을때는 사용한다.
		
		// p. 510
			// 문자열.valueOf() : 기본차입[int,double 등]  ->  문자열로 변환
		String str10 = String.valueOf(10); // int 10을 String 10으로 변환
		String str11 = String.valueOf(10.5); // double 형 10.5를 문자형 10.5로 변환
		String str12 = String.valueOf(true); //boolean형 true 를 문자열로 변환
		String str13 = 10+""; // int형을 String으로 변환 [ + 는 연결연산자 ]
		
		System.out.println(str10 + 10);// 문자 + 문자 : 연결
		System.out.println(str11 + 10);
		// if(str13) 오류 : str13은 boolean에서 문자열로 변환되었기 때문에 사용불가능
		System.out.println(str12);
		System.out.println(str13);
		
		
		
		
	}
}
