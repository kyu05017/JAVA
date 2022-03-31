package 개인과제._07_틱텍톡;

import java.util.Random;
import java.util.Scanner;

public class 다섯번째 {
	public static void main(String[] args) {
		
		//입력과 난수 클래스 생성
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//변수 준비
		// 게임판 만큼의 변수를 선언
		String[] pad = {"[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
		// 승리할경우의 변수를 미리 선언 초기화
		String win = "";
		// 나의 말을 미리 선언
		String my = "[o]";
		// 컴퓨터의 말을 미리 선언
		String com = "[x]";
		//컴퓨터의 턴횟수를 저장
		int count = 0;
		
		while(true) {//무한 반복 = 종료조건은 게임 승부가 나면
			for(int i =0; i < pad.length; i++) {
				//i가 = 일때 게임 패드의 수만큼까지 1씩증가 반복
				System.out.print(pad[i]);
				//게임패드를 표시
				if(i%3==2)System.out.println();
				//i를 3으로 나눈 나머지가 2일때 줄바꿈
			}
			while(true) {//무한 반복 = 종료조건 자리선점시
				System.out.println("자리 선점");
				int p = scanner.nextInt();//위치를 정수로 입력
				if(pad[p].equals("[ ]")) {//빈칸이 있으면 내 말을 대입하고 종료
					pad[p] = my;
					break;
				}
				else {//아니라면 경고메세지 출력
					System.out.println("이미 선점된 자리 입니다.");
				}
			}
			while(true) {//무한반복 - 종료조건 컴퓨터가 말을 놓을경우
				int cp = random.nextInt(9);
				if(pad[cp].equals("[ ]")) {//빈칸이 있으면 컴퓨터 말을 대입하고 종료
					pad[cp] = com;
					count++;//컴퓨터 턴횟수 증가
					break;
				}
			}
			//가로일때의 승리
			//i가 6보다 같거나 작을때 까지 증가 
			for(int i = 0; i <= 6; i++) {
				//패드의 i가 0일경우 1과 2가 동일하면 승리를 대입
				if(pad[i].equals(pad[i+1]) && pad[i+1].equals(pad[i+2])) {
					win = pad[i];
				}
			}
			//세로일때 승리
			//i가 2보다 같거나 작을때 까지 증가 
			for(int i =0; i <=2; i++) {
				//패드의 i가 0일경우 3과 6이 동일하면 승리를 대입
				if(pad[i].equals(pad[i+3]) && pad[i+3].equals(pad[i+6])) {
					win = pad[i];
				}
			}
			//패드의 0 과 4 그리고 8이 동일하다면 승리에 대입
			if(pad[0].equals(pad[4]) && pad[4].equals(pad[8])) {
				win = pad[0];
			}
			//패드의 2와 4 그리고 6이 동일하다면 승리에 대입
			if(pad[2].equals(pad[4]) && pad[4].equals(pad[6])) {
				win = pad[2];
			}
			//boolean 값을 선언
			boolean draw = false;
			//컴퓨터의 턴수가 4가 되었을때 게임이 승리하거나 패하지 않았으면
			// draw값에 참을줌
			if(count == 4) {
				draw = true;
			}
			
			//win에 내말이 있으면 내가승리 후 종료
			if(win.equals(my)) {
				System.out.println("플레이어 승리");
				break;
			}
			//win에 컴퓨터 말이 있으면 컴퓨터 승리 후 종료
			if(win.equals(com)) {
				System.out.println("컴퓨터 승리");
				break;
			}
			//draw값이 참이라면 무승부 후 종료
			if(draw) {
				System.out.println("무승부");
				break;
			}
		}
		//저장된 게임판을 보여줌
		for(int i = 0; i < pad.length; i++) {
			System.out.print(pad[i]);
			if(i%3==2)System.out.println();
		}
	}
}

