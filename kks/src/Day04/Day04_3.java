package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 {//c s

	public static void main(String[] args) {//m s
		// 문제 가위바위보
		//1.사용자에게 가위[0]바위[1]보[2]를 입력받는다.
		//2.컴퓨터는 난수를 발생 [0~2]
		//3.사용자와 컴퓨터중 승이자 판단
		//4.3번 선택하기 전까지 게임 실행
		//5.3번 선택시 
			//1.총게임수
			//2.최종승리
		
		//준비
		int player;		//사용자가 선택한 수 저장
		int computer;	//컴퓨터가 난수를 생성한 수 저장
		int game = 0;		//총 가위바위 실행 횟수 저장
		int playerWin = 0; int computerWin = 0;	// 각각의 승리수
		int same = 0;
		//입력객체
		Scanner scanner = new Scanner(System.in);
		
		while(true) {// 프로그램 실행 [ 종료 조건 : 3번을 누르면 종료(break)]
			System.out.println("---------------가위바위보게임---------------");
			System.out.println("[0 가위], [1 바위], [2 보],[3 종료]");
			System.out.println("선택 : ");
			player = scanner.nextInt();// 입력한 수를 저장
			
			Random random = new Random();	// 난수 객체 선언
			computer = random.nextInt(3);	// 난수를 int형으로 가져온다
							//random.nextInt(숫자) => 0~숫자전 까지 범위내 난수 발생	
								//random.nextInt(10) : 0 ~ 9 까지 난수 발생
								//rnadom.nextInt(11) + 10 : 10~20 중 난수 발생
	
			
			if(player == computer) {
				System.out.println("비겻습니다.");
				game+=1;
				same+=1;
			}
			else if((player == 0 && computer == 2) || (player == 1 && computer == 0) || (player == 2 && computer == 1)) {
				System.out.println("당신이 이겼습니다");
				System.out.println(" 플레이어가 낸수 : " + player);
				System.out.println(" 컴퓨터가 낸수 : " + computer);
				playerWin +=1;
				game+=1;
			}
			else if((computer == 1 && player == 0) || (computer == 0 && player == 2) || (computer == 2 && player == 1)) {
				System.out.println("당신이 졌습니다");
				System.out.println(" 플레이어가 낸수 : " + player);
				System.out.println(" 컴퓨터가 낸수 : " + computer);
				computerWin +=1;
				game+=1;
			}

			else if(player == 3) {
				System.out.println("-----전적-----");
				System.out.println("총 게임수 : " + game);
				System.out.println("비긴 횟수  :" + same);
				System.out.println("당신의 승리 :" + playerWin);
				System.out.println("컴퓨터 승리 :" + computerWin);
				System.out.println("-----최종승리-----");
				if(playerWin > computerWin) {
					System.out.println("당신이 이겼습니다.");
				} 
				else {
					System.out.println("컴퓨터가 이겼습니다.");
				}
				break;
			}
			else {
				
			}

		}
		
		
	}//s e

}// c e
