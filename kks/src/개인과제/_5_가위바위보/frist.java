package 개인과제._5_가위바위보;

import java.util.Random;
import java.util.Scanner;

public class frist {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int player;
		int com;
		int game = 0;
		int playerwin = 0;
		int comwin = 0;
		
		Random random = new Random();
		
		while(true) {
			
			System.out.println("가위바위보))");
			System.out.print("0)가위 1)바위 2)보 3)종료 입력:");
			player = scanner.nextInt();
			
			com = random.nextInt(3);
			
			if(player == 3) {
				System.out.println("게임결과))");
				System.out.printf("총게임횟수 : %d\n", game);
				if(playerwin > comwin) {
					System.out.printf("최종승리자 : 플레이어 (승리횟수 : %d)",playerwin);
				}
				else if(playerwin < comwin) {
					System.out.printf("최종승리자 : 컴퓨터 (승리횟수 : %d)",comwin);
				}
				else {
					System.out.println("알림)) 무승부");
				}
				break;
			}
			else if(player >= 0 && player <= 2) {
				if(player == 0 && com == 2 || player == 1 && com ==0 || player == 2 && com == 1) {
					System.out.println("알림)) 플레이어 승리");
					playerwin ++;
				}
				else if(player == 0 && com == 0 || player == 1 && com == 1 || player == 2 && com == 2) {
					System.out.println("알림)) 무승부");
				}
				else {
					System.out.println("알림)) 컴퓨터 승리");
					comwin++;
				}
				game++;
			}
			else {
				System.out.println("알림)) 존재하지 않는 항목입니다.");
			}

		}
	}
}
