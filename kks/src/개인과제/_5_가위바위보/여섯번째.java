package 개인과제._5_가위바위보;

import java.util.Random; 	//랜덤 객체 임폴트
import java.util.Scanner;	//입력 객체 임폴트

public class 여섯번째 {// 메인 클래스
	public static void main(String[] args) {//메인 메소드
		//입력객객체 선언
		Scanner scanner = new Scanner(System.in);
		//난수객체 선언
		Random random = new Random();
		
		//변수 준비
		int player;		//플레이어 입력
		int com;		//컴퓨터 난수
		int game = 0;	//게임횟수 선언 하고 0으로 초기화
		int pw =0;		//pw 플레이어승리 횟수
		int cw =0;		//cw 컴퓨터 승리 횟수
		
		while(true) {//무한반복문 종료조건 없음
			System.out.println("가위바위보게임))");
			System.out.println("0)가위 1)바위 2)보 3)종료 및결과");
			System.out.print("입력 :");
			player = scanner.nextInt();		//플레이어 입력받기
			com = random.nextInt(3);		//컴퓨터 3까지의 난수생성
			
			if(player == 3) {// 3을 입력했을경우 종료및 결과 표시
				System.out.println("게임결과))");
				System.out.println("총 게임 횟수 : " + game);
				if(pw > cw) {//플레이어승이 컴퓨터 승보다 많을때
					System.out.println("플레이어 승리 이긴횟수 :" +pw);
				}
				else if (pw < cw) {//플레이어 승이 컴퓨터 보다 적을때
					System.out.println("컴퓨터 승리 이긴횟수 : "+ cw);
				}
				else {//그외는 무승부표시
					System.out.println("무승부 입니다");
				}
				break;
			}
			else if(player >= 0 && player <= 2) {//플레이어가 입력하는수가 0보다 같거나 크고 2보다 같거나 작을때
				//플레이억가 0이면서 컴퓨터는1 이거나 플레이어가 1이면서 컴퓨터는 0 이거나 플레이어가 2이면서 컴퓨터가 0일때
				if(player == 0 && com == 1 || player == 1 && com == 0 || player == 2 && com == 0 ) {
					System.out.println("플레이어 승리");
					pw++;//플레이어 승리를 추가해줌
				}
				//플레이어가 입력한수와 컴퓨터가 입력된 수가 같을경우 무승부
				else if(player ==0 && com ==0 || player == 1 && com == 1 || player == 2 && com == 2) {
					System.out.println("무승부 입니다/");
				}
				else {//그외라면 컴퓨터 승리
					System.out.println("컴퓨터 승리");
					cw++;//컴퓨터 승리를 추가해줌
				}
				game++;//게임횟수 추가
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
