package 개인과제._05_가위바위보;

import java.util.Random;
import java.util.Scanner;

public class 두번째 {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		Random random = new Random();
		
		int player;
		int com;
		int game = 0;
		int playerwin = 0;
		int comwin = 0;
		
		while(true) {
			System.out.println("가위바이보게임))");
			System.out.println("0)가위 1)바위 2)보 3)결과 및 종료");
			
			player = scanner.nextInt();
			com = random.nextInt(3);
			
			if(player == 3) {
				System.out.println("결과))");
				System.out.printf("게임 횟수 : %d",game);
				if(playerwin > comwin) {
					System.out.println("플레이어승");
				}
				else if(playerwin < comwin) {
					System.out.println("컴퓨터 승");
				}
				else {
					System.out.println("무승부");
				}
				break;
			}
			else if(player >= 0 && player <= 2) {
				if(player == 0 && com ==2 || player == 1 && com == 0 || player == 2 && com == 1) {
					System.out.println("플레이어 승리");
					playerwin ++;
				}
				else if(player == 0 && com == 0 || player == 1 && com == 1|| player ==2 && com ==2) {
					System.out.println("무승부");
				}
				else {
					System.out.println("컴퓨터 승리");
					comwin++;
				}
				game++;
			}
			else {
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
		}
	}
}
