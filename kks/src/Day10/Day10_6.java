package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day10_6 {
	
	// 주기억장치 	: 메모리 : RAM 프로그램 실행시에만 저장 메모리
	// 보조기억장치 : HDD,SDD,USB,CD : 프로그램 파일 구성 [영구저장]
	// 파일처리 	: 자바내 메모리를 --> 컴퓨터[pc]
	// DB처리 	: 자바네 메모리를 --> DB 서버로[pc] 
		// 스트림(Stream) : 프로그램과 외뷰[키보드,파ㅏ일,네트워크등] 통신
			//통신단위 : byte
 		// Fileoutputstream =  파일출력
			// 객체명.writer(바이트열);
		// fileinputstream = 파일 입력
			// 객체명.read(바이트배열);
		// String 클래스
			// 문자열.equlas() : 문자열 비교 메소드
			// 문자열.getBytes() : 문자열 > 바이트열 변환
			// new String (  바이트 배열 ) : 바이트배열 > 문자열
	
	public static void main(String[] args) throws IOException   {
										// 던지기 예외 처리를 넘김
		Scanner scanner = new Scanner(System.in);
		String aa = scanner.next();
		// 파일출력 [ 파일 - > 자바 ]
		FileOutputStream fileOutputStream = new FileOutputStream("D:/KKS/자바/"+aa+".txt");
		FileOutputStream 파일출력 = new FileOutputStream("D:/KKS/자바/a.txt");
		
		String contents = "자바에서 입력된 데이터";
		파일출력.write(contents.getBytes() );
		
		String contents2 = "Hello, world";
		fileOutputStream.write(contents2.getBytes() );

		// 파일입력 [ 자바 - > 입력 ]
		FileInputStream 파일입력 = new FileInputStream("D:/KKS/자바/a.txt");
		FileInputStream fileInputStream = new FileInputStream("D:/KKS/자바/"+aa+".txt");
		//FileInputStream : 파일입출력 클래스
		// 파일경로/파일명.확장자  // txt : 메모장
		byte[] bytes = new byte[1000];
		byte[] bytes2 = new byte[1000];
		파일입력.read(bytes);
		fileInputStream.read(bytes2);
		System.out.println("파일내용 : " + new String(bytes));
		System.out.println("파일내용 : " + new String(bytes2));
		
		//파일작성
		
	}
}
