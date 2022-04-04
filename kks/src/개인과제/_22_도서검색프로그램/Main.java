package 개인과제._22_도서검색프로그램;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException{
			
	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] books = {"된다! 네이버 플로그&포스트","스프링 부트 실전 활용 마스터",
			"Tucker의 Go 언어 프로그래밍" , "혼자 공부하는 C 언어"};
		byte[] bytes = new byte[100];
		
			
		while(true) {
			bw.write("\n");
			bw.write("도서)) 목록\n");
			bw.write("\n");
			for(String temp : books) {
				bw.write(temp+"\n");bw.flush();
			}
			bw.write("\n");
			bw.write("1)도서검색 2)도서수정 3)종료\n");bw.flush();
			
			int input = System.in.read(bytes);
			String input1 = new String(bytes,0,input-2);
			
			if(input1.equals("1")) {
				bw.write("도서검색) \n");
				bw.write("도서명 입력 : \n");
				bw.flush();
				int input2 = System.in.read(bytes);
				String search = new String(bytes,0,input2-2);
				bw.write("검색한 단어 : "+ search+"\n");
	
				for(String temp : books) {
					if(temp.contains(search)) { 
						bw.write(temp+"\n");
					}
				}
				bw.flush();
			}
			else if(input1.equals("2")) {
				bw.write("도서수정) \n");
				bw.write("도서명 입력[일부] : \n");
				bw.flush();
				int input2 = System.in.read(bytes);
				String input2_1 = new String(bytes,0,input2-2);
				int i = 0;
				for(String temp : books) {
					if(temp.indexOf(input2_1) != -1) {
						bw.write("도서번호 "+(i)+" 교재명"+temp+"\n");
					}
					i++;
				}
				bw.flush();
				bw.write("도서번호 선택 : \n");
				bw.flush();
				int input3 = System.in.read(bytes);
				String input2_2 = new String(bytes,0,input3-2);
				int bNo = Integer.parseInt(input2_2);
				bw.write("기존 문자 : \n");
				bw.flush();
				int input4 = System.in.read(bytes);
				String input2_4 = new String(bytes,0,input4-2);
				bw.write("바꿀 문자 : \n");
				bw.flush();
				int input5 = System.in.read(bytes);
				String input2_5 = new String(bytes,0,input5-2);
				
				books[bNo] = books[bNo].replace(input2_4, input2_5);
				bw.write(books[bNo]+"\n");
				bw.flush();
			}
			else if(input1.equals("3")) {
				bw.write("메세지)) 프로그램으 종료합니다.");
				bw.flush();
				bw.close();
				break;
			}
			else {
				bw.write("메세지)) 존재하지 않는 메뉴 입니다.");
				bw.flush();
			}
		}
	}
}
