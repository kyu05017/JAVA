package Day01_to_Day21.Day12;

import java.io.IOException;

public class Day12_3 {
	
	public static void main(String[] args) throws IOException {
		
		// 도서 검색 프로그램 
			// [조건]
			// 1. 입력받기 [ System.in.read() ]
			// 2. String 배열을 이용한 도서명을 여러개 저장
			
		
		String[] books = {"된다! 네이버 플로그&포스트","스프링 부트 실전 활용 마스터",
			"Tucker의 Go 언어 프로그래밍" , "혼자 공부하는 C 언어"	
		};
		// 3. 검색기능, 수정기능
			// 검색기능 : 특정 문자를 입력받아 도서내 포환된 문자가 있으면 무두 출력
			// "언어" 검색 -> "Tucker의 Go 언어 프로그래밍" / "혼자 공부하는 C 언어"	
			// '수정' 수정 -> 수정할 도서명 일부 입력받아 > 포함된 도서출력해서 번호 선택후에
				// 수정할 도서명의 일부 문자/ 새로운 문자 입력받아 - 수정완료

		
		while(true) {
			System.out.println("도서");
			
			for(String temp : books) {
				System.out.println(temp);
			}
			System.out.println("1)도서검색 2)도서수정");
			
			
			byte[] bytes1 = new byte[100];
			int input = System.in.read(bytes1);
			String input1 = new String(bytes1,0,input-2);
			
			if(input1.equals("1")) {
				System.out.println("도서검색)");
				System.out.println("도서명 입력 : ");
				byte[] bytes2 = new byte[100];
				int input2 = System.in.read(bytes2);
				String search = new String(bytes2,0,input2-2);
				System.out.println("검색한 단어 : "+ search);
				// 1번 방법
				/*
				for(String temp : books) {
					if(temp.indexOf(search) != -1) {
						// indexOf 메소드 -1 반환되는 경우는 동일한 단어가 없을경우 [ 검색 x]
						System.out.println(temp);
					}
				}
				*/
				// 2번 방법
				for(String temp : books) {
					if(temp.contains(search)) { // contains("찾을문자") : 문자열내 찾을문자가 있다true/ 없다false 로 판단
						System.out.println(temp);
					}
				}

			}
			else if(input1.equals("2")) {
				System.out.println("도서수정)");
				System.out.println("도서명 입력[일부] : ");
				byte[] bytes2 = new byte[100];
				int input2 = System.in.read(bytes2);
				String input2_1 = new String(bytes2,0,input2-2);
				int i = 0;
				for(String temp : books) {
					if(temp.indexOf(input2_1) != -1) {
						// indexOf 메소드 -1 반환되는 경우는 동일한 단어가 없을경우 [ 검색 x]
						System.out.println("도서번호 "+(i)+" 교재명"+temp);
					}
					i++;
				}
				
				System.out.println("도서번호 선택 : ");
				byte[] bytes3 = new byte[100];
				int input3 = System.in.read(bytes3);
				String input2_2 = new String(bytes3,0,input3-2);
				int bNo = Integer.parseInt(input2_2);
				System.out.println(" 기존 문자 : ");
				int input4 = System.in.read(bytes3);
				String input2_4 = new String(bytes3,0,input4-2);
				System.out.println(" 바꿀 문자 : ");
				int input5 = System.in.read(bytes3);
				String input2_5 = new String(bytes3,0,input5-2);
				
				books[bNo] = books[bNo].replace(input2_4, input2_5);
				System.out.println(books[bNo]);
				
				

			}
			
			
			
			
		}
		
		
		
	}
}
