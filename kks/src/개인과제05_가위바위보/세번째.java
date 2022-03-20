package 개인과제05_가위바위보;

import java.util.Random;
import java.util.Scanner;

public class 세번째 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int player;
		int com;
		int game = 0;
		int playerwin = 0;
		int comwin = 0;
		
		while(true) {
			System.out.println("가위바위보))");
			System.out.println("0)가위 1)바위 2)보 3)종료및 결과");
			System.out.print("입력 :");
			player = scanner.nextInt();
			com = random.nextInt(3);
			
			if(player == 3) {
				System.out.println("알림)) 게임종료");
				System.out.printf("게임횟수 : %d" ,game);
				if(playerwin > comwin) {
					System.out.printf("플레이어 승리 이긴횟수 : %d",playerwin);
				}
				else if(playerwin < comwin ) {
					System.out.printf("컴퓨터 승리 이긴횟수 : %d",comwin);
				}
			}
			else if(player >= 0 && player <= 0) {
				if(player == 0 && com == 2 || player == 1 && com == 0|| player == 2 && com == 1) {
					System.out.println("플레이어 승리");
					playerwin++;
					
				}
				else if(player == 0 && com == 0 || player == 1 && com == 1 || player == 2 && com == 2) {
					System.out.println("무승부 입니다");
				}
				else {
					System.out.println("컴퓨터 승리");
					comwin ++;
				}
				game ++;
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
