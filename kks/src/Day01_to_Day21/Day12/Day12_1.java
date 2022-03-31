package Day01_to_Day21.Day12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day12_1 {
	
	public static void main(String[] args) throws IOException {
		
		// p. 496 String Class
			// String 문자열
			// 1. java.lang 패키지 [import]소속
			// 2. 객체인데 자동 리터럴 [ 객체가 자동 생성 ]
		
		//String name1 = new String("이름"); 둘은 사실상 같다 String name1 = "이름" // 자동 객체 생성
		
			// 3. 13개의 생성자 [ 문자열 , 바이트열 등 ]
		//String name3 = new String
			// 4. 외부[ 파일, 네트워크 등]로 받은 데이터는 보통 바이트열 
		
		// 바이트 -> 문자 변환 가능 이유
			// 1. 바이트 > +- 127
			// 2. 아스키ㅋ코드 => 0 or 1  조합된 7자리 => 0101011 => 2의 7승 => 128문자 가능
				// 바이트 -> 아스키 코드 [ 영문 / 특수문자 1바이트, 한글 2바이트]
		
			// 기계어 : 0 or 1 
			// 7자리 기계어  : 아스키코드 [1000001 == 65 == A ]
		
		
		byte[]bytes = {72,101,108,108,111,32,74,97,118,97};
					//H	  e   l    l   o 공란  J  a  v  a
		//바이트 배열을 문자열로 변환 
		String str1 = new String(bytes);
		//확인
		System.out.println("바이트 배열  "+str1);
		
		// 4. 특정 위치부터 변환
		String str2 = new String(bytes,5,5);
		
		System.out.println("5번째 인데스부터 5개만 변환"+str2);
		// * 
		// p.498 예제2
			// System.out : 시스템클래스내 출력필드
			// System.in  : 시스템클래스내 입력필드
		byte[] bytes2 = new byte[100];
		
		System.out.print("입력 :");// 출력필드내 print 메소드
		// 메소드 호출하는 방법
			// 1. 객체를 생성후에 . 연산자를 이용한 메소드 호출
			// 2. static 필드 / 메소드는 객체없ㅇ; 클래스명.필드/메소드

		int readByteNo = System.in.read(bytes2);
			// 외부통신 : 자바프로그램외[ 키보드, 파일, 네트워크 등 ] 입출력 일반예외
		
		// 키보드 입력 ------> 스트림[ 바이트 통신] ------> 컴퓨터
		
		String str3 = new String(bytes2,0,readByteNo-2);
		System.out.println("입력받은 바이트 : "+Arrays.toString(bytes2));
		// 결과값
		//[98, 13, 10,..........
		// b, 엔터, 캐리지리턴 : 커서를 다시 앞으로 보내줌
		
		System.out.println("입력받은 바이트 > 문자열 : "+ str3);
		
		
			//Scanner 클래스 [ system.in] 으로 부터 입력 받은 바이트를 객체로 저장
		Scanner scanner = new Scanner(System.in);
			
		scanner.next(); // 바이트 > 문자열 변환
		scanner.nextInt(); //바이트 > 정수형  변환
		scanner.nextDouble(); // 바이트를 실수형으로 변환
		
		
	}
	
}
