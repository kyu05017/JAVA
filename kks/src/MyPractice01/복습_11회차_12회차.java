package MyPractice01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import Day11.Board_MainContents;

public class 복습_11회차_12회차 {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Board_MainContents> boardlist = new ArrayList<>();
		try { // 파일을 들여옴
			FileInputStream inputStream = new FileInputStream("D:/KKS/자바/a.txt");
			
			byte[] bytes = new byte[1024]; // 1 . 바이트 배열 선언
			inputStream.read(bytes); // 2. 모든 바이트를 읽어와서 바이트열에 저장 
			String file = new String(bytes); // 3. 바이트를 문자열로 변환
			String[]list = file.split("\n"); // 4. 문자열 자르기
			
			for(String temp : list) { // 배열내 하나 씩 꺼내옴
				String[] filed = temp.split(",");// 5. 문자열 자르기 
			}
			
		}
		catch(Exception e) {
			
		}
		try { //파일을 내보냄
			FileOutputStream outputStream = new FileOutputStream("D:/KKS/자바/a.txt");
			// 2. 파일에 작성할 내용 [ 한줄씩 ]
			for(Board_MainContents temp : boardlist) {
				String contents = temp.getTitle() +","+temp.getContens()+","+temp.getPassword()+","+temp.getWriter()+","+temp.getViewcount()+","+temp.getDate()+"\n";
				outputStream.write(contents.getBytes());
			}
			
			// 3. 내용[문자열] -> 바이트열 변환 [ 외부통신 > 스트림 [바이트] ]
			
			// 4. 내보내기 write()
			
			
		}
		catch(Exception e) {
			
		}
		
		// 스캐너가 아닌 입력방법
		byte[] bytes2 = new byte[100];					// 바이트배열을 만듬
		int input2 = System.in.read(bytes2);			//정수로 입력을 받음
		String input2_1 = new String(bytes2,0,input2-2);//입력받은 것을 문자열로 변경 엔터와 커서를 옮겨줌
		
		System.out.println(input2_1);
		
		try {
			String str = "안녕하세요";
			// 1. 인코디타입 [ 인코딩/ 디코딩] : 변환 방식
			// 1. EUC_KR [ 한글 / 영문 : 한글 2바이트 ]
			byte[] bytes21 = str.getBytes("EUC_KR"); // 일반 예외 발생
			System.out.println("EUC_KR 길이: "+bytes21.length);
			String str2 = new String(bytes21,"EUC_KR");
			System.out.println("바이트열 -> 문자열: "+str2);
			
			// 2. UFT-8 [ 전세계 용어 : 한글 3바이트 ]
			byte[] bytes3 = str.getBytes("UTF8"); // 일반 예외 발생
			System.out.println("UTF8 길이: "+bytes3.length);
			String str3 = new String(bytes3,"UTF8");
			System.out.println("바이트열 -> 문자열 : "+str3);
			
		} catch (Exception e) {

		}
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		
		if(subject.indexOf("자바") != -1) { // 인덱스는 0번부터 시작 [ -1 인덱스가 없다 ]
			System.out.println("자바와 관련된 책입니다.");
		}
		else {
			System.out.println("자바와 관련 없다.");
		}
		
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
		
	}
}
